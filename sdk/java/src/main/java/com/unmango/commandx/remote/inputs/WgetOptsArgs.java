// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.unmango.commandx.remote.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Abstraction over the `wget` utility on a remote system.
 * 
 */
public final class WgetOptsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WgetOptsArgs Empty = new WgetOptsArgs();

    /**
     * The  directory prefix is the directory where all other files and subdirectories will be saved to, i.e. the top of the retrieval tree.  The default is . (the current directory).
     * 
     */
    @Import(name="directoryPrefix")
    private @Nullable Output<String> directoryPrefix;

    /**
     * @return The  directory prefix is the directory where all other files and subdirectories will be saved to, i.e. the top of the retrieval tree.  The default is . (the current directory).
     * 
     */
    public Optional<Output<String>> directoryPrefix() {
        return Optional.ofNullable(this.directoryPrefix);
    }

    /**
     * When in recursive mode, only HTTPS links are followed.
     * 
     */
    @Import(name="httpsOnly")
    private @Nullable Output<Boolean> httpsOnly;

    /**
     * @return When in recursive mode, only HTTPS links are followed.
     * 
     */
    public Optional<Output<Boolean>> httpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }

    /**
     * Turn off verbose without being completely quiet (use -q for that), which means that error messages and basic information still get printed.
     * 
     */
    @Import(name="noVerbose")
    private @Nullable Output<Boolean> noVerbose;

    /**
     * @return Turn off verbose without being completely quiet (use -q for that), which means that error messages and basic information still get printed.
     * 
     */
    public Optional<Output<Boolean>> noVerbose() {
        return Optional.ofNullable(this.noVerbose);
    }

    /**
     * The  documents  will  not  be  written  to the appropriate files, but all will be concatenated together and written to file.
     * 
     */
    @Import(name="outputDocument")
    private @Nullable Output<String> outputDocument;

    /**
     * @return The  documents  will  not  be  written  to the appropriate files, but all will be concatenated together and written to file.
     * 
     */
    public Optional<Output<String>> outputDocument() {
        return Optional.ofNullable(this.outputDocument);
    }

    /**
     * Turn off Wget&#39;s output.
     * 
     */
    @Import(name="quiet")
    private @Nullable Output<Boolean> quiet;

    /**
     * @return Turn off Wget&#39;s output.
     * 
     */
    public Optional<Output<Boolean>> quiet() {
        return Optional.ofNullable(this.quiet);
    }

    /**
     * Turn on time-stamping.
     * 
     */
    @Import(name="timestamping")
    private @Nullable Output<Boolean> timestamping;

    /**
     * @return Turn on time-stamping.
     * 
     */
    public Optional<Output<Boolean>> timestamping() {
        return Optional.ofNullable(this.timestamping);
    }

    /**
     * Corresponds to the [URL...] argument.
     * 
     */
    @Import(name="url", required=true)
    private Output<List<String>> url;

    /**
     * @return Corresponds to the [URL...] argument.
     * 
     */
    public Output<List<String>> url() {
        return this.url;
    }

    private WgetOptsArgs() {}

    private WgetOptsArgs(WgetOptsArgs $) {
        this.directoryPrefix = $.directoryPrefix;
        this.httpsOnly = $.httpsOnly;
        this.noVerbose = $.noVerbose;
        this.outputDocument = $.outputDocument;
        this.quiet = $.quiet;
        this.timestamping = $.timestamping;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WgetOptsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WgetOptsArgs $;

        public Builder() {
            $ = new WgetOptsArgs();
        }

        public Builder(WgetOptsArgs defaults) {
            $ = new WgetOptsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryPrefix The  directory prefix is the directory where all other files and subdirectories will be saved to, i.e. the top of the retrieval tree.  The default is . (the current directory).
         * 
         * @return builder
         * 
         */
        public Builder directoryPrefix(@Nullable Output<String> directoryPrefix) {
            $.directoryPrefix = directoryPrefix;
            return this;
        }

        /**
         * @param directoryPrefix The  directory prefix is the directory where all other files and subdirectories will be saved to, i.e. the top of the retrieval tree.  The default is . (the current directory).
         * 
         * @return builder
         * 
         */
        public Builder directoryPrefix(String directoryPrefix) {
            return directoryPrefix(Output.of(directoryPrefix));
        }

        /**
         * @param httpsOnly When in recursive mode, only HTTPS links are followed.
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            $.httpsOnly = httpsOnly;
            return this;
        }

        /**
         * @param httpsOnly When in recursive mode, only HTTPS links are followed.
         * 
         * @return builder
         * 
         */
        public Builder httpsOnly(Boolean httpsOnly) {
            return httpsOnly(Output.of(httpsOnly));
        }

        /**
         * @param noVerbose Turn off verbose without being completely quiet (use -q for that), which means that error messages and basic information still get printed.
         * 
         * @return builder
         * 
         */
        public Builder noVerbose(@Nullable Output<Boolean> noVerbose) {
            $.noVerbose = noVerbose;
            return this;
        }

        /**
         * @param noVerbose Turn off verbose without being completely quiet (use -q for that), which means that error messages and basic information still get printed.
         * 
         * @return builder
         * 
         */
        public Builder noVerbose(Boolean noVerbose) {
            return noVerbose(Output.of(noVerbose));
        }

        /**
         * @param outputDocument The  documents  will  not  be  written  to the appropriate files, but all will be concatenated together and written to file.
         * 
         * @return builder
         * 
         */
        public Builder outputDocument(@Nullable Output<String> outputDocument) {
            $.outputDocument = outputDocument;
            return this;
        }

        /**
         * @param outputDocument The  documents  will  not  be  written  to the appropriate files, but all will be concatenated together and written to file.
         * 
         * @return builder
         * 
         */
        public Builder outputDocument(String outputDocument) {
            return outputDocument(Output.of(outputDocument));
        }

        /**
         * @param quiet Turn off Wget&#39;s output.
         * 
         * @return builder
         * 
         */
        public Builder quiet(@Nullable Output<Boolean> quiet) {
            $.quiet = quiet;
            return this;
        }

        /**
         * @param quiet Turn off Wget&#39;s output.
         * 
         * @return builder
         * 
         */
        public Builder quiet(Boolean quiet) {
            return quiet(Output.of(quiet));
        }

        /**
         * @param timestamping Turn on time-stamping.
         * 
         * @return builder
         * 
         */
        public Builder timestamping(@Nullable Output<Boolean> timestamping) {
            $.timestamping = timestamping;
            return this;
        }

        /**
         * @param timestamping Turn on time-stamping.
         * 
         * @return builder
         * 
         */
        public Builder timestamping(Boolean timestamping) {
            return timestamping(Output.of(timestamping));
        }

        /**
         * @param url Corresponds to the [URL...] argument.
         * 
         * @return builder
         * 
         */
        public Builder url(Output<List<String>> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url Corresponds to the [URL...] argument.
         * 
         * @return builder
         * 
         */
        public Builder url(List<String> url) {
            return url(Output.of(url));
        }

        /**
         * @param url Corresponds to the [URL...] argument.
         * 
         * @return builder
         * 
         */
        public Builder url(String... url) {
            return url(List.of(url));
        }

        public WgetOptsArgs build() {
            if ($.url == null) {
                throw new MissingRequiredPropertyException("WgetOptsArgs", "url");
            }
            return $;
        }
    }

}
