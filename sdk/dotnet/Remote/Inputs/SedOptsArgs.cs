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
    /// Abstraction over the `sed` utility on a remote system.
    /// </summary>
    public sealed class SedOptsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// annotate program execution.
        /// </summary>
        [Input("debug")]
        public Input<bool>? Debug { get; set; }

        [Input("expressions")]
        private InputList<string>? _expressions;

        /// <summary>
        /// add the script to the commands to be executed.
        /// </summary>
        public InputList<string> Expressions
        {
            get => _expressions ?? (_expressions = new InputList<string>());
            set => _expressions = value;
        }

        [Input("files")]
        private InputList<string>? _files;

        /// <summary>
        /// add the contents of script-file to the commands to be executed.
        /// </summary>
        public InputList<string> Files
        {
            get => _files ?? (_files = new InputList<string>());
            set => _files = value;
        }

        /// <summary>
        /// follow symlinks when processing in place
        /// </summary>
        [Input("followSymlinks")]
        public Input<bool>? FollowSymlinks { get; set; }

        /// <summary>
        /// display this help and exit.
        /// </summary>
        [Input("help")]
        public Input<bool>? Help { get; set; }

        /// <summary>
        /// edit files in place (makes backup if SUFFIX supplied)
        /// </summary>
        [Input("inPlace")]
        public Input<string>? InPlace { get; set; }

        [Input("inputFiles")]
        private InputList<string>? _inputFiles;

        /// <summary>
        /// corresponds to the [input-file]... argument(s).
        /// </summary>
        public InputList<string> InputFiles
        {
            get => _inputFiles ?? (_inputFiles = new InputList<string>());
            set => _inputFiles = value;
        }

        /// <summary>
        /// specify the desired line-wrap length for the `l' command
        /// </summary>
        [Input("lineLength")]
        public Input<int>? LineLength { get; set; }

        /// <summary>
        /// separate lines by NUL characters
        /// </summary>
        [Input("nullData")]
        public Input<bool>? NullData { get; set; }

        /// <summary>
        /// disable all GNU extensions.
        /// </summary>
        [Input("posix")]
        public Input<bool>? Posix { get; set; }

        /// <summary>
        /// suppress automatic printing of pattern space. Same as `silent`.
        /// </summary>
        [Input("quiet")]
        public Input<bool>? Quiet { get; set; }

        /// <summary>
        /// use extended regular expressions in the script (for portability use POSIX -E).
        /// </summary>
        [Input("regexpExtended")]
        public Input<bool>? RegexpExtended { get; set; }

        /// <summary>
        /// operate in sandbox mode (disable e/r/w commands).
        /// </summary>
        [Input("sandbox")]
        public Input<bool>? Sandbox { get; set; }

        /// <summary>
        /// script only if no other script.
        /// </summary>
        [Input("script")]
        public Input<string>? Script { get; set; }

        /// <summary>
        /// consider files as separate rather than as a single, continuous long stream.
        /// </summary>
        [Input("separate")]
        public Input<bool>? Separate { get; set; }

        /// <summary>
        /// suppress automatic printing of pattern space. Same as `quiet`.
        /// </summary>
        [Input("silent")]
        public Input<bool>? Silent { get; set; }

        /// <summary>
        /// load minimal amounts of data from the input files and flush the output buffers more often.
        /// </summary>
        [Input("unbuffered")]
        public Input<bool>? Unbuffered { get; set; }

        /// <summary>
        /// output version information and exit.
        /// </summary>
        [Input("version")]
        public Input<bool>? Version { get; set; }

        public SedOptsArgs()
        {
        }
        public static new SedOptsArgs Empty => new SedOptsArgs();
    }
}
