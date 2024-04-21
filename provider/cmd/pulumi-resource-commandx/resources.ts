import { ComponentResource, ComponentResourceOptions, Inputs } from '@pulumi/pulumi';
import * as schema from './schema-types';
import {
  CniPluginsInstall,
  ContainerdInstall,
  CrictlInstall,
  Download,
  EtcdCluster,
  EtcdConfiguration,
  EtcdInstall,
  EtcdService,
  File,
  KubeApiServerInstall,
  KubeControllerManagerInstall,
  KubeProxyInstall,
  KubeSchedulerInstall,
  KubectlInstall,
  KubeletInstall,
  RuncInstall,
  StartEtcd,
  StaticPod,
  SystemdService,
} from './remote';
import { ProvisionEtcd } from './remote/provisionEtcd';
import { Certificate, ClusterPki, EncryptionKey, RootCa } from './tls';
import { Chmod, Etcdctl, Hostnamectl, Mkdir, Mktemp, Mv, Rm, Sed, Systemctl, Tar, Tee, Wget } from './tools';
import { KubeVipManifest } from './config';

const resources: schema.ResourceConstructor = {
  'commandx:config:KubeVipManifest': (...args) => new KubeVipManifest(...args),
  'commandx:remote:Download': (...args) => new Download(...args),
  'commandx:remote:EtcdCluster': (...args) => new EtcdCluster(...args),
  'commandx:remote:EtcdConfiguration': (...args) => new EtcdConfiguration(...args),
  'commandx:remote:EtcdInstall': (...args) => new EtcdInstall(...args),
  'commandx:remote:EtcdService': (...args) => new EtcdService(...args),
  'commandx:remote:File': (...args) => new File(...args),
  'commandx:remote:KubeApiServerInstall': (...args) => new KubeApiServerInstall(...args),
  'commandx:remote:KubeControllerManagerInstall': (...args) => new KubeControllerManagerInstall(...args),
  'commandx:remote:KubeSchedulerInstall': (...args) => new KubeSchedulerInstall(...args),
  'commandx:remote:CniPluginsInstall': (...args) => new CniPluginsInstall(...args),
  'commandx:remote:ContainerdInstall': (...args) => new ContainerdInstall(...args),
  'commandx:remote:CrictlInstall': (...args) => new CrictlInstall(...args),
  'commandx:remote:KubectlInstall': (...args) => new KubectlInstall(...args),
  'commandx:remote:KubeletInstall': (...args) => new KubeletInstall(...args),
  'commandx:remote:KubeProxyInstall': (...args) => new KubeProxyInstall(...args),
  'commandx:remote:ProvisionEtcd': (...args) => new ProvisionEtcd(...args),
  'commandx:remote:RuncInstall': (...args) => new RuncInstall(...args),
  'commandx:remote:StartEtcd': (...args) => new StartEtcd(...args),
  'commandx:remote:StaticPod': (...args) => new StaticPod(...args),
  'commandx:remote:SystemdService': (...args) => new SystemdService(...args),
  'commandx:tls:Certificate': (...args) => new Certificate(...args),
  'commandx:tls:ClusterPki': (...args) => new ClusterPki(...args),
  'commandx:tls:EncryptionKey': (...args) => new EncryptionKey(...args),
  'commandx:tls:RootCa': (...args) => new RootCa(...args),
  'commandx:tools:Chmod': (...args) => new Chmod(...args),
  'commandx:tools:Curl': (...args) => { throw new Error('TODO') },
  'commandx:tools:Etcdctl': (...args) => new Etcdctl(...args),
  'commandx:tools:Hostnamectl': (...args) => new Hostnamectl(...args),
  'commandx:tools:Mkdir': (...args) => new Mkdir(...args),
  'commandx:tools:Mktemp': (...args) => new Mktemp(...args),
  'commandx:tools:Mv': (...args) => new Mv(...args),
  'commandx:tools:Rm': (...args) => new Rm(...args),
  'commandx:tools:Sed': (...args) => new Sed(...args),
  'commandx:tools:Systemctl': (...args) => new Systemctl(...args),
  'commandx:tools:Tar': (...args) => new Tar(...args),
  'commandx:tools:Tee': (...args) => new Tee(...args),
  'commandx:tools:Wget': (...args) => new Wget(...args),
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
