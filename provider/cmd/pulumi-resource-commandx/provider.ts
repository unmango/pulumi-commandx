import * as pulumi from '@pulumi/pulumi';
import { ComponentResourceOptions, Inputs } from '@pulumi/pulumi';
import * as provider from '@pulumi/pulumi/provider';
import { ConstructResult, InvokeResult } from '@pulumi/pulumi/provider';
import { construct } from './resources';
import { functions } from './functions';
import { resourceToConstructResult } from './util';

export class Provider implements provider.Provider {
  constructor(readonly version: string, readonly schema: string) {
    pulumi.runtime.registerResourceModule('commandx', 'tls', {
      version: version,
      construct(name, type, urn) {
        switch (type) {
          default:
            throw new Error(`unknown resource type ${type}`);
        }
      },
    });

    pulumi.runtime.registerResourceModule('commandx', 'remote', {
      version: version,
      construct(name, type, urn) {
        switch (type) {
          default:
            throw new Error(`unknown resource type ${type}`);
        }
      }
    });
  }

  async construct(name: string, type: string, inputs: Inputs, options: ComponentResourceOptions): Promise<ConstructResult> {
    const resource = construct(name, type, inputs, options);
    if (resource === undefined) {
      throw new Error(`unknown resource type ${type}`);
    }

    return resourceToConstructResult(resource);
  }

  async call(token: string, inputs: pulumi.Inputs): Promise<InvokeResult> {
    const untypedFunctions: Record<string, (inputs: any) => Promise<any>> = functions;
    const handler = untypedFunctions[token];
    if (!handler) {
      throw new Error(`unknown method ${token}`);
    }
    const outputs = await handler(inputs);
    return { outputs };
  }

  async invoke(token: string, inputs: pulumi.Inputs): Promise<InvokeResult> {
    return this.call(token, inputs); // Why do both of these functions exist
  }
}
