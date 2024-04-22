// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.unmango.commandx.remote.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.unmango.commandx.remote.enums.HostnamectlCommand;
import com.unmango.commandx.remote.enums.HostnamectlJsonMode;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostnamectlOpts {
    /**
     * @return The argument for the specified `command`.
     * 
     */
    private @Nullable String arg;
    /**
     * @return Corresponds to the {COMMAND} argument.
     * 
     */
    private HostnamectlCommand command;
    /**
     * @return Print a short help text and exit.
     * 
     */
    private @Nullable Boolean help;
    /**
     * @return Execute the operation remotely. Specify a hostname, or a username and hostname separated by &#39;@&#39;, to connect to.
     * 
     */
    private @Nullable String host;
    /**
     * @return Shows output formatted as JSON.
     * 
     */
    private @Nullable HostnamectlJsonMode json;
    /**
     * @return Execute operation on a local container. Specify a container name to connect to, optionally prefixed by a user name to connect as and a separating &#39;@&#39; character.
     * 
     */
    private @Nullable String machine;
    /**
     * @return Do not query the user for authentication for privileged operations.
     * 
     */
    private @Nullable Boolean noAskPassword;
    /**
     * @return If status is invoked (or no explicit command is given) and one of these switches is specified, hostnamectl will print out just this selected hostname. Same as `static` and `transient`.
     * 
     */
    private @Nullable Boolean pretty;
    /**
     * @return If status is invoked (or no explicit command is given) and one of these switches is specified, hostnamectl will print out just this selected hostname. Same as `transient` and `pretty`.
     * 
     */
    private @Nullable Boolean static_;
    /**
     * @return If status is invoked (or no explicit command is given) and one of these switches is specified, hostnamectl will print out just this selected hostname. Same as `static` and `pretty`.
     * 
     */
    private @Nullable Boolean transient_;
    /**
     * @return Print a short version string and exit.
     * 
     */
    private @Nullable Boolean version;

    private HostnamectlOpts() {}
    /**
     * @return The argument for the specified `command`.
     * 
     */
    public Optional<String> arg() {
        return Optional.ofNullable(this.arg);
    }
    /**
     * @return Corresponds to the {COMMAND} argument.
     * 
     */
    public HostnamectlCommand command() {
        return this.command;
    }
    /**
     * @return Print a short help text and exit.
     * 
     */
    public Optional<Boolean> help() {
        return Optional.ofNullable(this.help);
    }
    /**
     * @return Execute the operation remotely. Specify a hostname, or a username and hostname separated by &#39;@&#39;, to connect to.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return Shows output formatted as JSON.
     * 
     */
    public Optional<HostnamectlJsonMode> json() {
        return Optional.ofNullable(this.json);
    }
    /**
     * @return Execute operation on a local container. Specify a container name to connect to, optionally prefixed by a user name to connect as and a separating &#39;@&#39; character.
     * 
     */
    public Optional<String> machine() {
        return Optional.ofNullable(this.machine);
    }
    /**
     * @return Do not query the user for authentication for privileged operations.
     * 
     */
    public Optional<Boolean> noAskPassword() {
        return Optional.ofNullable(this.noAskPassword);
    }
    /**
     * @return If status is invoked (or no explicit command is given) and one of these switches is specified, hostnamectl will print out just this selected hostname. Same as `static` and `transient`.
     * 
     */
    public Optional<Boolean> pretty() {
        return Optional.ofNullable(this.pretty);
    }
    /**
     * @return If status is invoked (or no explicit command is given) and one of these switches is specified, hostnamectl will print out just this selected hostname. Same as `transient` and `pretty`.
     * 
     */
    public Optional<Boolean> static_() {
        return Optional.ofNullable(this.static_);
    }
    /**
     * @return If status is invoked (or no explicit command is given) and one of these switches is specified, hostnamectl will print out just this selected hostname. Same as `static` and `pretty`.
     * 
     */
    public Optional<Boolean> transient_() {
        return Optional.ofNullable(this.transient_);
    }
    /**
     * @return Print a short version string and exit.
     * 
     */
    public Optional<Boolean> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostnamectlOpts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arg;
        private HostnamectlCommand command;
        private @Nullable Boolean help;
        private @Nullable String host;
        private @Nullable HostnamectlJsonMode json;
        private @Nullable String machine;
        private @Nullable Boolean noAskPassword;
        private @Nullable Boolean pretty;
        private @Nullable Boolean static_;
        private @Nullable Boolean transient_;
        private @Nullable Boolean version;
        public Builder() {}
        public Builder(HostnamectlOpts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arg = defaults.arg;
    	      this.command = defaults.command;
    	      this.help = defaults.help;
    	      this.host = defaults.host;
    	      this.json = defaults.json;
    	      this.machine = defaults.machine;
    	      this.noAskPassword = defaults.noAskPassword;
    	      this.pretty = defaults.pretty;
    	      this.static_ = defaults.static_;
    	      this.transient_ = defaults.transient_;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder arg(@Nullable String arg) {

            this.arg = arg;
            return this;
        }
        @CustomType.Setter
        public Builder command(HostnamectlCommand command) {
            if (command == null) {
              throw new MissingRequiredPropertyException("HostnamectlOpts", "command");
            }
            this.command = command;
            return this;
        }
        @CustomType.Setter
        public Builder help(@Nullable Boolean help) {

            this.help = help;
            return this;
        }
        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder json(@Nullable HostnamectlJsonMode json) {

            this.json = json;
            return this;
        }
        @CustomType.Setter
        public Builder machine(@Nullable String machine) {

            this.machine = machine;
            return this;
        }
        @CustomType.Setter
        public Builder noAskPassword(@Nullable Boolean noAskPassword) {

            this.noAskPassword = noAskPassword;
            return this;
        }
        @CustomType.Setter
        public Builder pretty(@Nullable Boolean pretty) {

            this.pretty = pretty;
            return this;
        }
        @CustomType.Setter("static")
        public Builder static_(@Nullable Boolean static_) {

            this.static_ = static_;
            return this;
        }
        @CustomType.Setter("transient")
        public Builder transient_(@Nullable Boolean transient_) {

            this.transient_ = transient_;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable Boolean version) {

            this.version = version;
            return this;
        }
        public HostnamectlOpts build() {
            final var _resultValue = new HostnamectlOpts();
            _resultValue.arg = arg;
            _resultValue.command = command;
            _resultValue.help = help;
            _resultValue.host = host;
            _resultValue.json = json;
            _resultValue.machine = machine;
            _resultValue.noAskPassword = noAskPassword;
            _resultValue.pretty = pretty;
            _resultValue.static_ = static_;
            _resultValue.transient_ = transient_;
            _resultValue.version = version;
            return _resultValue;
        }
    }
}
