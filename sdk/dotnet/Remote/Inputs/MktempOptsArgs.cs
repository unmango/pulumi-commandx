// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UnMango.Commandx.Remote.Inputs
{

    /// <summary>
    /// Abstraction over the `mktemp` utility on a remote system.
    /// </summary>
    public sealed class MktempOptsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Corresponds to the `--directory` option.
        /// </summary>
        [Input("directory")]
        public Input<bool>? Directory { get; set; }

        /// <summary>
        /// Corresponds to the `--dry-run` option.
        /// </summary>
        [Input("dryRun")]
        public Input<bool>? DryRun { get; set; }

        /// <summary>
        /// Corresponds to the `--quiet` option.
        /// </summary>
        [Input("quiet")]
        public Input<bool>? Quiet { get; set; }

        /// <summary>
        /// Corresponds to the `--suffix` option.
        /// </summary>
        [Input("suffix")]
        public Input<string>? Suffix { get; set; }

        /// <summary>
        /// Corresponds to the [TEMPLATE] argument.
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        /// <summary>
        /// Corresponds to the `--tmpdir` option.
        /// </summary>
        [Input("tmpdir")]
        public Input<string>? Tmpdir { get; set; }

        public MktempOptsArgs()
        {
        }
        public static new MktempOptsArgs Empty => new MktempOptsArgs();
    }
}
