import { ComponentResource, ComponentResourceOptions, Inputs } from '@pulumi/pulumi';
import * as schema from './schema-types';
import * as remote from './remote';

const resources: schema.ResourceConstructor = {
  'commandx:remote:Chmod': (...args) => new remote.Chmod(...args),
  'commandx:remote:Curl': (...args) => { throw new Error('TODO') },
  'commandx:remote:Etcdctl': (...args) => new remote.Etcdctl(...args),
  'commandx:remote:Hostnamectl': (...args) => new remote.Hostnamectl(...args),
  'commandx:remote:Mkdir': (...args) => new remote.Mkdir(...args),
  'commandx:remote:Mktemp': (...args) => new remote.Mktemp(...args),
  'commandx:remote:Mv': (...args) => new remote.Mv(...args),
  'commandx:remote:Rm': (...args) => new remote.Rm(...args),
  'commandx:remote:Sed': (...args) => new remote.Sed(...args),
  'commandx:remote:Systemctl': (...args) => new remote.Systemctl(...args),
  'commandx:remote:Tar': (...args) => new remote.Tar(...args),
  'commandx:remote:Tee': (...args) => new remote.Tee(...args),
  'commandx:remote:Wget': (...args) => new remote.Wget(...args),
};

export function construct(
  name: string,
  type: string,
  inputs: Inputs,
  options: ComponentResourceOptions,
): ComponentResource | undefined {
  const genericResources: Record<string, schema.ConstructComponent> = resources;
  const resource = genericResources[type];
  if (resource === undefined) {
    return undefined;
  }
  return resource(name, inputs, options);
}
