// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.unmango.commandx.remote.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WgetOpts {
    /**
     * @return The  directory prefix is the directory where all other files and subdirectories will be saved to, i.e. the top of the retrieval tree.  The default is . (the current directory).
     * 
     */
    private @Nullable String directoryPrefix;
    /**
     * @return When in recursive mode, only HTTPS links are followed.
     * 
     */
    private @Nullable Boolean httpsOnly;
    /**
     * @return Turn off verbose without being completely quiet (use -q for that), which means that error messages and basic information still get printed.
     * 
     */
    private @Nullable Boolean noVerbose;
    /**
     * @return The  documents  will  not  be  written  to the appropriate files, but all will be concatenated together and written to file.
     * 
     */
    private @Nullable String outputDocument;
    /**
     * @return Turn off Wget&#39;s output.
     * 
     */
    private @Nullable Boolean quiet;
    /**
     * @return Turn on time-stamping.
     * 
     */
    private @Nullable Boolean timestamping;
    /**
     * @return Corresponds to the [URL...] argument.
     * 
     */
    private List<String> url;

    private WgetOpts() {}
    /**
     * @return The  directory prefix is the directory where all other files and subdirectories will be saved to, i.e. the top of the retrieval tree.  The default is . (the current directory).
     * 
     */
    public Optional<String> directoryPrefix() {
        return Optional.ofNullable(this.directoryPrefix);
    }
    /**
     * @return When in recursive mode, only HTTPS links are followed.
     * 
     */
    public Optional<Boolean> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }
    /**
     * @return Turn off verbose without being completely quiet (use -q for that), which means that error messages and basic information still get printed.
     * 
     */
    public Optional<Boolean> noVerbose() {
        return Optional.ofNullable(this.noVerbose);
    }
    /**
     * @return The  documents  will  not  be  written  to the appropriate files, but all will be concatenated together and written to file.
     * 
     */
    public Optional<String> outputDocument() {
        return Optional.ofNullable(this.outputDocument);
    }
    /**
     * @return Turn off Wget&#39;s output.
     * 
     */
    public Optional<Boolean> quiet() {
        return Optional.ofNullable(this.quiet);
    }
    /**
     * @return Turn on time-stamping.
     * 
     */
    public Optional<Boolean> timestamping() {
        return Optional.ofNullable(this.timestamping);
    }
    /**
     * @return Corresponds to the [URL...] argument.
     * 
     */
    public List<String> url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WgetOpts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String directoryPrefix;
        private @Nullable Boolean httpsOnly;
        private @Nullable Boolean noVerbose;
        private @Nullable String outputDocument;
        private @Nullable Boolean quiet;
        private @Nullable Boolean timestamping;
        private List<String> url;
        public Builder() {}
        public Builder(WgetOpts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryPrefix = defaults.directoryPrefix;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.noVerbose = defaults.noVerbose;
    	      this.outputDocument = defaults.outputDocument;
    	      this.quiet = defaults.quiet;
    	      this.timestamping = defaults.timestamping;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder directoryPrefix(@Nullable String directoryPrefix) {

            this.directoryPrefix = directoryPrefix;
            return this;
        }
        @CustomType.Setter
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {

            this.httpsOnly = httpsOnly;
            return this;
        }
        @CustomType.Setter
        public Builder noVerbose(@Nullable Boolean noVerbose) {

            this.noVerbose = noVerbose;
            return this;
        }
        @CustomType.Setter
        public Builder outputDocument(@Nullable String outputDocument) {

            this.outputDocument = outputDocument;
            return this;
        }
        @CustomType.Setter
        public Builder quiet(@Nullable Boolean quiet) {

            this.quiet = quiet;
            return this;
        }
        @CustomType.Setter
        public Builder timestamping(@Nullable Boolean timestamping) {

            this.timestamping = timestamping;
            return this;
        }
        @CustomType.Setter
        public Builder url(List<String> url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("WgetOpts", "url");
            }
            this.url = url;
            return this;
        }
        public Builder url(String... url) {
            return url(List.of(url));
        }
        public WgetOpts build() {
            final var _resultValue = new WgetOpts();
            _resultValue.directoryPrefix = directoryPrefix;
            _resultValue.httpsOnly = httpsOnly;
            _resultValue.noVerbose = noVerbose;
            _resultValue.outputDocument = outputDocument;
            _resultValue.quiet = quiet;
            _resultValue.timestamping = timestamping;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
