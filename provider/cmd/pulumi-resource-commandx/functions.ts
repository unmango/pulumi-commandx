import { Inputs } from '@pulumi/pulumi';
import { InvokeResult } from '@pulumi/pulumi/provider';
import * as schema from './schema-types';

export const functions: schema.Functions = {};

export async function call(token: string, inputs: Inputs): Promise<InvokeResult> {
  const untypedFunctions: Record<string, (inputs: any) => Promise<any>> = functions;
  const handler = untypedFunctions[token];
  if (!handler) {
    throw new Error(`unknown method ${token}`);
  }
  const outputs = await handler(inputs);
  return { outputs };
}

function self<T>(inputs: Inputs): T {
  return inputs.__self__;
}
