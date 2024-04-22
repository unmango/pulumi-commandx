// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.unmango.commandx.remote.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Abstraction over the `mkdir` utility on a remote system.
 * 
 */
public final class MkdirOptsArgs extends com.pulumi.resources.ResourceArgs {

    public static final MkdirOptsArgs Empty = new MkdirOptsArgs();

    /**
     * The fully qualified path of the directory on the remote system.
     * 
     */
    @Import(name="directory", required=true)
    private Output<String> directory;

    /**
     * @return The fully qualified path of the directory on the remote system.
     * 
     */
    public Output<String> directory() {
        return this.directory;
    }

    /**
     * Corresponds to the `--parents` option.
     * 
     */
    @Import(name="parents")
    private @Nullable Output<Boolean> parents;

    /**
     * @return Corresponds to the `--parents` option.
     * 
     */
    public Optional<Output<Boolean>> parents() {
        return Optional.ofNullable(this.parents);
    }

    /**
     * Remove the created directory when the `Mkdir` resource is deleted or updated.
     * 
     */
    @Import(name="removeOnDelete")
    private @Nullable Output<Boolean> removeOnDelete;

    /**
     * @return Remove the created directory when the `Mkdir` resource is deleted or updated.
     * 
     */
    public Optional<Output<Boolean>> removeOnDelete() {
        return Optional.ofNullable(this.removeOnDelete);
    }

    private MkdirOptsArgs() {}

    private MkdirOptsArgs(MkdirOptsArgs $) {
        this.directory = $.directory;
        this.parents = $.parents;
        this.removeOnDelete = $.removeOnDelete;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MkdirOptsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MkdirOptsArgs $;

        public Builder() {
            $ = new MkdirOptsArgs();
        }

        public Builder(MkdirOptsArgs defaults) {
            $ = new MkdirOptsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directory The fully qualified path of the directory on the remote system.
         * 
         * @return builder
         * 
         */
        public Builder directory(Output<String> directory) {
            $.directory = directory;
            return this;
        }

        /**
         * @param directory The fully qualified path of the directory on the remote system.
         * 
         * @return builder
         * 
         */
        public Builder directory(String directory) {
            return directory(Output.of(directory));
        }

        /**
         * @param parents Corresponds to the `--parents` option.
         * 
         * @return builder
         * 
         */
        public Builder parents(@Nullable Output<Boolean> parents) {
            $.parents = parents;
            return this;
        }

        /**
         * @param parents Corresponds to the `--parents` option.
         * 
         * @return builder
         * 
         */
        public Builder parents(Boolean parents) {
            return parents(Output.of(parents));
        }

        /**
         * @param removeOnDelete Remove the created directory when the `Mkdir` resource is deleted or updated.
         * 
         * @return builder
         * 
         */
        public Builder removeOnDelete(@Nullable Output<Boolean> removeOnDelete) {
            $.removeOnDelete = removeOnDelete;
            return this;
        }

        /**
         * @param removeOnDelete Remove the created directory when the `Mkdir` resource is deleted or updated.
         * 
         * @return builder
         * 
         */
        public Builder removeOnDelete(Boolean removeOnDelete) {
            return removeOnDelete(Output.of(removeOnDelete));
        }

        public MkdirOptsArgs build() {
            if ($.directory == null) {
                throw new MissingRequiredPropertyException("MkdirOptsArgs", "directory");
            }
            return $;
        }
    }

}
