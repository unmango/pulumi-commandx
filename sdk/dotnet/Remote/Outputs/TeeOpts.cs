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
    /// Abstraction over the `rm` utility on a remote system.
    /// </summary>
    [OutputType]
    public sealed class TeeOpts
    {
        /// <summary>
        /// Append to the given FILEs, do not overwrite
        /// </summary>
        public readonly bool? Append;
        /// <summary>
        /// Corresponds to the [FILE] argument.
        /// </summary>
        public readonly ImmutableArray<string> Files;
        /// <summary>
        /// Ignore interrupt signals.
        /// </summary>
        public readonly bool? IgnoreInterrupts;
        /// <summary>
        /// Set behavior on write error.
        /// </summary>
        public readonly UnMango.Commandx.Remote.TeeMode? OutputError;
        /// <summary>
        /// Operate in a more appropriate MODE with pipes.
        /// </summary>
        public readonly bool? Pipe;
        /// <summary>
        /// Output version information and exit.
        /// </summary>
        public readonly bool? Version;

        [OutputConstructor]
        private TeeOpts(
            bool? append,

            ImmutableArray<string> files,

            bool? ignoreInterrupts,

            UnMango.Commandx.Remote.TeeMode? outputError,

            bool? pipe,

            bool? version)
        {
            Append = append;
            Files = files;
            IgnoreInterrupts = ignoreInterrupts;
            OutputError = outputError;
            Pipe = pipe;
            Version = version;
        }
    }
}
