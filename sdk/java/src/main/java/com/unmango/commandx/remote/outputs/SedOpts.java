// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.unmango.commandx.remote.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SedOpts {
    /**
     * @return annotate program execution.
     * 
     */
    private @Nullable Boolean debug;
    /**
     * @return add the script to the commands to be executed.
     * 
     */
    private @Nullable List<String> expressions;
    /**
     * @return add the contents of script-file to the commands to be executed.
     * 
     */
    private @Nullable List<String> files;
    /**
     * @return follow symlinks when processing in place
     * 
     */
    private @Nullable Boolean followSymlinks;
    /**
     * @return display this help and exit.
     * 
     */
    private @Nullable Boolean help;
    /**
     * @return edit files in place (makes backup if SUFFIX supplied)
     * 
     */
    private @Nullable String inPlace;
    /**
     * @return corresponds to the [input-file]... argument(s).
     * 
     */
    private @Nullable List<String> inputFiles;
    /**
     * @return specify the desired line-wrap length for the `l&#39; command
     * 
     */
    private @Nullable Integer lineLength;
    /**
     * @return separate lines by NUL characters
     * 
     */
    private @Nullable Boolean nullData;
    /**
     * @return disable all GNU extensions.
     * 
     */
    private @Nullable Boolean posix;
    /**
     * @return suppress automatic printing of pattern space. Same as `silent`.
     * 
     */
    private @Nullable Boolean quiet;
    /**
     * @return use extended regular expressions in the script (for portability use POSIX -E).
     * 
     */
    private @Nullable Boolean regexpExtended;
    /**
     * @return operate in sandbox mode (disable e/r/w commands).
     * 
     */
    private @Nullable Boolean sandbox;
    /**
     * @return script only if no other script.
     * 
     */
    private @Nullable String script;
    /**
     * @return consider files as separate rather than as a single, continuous long stream.
     * 
     */
    private @Nullable Boolean separate;
    /**
     * @return suppress automatic printing of pattern space. Same as `quiet`.
     * 
     */
    private @Nullable Boolean silent;
    /**
     * @return load minimal amounts of data from the input files and flush the output buffers more often.
     * 
     */
    private @Nullable Boolean unbuffered;
    /**
     * @return output version information and exit.
     * 
     */
    private @Nullable Boolean version;

    private SedOpts() {}
    /**
     * @return annotate program execution.
     * 
     */
    public Optional<Boolean> debug() {
        return Optional.ofNullable(this.debug);
    }
    /**
     * @return add the script to the commands to be executed.
     * 
     */
    public List<String> expressions() {
        return this.expressions == null ? List.of() : this.expressions;
    }
    /**
     * @return add the contents of script-file to the commands to be executed.
     * 
     */
    public List<String> files() {
        return this.files == null ? List.of() : this.files;
    }
    /**
     * @return follow symlinks when processing in place
     * 
     */
    public Optional<Boolean> followSymlinks() {
        return Optional.ofNullable(this.followSymlinks);
    }
    /**
     * @return display this help and exit.
     * 
     */
    public Optional<Boolean> help() {
        return Optional.ofNullable(this.help);
    }
    /**
     * @return edit files in place (makes backup if SUFFIX supplied)
     * 
     */
    public Optional<String> inPlace() {
        return Optional.ofNullable(this.inPlace);
    }
    /**
     * @return corresponds to the [input-file]... argument(s).
     * 
     */
    public List<String> inputFiles() {
        return this.inputFiles == null ? List.of() : this.inputFiles;
    }
    /**
     * @return specify the desired line-wrap length for the `l&#39; command
     * 
     */
    public Optional<Integer> lineLength() {
        return Optional.ofNullable(this.lineLength);
    }
    /**
     * @return separate lines by NUL characters
     * 
     */
    public Optional<Boolean> nullData() {
        return Optional.ofNullable(this.nullData);
    }
    /**
     * @return disable all GNU extensions.
     * 
     */
    public Optional<Boolean> posix() {
        return Optional.ofNullable(this.posix);
    }
    /**
     * @return suppress automatic printing of pattern space. Same as `silent`.
     * 
     */
    public Optional<Boolean> quiet() {
        return Optional.ofNullable(this.quiet);
    }
    /**
     * @return use extended regular expressions in the script (for portability use POSIX -E).
     * 
     */
    public Optional<Boolean> regexpExtended() {
        return Optional.ofNullable(this.regexpExtended);
    }
    /**
     * @return operate in sandbox mode (disable e/r/w commands).
     * 
     */
    public Optional<Boolean> sandbox() {
        return Optional.ofNullable(this.sandbox);
    }
    /**
     * @return script only if no other script.
     * 
     */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }
    /**
     * @return consider files as separate rather than as a single, continuous long stream.
     * 
     */
    public Optional<Boolean> separate() {
        return Optional.ofNullable(this.separate);
    }
    /**
     * @return suppress automatic printing of pattern space. Same as `quiet`.
     * 
     */
    public Optional<Boolean> silent() {
        return Optional.ofNullable(this.silent);
    }
    /**
     * @return load minimal amounts of data from the input files and flush the output buffers more often.
     * 
     */
    public Optional<Boolean> unbuffered() {
        return Optional.ofNullable(this.unbuffered);
    }
    /**
     * @return output version information and exit.
     * 
     */
    public Optional<Boolean> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SedOpts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean debug;
        private @Nullable List<String> expressions;
        private @Nullable List<String> files;
        private @Nullable Boolean followSymlinks;
        private @Nullable Boolean help;
        private @Nullable String inPlace;
        private @Nullable List<String> inputFiles;
        private @Nullable Integer lineLength;
        private @Nullable Boolean nullData;
        private @Nullable Boolean posix;
        private @Nullable Boolean quiet;
        private @Nullable Boolean regexpExtended;
        private @Nullable Boolean sandbox;
        private @Nullable String script;
        private @Nullable Boolean separate;
        private @Nullable Boolean silent;
        private @Nullable Boolean unbuffered;
        private @Nullable Boolean version;
        public Builder() {}
        public Builder(SedOpts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.debug = defaults.debug;
    	      this.expressions = defaults.expressions;
    	      this.files = defaults.files;
    	      this.followSymlinks = defaults.followSymlinks;
    	      this.help = defaults.help;
    	      this.inPlace = defaults.inPlace;
    	      this.inputFiles = defaults.inputFiles;
    	      this.lineLength = defaults.lineLength;
    	      this.nullData = defaults.nullData;
    	      this.posix = defaults.posix;
    	      this.quiet = defaults.quiet;
    	      this.regexpExtended = defaults.regexpExtended;
    	      this.sandbox = defaults.sandbox;
    	      this.script = defaults.script;
    	      this.separate = defaults.separate;
    	      this.silent = defaults.silent;
    	      this.unbuffered = defaults.unbuffered;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder debug(@Nullable Boolean debug) {

            this.debug = debug;
            return this;
        }
        @CustomType.Setter
        public Builder expressions(@Nullable List<String> expressions) {

            this.expressions = expressions;
            return this;
        }
        public Builder expressions(String... expressions) {
            return expressions(List.of(expressions));
        }
        @CustomType.Setter
        public Builder files(@Nullable List<String> files) {

            this.files = files;
            return this;
        }
        public Builder files(String... files) {
            return files(List.of(files));
        }
        @CustomType.Setter
        public Builder followSymlinks(@Nullable Boolean followSymlinks) {

            this.followSymlinks = followSymlinks;
            return this;
        }
        @CustomType.Setter
        public Builder help(@Nullable Boolean help) {

            this.help = help;
            return this;
        }
        @CustomType.Setter
        public Builder inPlace(@Nullable String inPlace) {

            this.inPlace = inPlace;
            return this;
        }
        @CustomType.Setter
        public Builder inputFiles(@Nullable List<String> inputFiles) {

            this.inputFiles = inputFiles;
            return this;
        }
        public Builder inputFiles(String... inputFiles) {
            return inputFiles(List.of(inputFiles));
        }
        @CustomType.Setter
        public Builder lineLength(@Nullable Integer lineLength) {

            this.lineLength = lineLength;
            return this;
        }
        @CustomType.Setter
        public Builder nullData(@Nullable Boolean nullData) {

            this.nullData = nullData;
            return this;
        }
        @CustomType.Setter
        public Builder posix(@Nullable Boolean posix) {

            this.posix = posix;
            return this;
        }
        @CustomType.Setter
        public Builder quiet(@Nullable Boolean quiet) {

            this.quiet = quiet;
            return this;
        }
        @CustomType.Setter
        public Builder regexpExtended(@Nullable Boolean regexpExtended) {

            this.regexpExtended = regexpExtended;
            return this;
        }
        @CustomType.Setter
        public Builder sandbox(@Nullable Boolean sandbox) {

            this.sandbox = sandbox;
            return this;
        }
        @CustomType.Setter
        public Builder script(@Nullable String script) {

            this.script = script;
            return this;
        }
        @CustomType.Setter
        public Builder separate(@Nullable Boolean separate) {

            this.separate = separate;
            return this;
        }
        @CustomType.Setter
        public Builder silent(@Nullable Boolean silent) {

            this.silent = silent;
            return this;
        }
        @CustomType.Setter
        public Builder unbuffered(@Nullable Boolean unbuffered) {

            this.unbuffered = unbuffered;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable Boolean version) {

            this.version = version;
            return this;
        }
        public SedOpts build() {
            final var _resultValue = new SedOpts();
            _resultValue.debug = debug;
            _resultValue.expressions = expressions;
            _resultValue.files = files;
            _resultValue.followSymlinks = followSymlinks;
            _resultValue.help = help;
            _resultValue.inPlace = inPlace;
            _resultValue.inputFiles = inputFiles;
            _resultValue.lineLength = lineLength;
            _resultValue.nullData = nullData;
            _resultValue.posix = posix;
            _resultValue.quiet = quiet;
            _resultValue.regexpExtended = regexpExtended;
            _resultValue.sandbox = sandbox;
            _resultValue.script = script;
            _resultValue.separate = separate;
            _resultValue.silent = silent;
            _resultValue.unbuffered = unbuffered;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
