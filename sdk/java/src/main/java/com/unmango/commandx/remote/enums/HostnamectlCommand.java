// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.unmango.commandx.remote.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum HostnamectlCommand {
        /**
         * Show system hostname and related information. If no command is specified, this is the implied default.
         * 
         */
        Status("status"),
        /**
         * If no argument is given, print the system hostname. If an optional argument NAME is provided then the command changes the system hostname to NAME.
         * 
         */
        Hostname("hostname"),
        /**
         * If no argument is given, print the icon name of the system. If an optional argument NAME is provided then the command changes the icon name to NAME.
         * 
         */
        Iconname("icon-name"),
        /**
         * If no argument is given, print the chassis type. If an optional argument TYPE is provided then the command changes the chassis type to TYPE.
         * 
         */
        Chassis("chassis"),
        /**
         * If no argument is given, print the deployment environment. If an optional argument ENVIRONMENT is provided then the command changes the deployment environment to ENVIRONMENT.
         * 
         */
        Deployment("deployment"),
        /**
         * If no argument is given, print the location string for the system. If an optional argument LOCATION is provided then the command changes the location string for the system to LOCATION.
         * 
         */
        Location("location");

        private final String value;

        HostnamectlCommand(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "HostnamectlCommand[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
