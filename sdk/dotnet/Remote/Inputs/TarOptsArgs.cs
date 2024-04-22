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
    /// Abstraction over the `tar` utility on a remote system.
    /// </summary>
    public sealed class TarOptsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Corresponds to the [ARCHIVE] argument.
        /// </summary>
        [Input("archive", required: true)]
        public Input<string> Archive { get; set; } = null!;

        /// <summary>
        /// Corresponds to the `--directory` option.
        /// </summary>
        [Input("directory")]
        public Input<string>? Directory { get; set; }

        /// <summary>
        /// Corresponds to the `--extract` option.
        /// </summary>
        [Input("extract")]
        public Input<bool>? Extract { get; set; }

        [Input("files")]
        private InputList<string>? _files;

        /// <summary>
        /// Corresponds to the [FILE] argument.
        /// </summary>
        public InputList<string> Files
        {
            get => _files ?? (_files = new InputList<string>());
            set => _files = value;
        }

        /// <summary>
        /// Corresponds to the `--gzip` option.
        /// </summary>
        [Input("gzip")]
        public Input<bool>? Gzip { get; set; }

        /// <summary>
        /// Whether rm should be run when the resource is created or deleted.
        /// </summary>
        [Input("onDelete")]
        public Input<bool>? OnDelete { get; set; }

        /// <summary>
        /// Corresponds to the `--recursive` option.
        /// </summary>
        [Input("recursive")]
        public Input<bool>? Recursive { get; set; }

        /// <summary>
        /// Corresponds to the `--strip-components` option.
        /// </summary>
        [Input("stripComponents")]
        public Input<int>? StripComponents { get; set; }

        public TarOptsArgs()
        {
        }
        public static new TarOptsArgs Empty => new TarOptsArgs();
    }
}
