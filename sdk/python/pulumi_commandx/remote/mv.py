# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *
import pulumi_command

__all__ = ['MvArgs', 'Mv']

@pulumi.input_type
class MvArgs:
    def __init__(__self__, *,
                 connection: pulumi.Input['pulumi_command.remote.ConnectionArgs'],
                 binary_path: Optional[pulumi.Input[str]] = None,
                 create: Optional[Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']]] = None,
                 delete: Optional[Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']]] = None,
                 environment: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 stdin: Optional[pulumi.Input[str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[Any]]] = None,
                 update: Optional[Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']]] = None):
        """
        The set of arguments for constructing a Mv resource.
        :param pulumi.Input['pulumi_command.remote.ConnectionArgs'] connection: Connection details for the remote system
        :param pulumi.Input[str] binary_path: Path to the binary on the remote system. If omitted, the tool is assumed to be on $PATH
        :param Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']] create: The command to run on create.
        :param Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']] delete: The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
               and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
               Command resource from previous create or update steps.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] environment: Environment variables
        :param pulumi.Input[str] stdin: TODO
        :param pulumi.Input[Sequence[Any]] triggers: TODO
        :param Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']] update: The command to run on update, if empty, create will 
               run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR 
               are set to the stdout and stderr properties of the Command resource from previous 
               create or update steps.
        """
        pulumi.set(__self__, "connection", connection)
        if binary_path is not None:
            pulumi.set(__self__, "binary_path", binary_path)
        if create is not None:
            pulumi.set(__self__, "create", create)
        if delete is not None:
            pulumi.set(__self__, "delete", delete)
        if environment is not None:
            pulumi.set(__self__, "environment", environment)
        if stdin is not None:
            pulumi.set(__self__, "stdin", stdin)
        if triggers is not None:
            pulumi.set(__self__, "triggers", triggers)
        if update is not None:
            pulumi.set(__self__, "update", update)

    @property
    @pulumi.getter
    def connection(self) -> pulumi.Input['pulumi_command.remote.ConnectionArgs']:
        """
        Connection details for the remote system
        """
        return pulumi.get(self, "connection")

    @connection.setter
    def connection(self, value: pulumi.Input['pulumi_command.remote.ConnectionArgs']):
        pulumi.set(self, "connection", value)

    @property
    @pulumi.getter(name="binaryPath")
    def binary_path(self) -> Optional[pulumi.Input[str]]:
        """
        Path to the binary on the remote system. If omitted, the tool is assumed to be on $PATH
        """
        return pulumi.get(self, "binary_path")

    @binary_path.setter
    def binary_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "binary_path", value)

    @property
    @pulumi.getter
    def create(self) -> Optional[Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']]]:
        """
        The command to run on create.
        """
        return pulumi.get(self, "create")

    @create.setter
    def create(self, value: Optional[Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']]]):
        pulumi.set(self, "create", value)

    @property
    @pulumi.getter
    def delete(self) -> Optional[Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']]]:
        """
        The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
        and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
        Command resource from previous create or update steps.
        """
        return pulumi.get(self, "delete")

    @delete.setter
    def delete(self, value: Optional[Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']]]):
        pulumi.set(self, "delete", value)

    @property
    @pulumi.getter
    def environment(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Environment variables
        """
        return pulumi.get(self, "environment")

    @environment.setter
    def environment(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "environment", value)

    @property
    @pulumi.getter
    def stdin(self) -> Optional[pulumi.Input[str]]:
        """
        TODO
        """
        return pulumi.get(self, "stdin")

    @stdin.setter
    def stdin(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "stdin", value)

    @property
    @pulumi.getter
    def triggers(self) -> Optional[pulumi.Input[Sequence[Any]]]:
        """
        TODO
        """
        return pulumi.get(self, "triggers")

    @triggers.setter
    def triggers(self, value: Optional[pulumi.Input[Sequence[Any]]]):
        pulumi.set(self, "triggers", value)

    @property
    @pulumi.getter
    def update(self) -> Optional[Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']]]:
        """
        The command to run on update, if empty, create will 
        run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR 
        are set to the stdout and stderr properties of the Command resource from previous 
        create or update steps.
        """
        return pulumi.get(self, "update")

    @update.setter
    def update(self, value: Optional[Union[pulumi.Input[str], pulumi.Input['MvOptsArgs']]]):
        pulumi.set(self, "update", value)


class Mv(pulumi.ComponentResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 binary_path: Optional[pulumi.Input[str]] = None,
                 connection: Optional[pulumi.Input[pulumi.InputType['pulumi_command.remote.ConnectionArgs']]] = None,
                 create: Optional[Union[pulumi.Input[str], pulumi.Input[pulumi.InputType['MvOptsArgs']]]] = None,
                 delete: Optional[Union[pulumi.Input[str], pulumi.Input[pulumi.InputType['MvOptsArgs']]]] = None,
                 environment: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 stdin: Optional[pulumi.Input[str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[Any]]] = None,
                 update: Optional[Union[pulumi.Input[str], pulumi.Input[pulumi.InputType['MvOptsArgs']]]] = None,
                 __props__=None):
        """
        Abstraction over the `mv` utility on a remote system.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] binary_path: Path to the binary on the remote system. If omitted, the tool is assumed to be on $PATH
        :param pulumi.Input[pulumi.InputType['pulumi_command.remote.ConnectionArgs']] connection: Connection details for the remote system
        :param Union[pulumi.Input[str], pulumi.Input[pulumi.InputType['MvOptsArgs']]] create: The command to run on create.
        :param Union[pulumi.Input[str], pulumi.Input[pulumi.InputType['MvOptsArgs']]] delete: The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
               and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
               Command resource from previous create or update steps.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] environment: Environment variables
        :param pulumi.Input[str] stdin: TODO
        :param pulumi.Input[Sequence[Any]] triggers: TODO
        :param Union[pulumi.Input[str], pulumi.Input[pulumi.InputType['MvOptsArgs']]] update: The command to run on update, if empty, create will 
               run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR 
               are set to the stdout and stderr properties of the Command resource from previous 
               create or update steps.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MvArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Abstraction over the `mv` utility on a remote system.

        :param str resource_name: The name of the resource.
        :param MvArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MvArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 binary_path: Optional[pulumi.Input[str]] = None,
                 connection: Optional[pulumi.Input[pulumi.InputType['pulumi_command.remote.ConnectionArgs']]] = None,
                 create: Optional[Union[pulumi.Input[str], pulumi.Input[pulumi.InputType['MvOptsArgs']]]] = None,
                 delete: Optional[Union[pulumi.Input[str], pulumi.Input[pulumi.InputType['MvOptsArgs']]]] = None,
                 environment: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 stdin: Optional[pulumi.Input[str]] = None,
                 triggers: Optional[pulumi.Input[Sequence[Any]]] = None,
                 update: Optional[Union[pulumi.Input[str], pulumi.Input[pulumi.InputType['MvOptsArgs']]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is not None:
            raise ValueError('ComponentResource classes do not support opts.id')
        else:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MvArgs.__new__(MvArgs)

            __props__.__dict__["binary_path"] = binary_path
            if connection is None and not opts.urn:
                raise TypeError("Missing required property 'connection'")
            __props__.__dict__["connection"] = connection
            __props__.__dict__["create"] = create
            __props__.__dict__["delete"] = delete
            __props__.__dict__["environment"] = environment
            __props__.__dict__["stdin"] = stdin
            __props__.__dict__["triggers"] = triggers
            __props__.__dict__["update"] = update
            __props__.__dict__["command"] = None
            __props__.__dict__["stderr"] = None
            __props__.__dict__["stdout"] = None
        super(Mv, __self__).__init__(
            'commandx:remote:Mv',
            resource_name,
            __props__,
            opts,
            remote=True)

    @property
    @pulumi.getter(name="binaryPath")
    def binary_path(self) -> pulumi.Output[str]:
        """
        Path to the binary on the remote system. If omitted, the tool is assumed to be on $PATH
        """
        return pulumi.get(self, "binary_path")

    @property
    @pulumi.getter
    def command(self) -> pulumi.Output['pulumi_command.remote.Command']:
        """
        The underlying command
        """
        return pulumi.get(self, "command")

    @property
    @pulumi.getter
    def connection(self) -> pulumi.Output['pulumi_command.remote.outputs.Connection']:
        """
        Connection details for the remote system
        """
        return pulumi.get(self, "connection")

    @property
    @pulumi.getter
    def create(self) -> pulumi.Output[Optional[Any]]:
        """
        The command to run on create.
        """
        return pulumi.get(self, "create")

    @property
    @pulumi.getter
    def delete(self) -> pulumi.Output[Optional[Any]]:
        """
        The command to run on delete. The environment variables PULUMI_COMMAND_STDOUT
        and PULUMI_COMMAND_STDERR are set to the stdout and stderr properties of the
        Command resource from previous create or update steps.
        """
        return pulumi.get(self, "delete")

    @property
    @pulumi.getter
    def environment(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Environment variables
        """
        return pulumi.get(self, "environment")

    @property
    @pulumi.getter
    def stderr(self) -> pulumi.Output[str]:
        """
        TODO
        """
        return pulumi.get(self, "stderr")

    @property
    @pulumi.getter
    def stdin(self) -> pulumi.Output[Optional[str]]:
        """
        TODO
        """
        return pulumi.get(self, "stdin")

    @property
    @pulumi.getter
    def stdout(self) -> pulumi.Output[str]:
        """
        TODO
        """
        return pulumi.get(self, "stdout")

    @property
    @pulumi.getter
    def triggers(self) -> pulumi.Output[Sequence[Any]]:
        """
        TODO
        """
        return pulumi.get(self, "triggers")

    @property
    @pulumi.getter
    def update(self) -> pulumi.Output[Optional[Any]]:
        """
        The command to run on update, if empty, create will 
        run again. The environment variables PULUMI_COMMAND_STDOUT and PULUMI_COMMAND_STDERR 
        are set to the stdout and stderr properties of the Command resource from previous 
        create or update steps.
        """
        return pulumi.get(self, "update")

