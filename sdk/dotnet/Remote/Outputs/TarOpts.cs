// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UnMango.Commandx.Remote.Outputs
{

    /// <summary>
    /// Abstraction over the `tar` utility on a remote system.
    /// </summary>
    [OutputType]
    public sealed class TarOpts
    {
        /// <summary>
        /// Corresponds to the [ARCHIVE] argument.
        /// </summary>
        public readonly string Archive;
        /// <summary>
        /// Corresponds to the `--directory` option.
        /// </summary>
        public readonly string? Directory;
        /// <summary>
        /// Corresponds to the `--extract` option.
        /// </summary>
        public readonly bool? Extract;
        /// <summary>
        /// Corresponds to the [FILE] argument.
        /// </summary>
        public readonly ImmutableArray<string> Files;
        /// <summary>
        /// Corresponds to the `--gzip` option.
        /// </summary>
        public readonly bool? Gzip;
        /// <summary>
        /// Whether rm should be run when the resource is created or deleted.
        /// </summary>
        public readonly bool? OnDelete;
        /// <summary>
        /// Corresponds to the `--recursive` option.
        /// </summary>
        public readonly bool? Recursive;
        /// <summary>
        /// Corresponds to the `--strip-components` option.
        /// </summary>
        public readonly int? StripComponents;

        [OutputConstructor]
        private TarOpts(
            string archive,

            string? directory,

            bool? extract,

            ImmutableArray<string> files,

            bool? gzip,

            bool? onDelete,

            bool? recursive,

            int? stripComponents)
        {
            Archive = archive;
            Directory = directory;
            Extract = extract;
            Files = files;
            Gzip = gzip;
            OnDelete = onDelete;
            Recursive = recursive;
            StripComponents = stripComponents;
        }
    }
}
