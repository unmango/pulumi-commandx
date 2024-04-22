// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.unmango.commandx.remote.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum CurlDelegationLevel {
        None("none"),
        Policy("policy"),
        Always("always");

        private final String value;

        CurlDelegationLevel(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "CurlDelegationLevel[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
