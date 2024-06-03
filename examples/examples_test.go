package examples

import (
	"context"
	"os"
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
	"github.com/stretchr/testify/require"
)

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	result := integration.ProgramTestOptions{
		LocalProviders: []integration.LocalDependency{{
			Package: "commandx",
			Path:    path.Join(getCwd(t), "..", "bin"),
		}},
	}

	pulumiBin := path.Join(getCwd(t), "..", ".pulumi", "bin", "pulumi")
	if _, err := os.Stat(pulumiBin); err == nil {
		result.Bin = pulumiBin
	}

	return result
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func skipIfShort(t *testing.T) {
	if testing.Short() {
		t.Skip("skipping long-running test in short mode")
	}
}

type node struct {
	Server SshServer
	Port   string
}

func (n node) ReadFile(t *testing.T, file string) string {
	result, err := n.Server.ReadFile(context.Background(), file)
	require.NoError(t, err, "failed to read file")
	return result
}

func newNode(t *testing.T, opts ...SshServerOption) node {
	server, err := StartSshServer(context.Background(), opts...)
	require.NoError(t, err, "failed to start ssh server")

	t.Cleanup(func() {
		err := StopSshServer(context.Background(), server)
		require.NoError(t, err)
	})

	port, err := server.Port(context.Background())
	require.NoError(t, err, "failed to get container port")

	return node{Server: server, Port: port}
}
