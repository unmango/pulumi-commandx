// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package remote

import (
	"context"
	"reflect"

	"errors"
	"github.com/UnstoppableMango/pulumi-commandx/sdk/go/commandx/internal"
	"github.com/pulumi/pulumi-command/sdk/go/command/remote"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Abstraction over the `rm` utility on a remote system.
type Tee struct {
	pulumi.ResourceState

	// Path to the binary on the remote system. If omitted, the tool is assumed to be on $PATH
	BinaryPath pulumi.StringOutput `pulumi:"binaryPath"`
	// The underlying command
	Command remote.CommandOutput `pulumi:"command"`
	// Connection details for the remote system
	Connection remote.ConnectionOutput `pulumi:"connection"`
	// The command to run on create.
	Create pulumi.AnyOutput `pulumi:"create"`
	// The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
	// and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
	// Command resource from previous create or update steps.
	Delete pulumi.AnyOutput `pulumi:"delete"`
	// Environment variables
	Environment pulumi.StringMapOutput `pulumi:"environment"`
	// TODO
	Stderr pulumi.StringOutput `pulumi:"stderr"`
	// TODO
	Stdin pulumi.StringPtrOutput `pulumi:"stdin"`
	// TODO
	Stdout pulumi.StringOutput `pulumi:"stdout"`
	// TODO
	Triggers pulumi.ArrayOutput `pulumi:"triggers"`
	// The command to run on update, if empty, create will
	// run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR
	// are set to the stdout and stderr properties of the Command resource from previous
	// create or update steps.
	Update pulumi.AnyOutput `pulumi:"update"`
}

// NewTee registers a new resource with the given unique name, arguments, and options.
func NewTee(ctx *pulumi.Context,
	name string, args *TeeArgs, opts ...pulumi.ResourceOption) (*Tee, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Connection == nil {
		return nil, errors.New("invalid value for required argument 'Connection'")
	}
	args.Connection = args.Connection.ToConnectionOutput().ApplyT(func(v remote.Connection) remote.Connection { return *v.Defaults() }).(remote.ConnectionOutput)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Tee
	err := ctx.RegisterRemoteComponentResource("commandx:remote:Tee", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type teeArgs struct {
	// Path to the binary on the remote system. If omitted, the tool is assumed to be on $PATH
	BinaryPath *string `pulumi:"binaryPath"`
	// Connection details for the remote system
	Connection remote.Connection `pulumi:"connection"`
	// The command to run on create.
	Create interface{} `pulumi:"create"`
	// The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
	// and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
	// Command resource from previous create or update steps.
	Delete interface{} `pulumi:"delete"`
	// Environment variables
	Environment map[string]string `pulumi:"environment"`
	// TODO
	Stdin *string `pulumi:"stdin"`
	// TODO
	Triggers []interface{} `pulumi:"triggers"`
	// The command to run on update, if empty, create will
	// run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR
	// are set to the stdout and stderr properties of the Command resource from previous
	// create or update steps.
	Update interface{} `pulumi:"update"`
}

// The set of arguments for constructing a Tee resource.
type TeeArgs struct {
	// Path to the binary on the remote system. If omitted, the tool is assumed to be on $PATH
	BinaryPath pulumi.StringPtrInput
	// Connection details for the remote system
	Connection remote.ConnectionInput
	// The command to run on create.
	Create interface{}
	// The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
	// and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
	// Command resource from previous create or update steps.
	Delete interface{}
	// Environment variables
	Environment pulumi.StringMapInput
	// TODO
	Stdin pulumi.StringPtrInput
	// TODO
	Triggers pulumi.ArrayInput
	// The command to run on update, if empty, create will
	// run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR
	// are set to the stdout and stderr properties of the Command resource from previous
	// create or update steps.
	Update interface{}
}

func (TeeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teeArgs)(nil)).Elem()
}

type TeeInput interface {
	pulumi.Input

	ToTeeOutput() TeeOutput
	ToTeeOutputWithContext(ctx context.Context) TeeOutput
}

func (*Tee) ElementType() reflect.Type {
	return reflect.TypeOf((**Tee)(nil)).Elem()
}

func (i *Tee) ToTeeOutput() TeeOutput {
	return i.ToTeeOutputWithContext(context.Background())
}

func (i *Tee) ToTeeOutputWithContext(ctx context.Context) TeeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeeOutput)
}

// TeeArrayInput is an input type that accepts TeeArray and TeeArrayOutput values.
// You can construct a concrete instance of `TeeArrayInput` via:
//
//	TeeArray{ TeeArgs{...} }
type TeeArrayInput interface {
	pulumi.Input

	ToTeeArrayOutput() TeeArrayOutput
	ToTeeArrayOutputWithContext(context.Context) TeeArrayOutput
}

type TeeArray []TeeInput

func (TeeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tee)(nil)).Elem()
}

func (i TeeArray) ToTeeArrayOutput() TeeArrayOutput {
	return i.ToTeeArrayOutputWithContext(context.Background())
}

func (i TeeArray) ToTeeArrayOutputWithContext(ctx context.Context) TeeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeeArrayOutput)
}

// TeeMapInput is an input type that accepts TeeMap and TeeMapOutput values.
// You can construct a concrete instance of `TeeMapInput` via:
//
//	TeeMap{ "key": TeeArgs{...} }
type TeeMapInput interface {
	pulumi.Input

	ToTeeMapOutput() TeeMapOutput
	ToTeeMapOutputWithContext(context.Context) TeeMapOutput
}

type TeeMap map[string]TeeInput

func (TeeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tee)(nil)).Elem()
}

func (i TeeMap) ToTeeMapOutput() TeeMapOutput {
	return i.ToTeeMapOutputWithContext(context.Background())
}

func (i TeeMap) ToTeeMapOutputWithContext(ctx context.Context) TeeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeeMapOutput)
}

type TeeOutput struct{ *pulumi.OutputState }

func (TeeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tee)(nil)).Elem()
}

func (o TeeOutput) ToTeeOutput() TeeOutput {
	return o
}

func (o TeeOutput) ToTeeOutputWithContext(ctx context.Context) TeeOutput {
	return o
}

// Path to the binary on the remote system. If omitted, the tool is assumed to be on $PATH
func (o TeeOutput) BinaryPath() pulumi.StringOutput {
	return o.ApplyT(func(v *Tee) pulumi.StringOutput { return v.BinaryPath }).(pulumi.StringOutput)
}

// The underlying command
func (o TeeOutput) Command() remote.CommandOutput {
	return o.ApplyT(func(v *Tee) remote.CommandOutput { return v.Command }).(remote.CommandOutput)
}

// Connection details for the remote system
func (o TeeOutput) Connection() remote.ConnectionOutput {
	return o.ApplyT(func(v *Tee) remote.ConnectionOutput { return v.Connection }).(remote.ConnectionOutput)
}

// The command to run on create.
func (o TeeOutput) Create() pulumi.AnyOutput {
	return o.ApplyT(func(v *Tee) pulumi.AnyOutput { return v.Create }).(pulumi.AnyOutput)
}

// The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
// and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
// Command resource from previous create or update steps.
func (o TeeOutput) Delete() pulumi.AnyOutput {
	return o.ApplyT(func(v *Tee) pulumi.AnyOutput { return v.Delete }).(pulumi.AnyOutput)
}

// Environment variables
func (o TeeOutput) Environment() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Tee) pulumi.StringMapOutput { return v.Environment }).(pulumi.StringMapOutput)
}

// TODO
func (o TeeOutput) Stderr() pulumi.StringOutput {
	return o.ApplyT(func(v *Tee) pulumi.StringOutput { return v.Stderr }).(pulumi.StringOutput)
}

// TODO
func (o TeeOutput) Stdin() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tee) pulumi.StringPtrOutput { return v.Stdin }).(pulumi.StringPtrOutput)
}

// TODO
func (o TeeOutput) Stdout() pulumi.StringOutput {
	return o.ApplyT(func(v *Tee) pulumi.StringOutput { return v.Stdout }).(pulumi.StringOutput)
}

// TODO
func (o TeeOutput) Triggers() pulumi.ArrayOutput {
	return o.ApplyT(func(v *Tee) pulumi.ArrayOutput { return v.Triggers }).(pulumi.ArrayOutput)
}

// The command to run on update, if empty, create will
// run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR
// are set to the stdout and stderr properties of the Command resource from previous
// create or update steps.
func (o TeeOutput) Update() pulumi.AnyOutput {
	return o.ApplyT(func(v *Tee) pulumi.AnyOutput { return v.Update }).(pulumi.AnyOutput)
}

type TeeArrayOutput struct{ *pulumi.OutputState }

func (TeeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tee)(nil)).Elem()
}

func (o TeeArrayOutput) ToTeeArrayOutput() TeeArrayOutput {
	return o
}

func (o TeeArrayOutput) ToTeeArrayOutputWithContext(ctx context.Context) TeeArrayOutput {
	return o
}

func (o TeeArrayOutput) Index(i pulumi.IntInput) TeeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Tee {
		return vs[0].([]*Tee)[vs[1].(int)]
	}).(TeeOutput)
}

type TeeMapOutput struct{ *pulumi.OutputState }

func (TeeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tee)(nil)).Elem()
}

func (o TeeMapOutput) ToTeeMapOutput() TeeMapOutput {
	return o
}

func (o TeeMapOutput) ToTeeMapOutputWithContext(ctx context.Context) TeeMapOutput {
	return o
}

func (o TeeMapOutput) MapIndex(k pulumi.StringInput) TeeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Tee {
		return vs[0].(map[string]*Tee)[vs[1].(string)]
	}).(TeeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeeInput)(nil)).Elem(), &Tee{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeeArrayInput)(nil)).Elem(), TeeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeeMapInput)(nil)).Elem(), TeeMap{})
	pulumi.RegisterOutputType(TeeOutput{})
	pulumi.RegisterOutputType(TeeArrayOutput{})
	pulumi.RegisterOutputType(TeeMapOutput{})
}