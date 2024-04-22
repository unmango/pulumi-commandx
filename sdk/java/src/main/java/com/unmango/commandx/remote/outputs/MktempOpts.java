// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.unmango.commandx.remote.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MktempOpts {
    /**
     * @return Corresponds to the `--directory` option.
     * 
     */
    private @Nullable Boolean directory;
    /**
     * @return Corresponds to the `--dry-run` option.
     * 
     */
    private @Nullable Boolean dryRun;
    /**
     * @return Corresponds to the `--quiet` option.
     * 
     */
    private @Nullable Boolean quiet;
    /**
     * @return Corresponds to the `--suffix` option.
     * 
     */
    private @Nullable String suffix;
    /**
     * @return Corresponds to the [TEMPLATE] argument.
     * 
     */
    private @Nullable String template;
    /**
     * @return Corresponds to the `--tmpdir` option.
     * 
     */
    private @Nullable String tmpdir;

    private MktempOpts() {}
    /**
     * @return Corresponds to the `--directory` option.
     * 
     */
    public Optional<Boolean> directory() {
        return Optional.ofNullable(this.directory);
    }
    /**
     * @return Corresponds to the `--dry-run` option.
     * 
     */
    public Optional<Boolean> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }
    /**
     * @return Corresponds to the `--quiet` option.
     * 
     */
    public Optional<Boolean> quiet() {
        return Optional.ofNullable(this.quiet);
    }
    /**
     * @return Corresponds to the `--suffix` option.
     * 
     */
    public Optional<String> suffix() {
        return Optional.ofNullable(this.suffix);
    }
    /**
     * @return Corresponds to the [TEMPLATE] argument.
     * 
     */
    public Optional<String> template() {
        return Optional.ofNullable(this.template);
    }
    /**
     * @return Corresponds to the `--tmpdir` option.
     * 
     */
    public Optional<String> tmpdir() {
        return Optional.ofNullable(this.tmpdir);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MktempOpts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean directory;
        private @Nullable Boolean dryRun;
        private @Nullable Boolean quiet;
        private @Nullable String suffix;
        private @Nullable String template;
        private @Nullable String tmpdir;
        public Builder() {}
        public Builder(MktempOpts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directory = defaults.directory;
    	      this.dryRun = defaults.dryRun;
    	      this.quiet = defaults.quiet;
    	      this.suffix = defaults.suffix;
    	      this.template = defaults.template;
    	      this.tmpdir = defaults.tmpdir;
        }

        @CustomType.Setter
        public Builder directory(@Nullable Boolean directory) {

            this.directory = directory;
            return this;
        }
        @CustomType.Setter
        public Builder dryRun(@Nullable Boolean dryRun) {

            this.dryRun = dryRun;
            return this;
        }
        @CustomType.Setter
        public Builder quiet(@Nullable Boolean quiet) {

            this.quiet = quiet;
            return this;
        }
        @CustomType.Setter
        public Builder suffix(@Nullable String suffix) {

            this.suffix = suffix;
            return this;
        }
        @CustomType.Setter
        public Builder template(@Nullable String template) {

            this.template = template;
            return this;
        }
        @CustomType.Setter
        public Builder tmpdir(@Nullable String tmpdir) {

            this.tmpdir = tmpdir;
            return this;
        }
        public MktempOpts build() {
            final var _resultValue = new MktempOpts();
            _resultValue.directory = directory;
            _resultValue.dryRun = dryRun;
            _resultValue.quiet = quiet;
            _resultValue.suffix = suffix;
            _resultValue.template = template;
            _resultValue.tmpdir = tmpdir;
            return _resultValue;
        }
    }
}
