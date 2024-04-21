package main

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	// "github.com/unstoppablemango/pulumi-commandx/sdk/commandx"
)

func main() {
	pulumi.Run(func(ctx *pulumi.Context) error {
		// rootCa, err := commandx.NewRootCa("simple", &commandx.NewRootCaArgs{
		// 	Algorithm:          commandx.AlgorithmRSA,
		// 	ValidityPeriodOurs: pulumi.Int(256),
		// })
		// if err != nil {
		// 	return err
		// }

		return nil
	})
}
