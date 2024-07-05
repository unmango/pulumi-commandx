package gen

import (
	"github.com/UnstoppableMango/pulumi-commandx/schemagen/pkg/gen/props"
	"github.com/UnstoppableMango/pulumi-commandx/schemagen/pkg/gen/types"
	"github.com/pulumi/pulumi/pkg/v3/codegen/schema"
)

func generateSystemctl() tool {
	inputs := map[string]schema.PropertySpec{
		"command": { // The common output will overwrite this, that's fine.
			Description: "Corresponds to the COMMAND argument.",
			TypeSpec: schema.TypeSpec{
				Ref:   types.LocalType("SystemctlCommand", "remote").Ref,
				Plain: true,
			},
		},
		"pattern": props.String("Corresponds to the [PATTERN] argument"),
		"unit":    props.String("Corresponds to the [UNIT...] argument."),
		"now":     props.Boolean("Corresponds to the `--now` option."),
	}

	required := []string{
		"command",
		"unit",
	}

	typ := schema.ComplexTypeSpec{
		ObjectTypeSpec: schema.ObjectTypeSpec{
			Description: "Abstraction over the `systemctl` utility on a remote system.",
			Type:        "object",
			Properties:  inputs,
			Required:    required,
		},
	}

	return tool{optsType: typ, types: map[string]schema.ComplexTypeSpec{}}
}

// If we ever get a way to add the "required outputs" logic around a complexType
// resource := schema.ResourceSpec{
// 	ObjectTypeSpec: schema.ObjectTypeSpec{
// 		Description: "Abstraction over the `systemctl` utility on a remote system.",
// 		Properties: implicitOutputs(inputs, map[string]schema.PropertySpec{
// 			"systemctlCommand": inputs["command"],
// 		}),
// 		Required: []string{
// 			"systemctlCommand",
// 			"unit",
// 		},
// 	},
// 	InputProperties: inputs,
// 	RequiredInputs:  required,
// }
