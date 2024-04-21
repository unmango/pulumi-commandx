import { Inputs } from '@pulumi/pulumi';
import { InvokeResult } from '@pulumi/pulumi/provider';
import * as schema from './schema-types';
import { Certificate, ClusterPki, GetKubeconfigInputs, GetKubeconfigOutputs, NewCertificateInputs, NewCertificateOutputs, RootCa } from './tls';
import { InstallInputs, InstallOutputs } from './remote';
import { getKubeVipManifest } from './config';

type Functions = {
  'commandx:config:getKubeVipManifest': (inputs: schema.getKubeVipManifestInputs) => Promise<schema.getKubeVipManifestOutputs>;
  'commandx:tls:ClusterPki/getKubeconfig': (inputs: GetKubeconfigInputs) => Promise<GetKubeconfigOutputs>;
  'commandx:tls:Certificate/installCert': (inputs: InstallInputs) => Promise<InstallOutputs>;
  'commandx:tls:Certificate/installKey': (inputs: InstallInputs) => Promise<InstallOutputs>;
  // 'commandx:tls:installCert': (inputs: InstallInputs) => Promise<InstallOutputs>;
  // 'commandx:tls:newCertificate': (inputs: NewCertificateInputs) => Promise<NewCertificateOutputs>;
  // 'commandx:tls:installKey': (inputs: InstallInputs) => Promise<InstallOutputs>;
  'commandx:tls:RootCa/newCertificate': (inputs: NewCertificateInputs) => Promise<NewCertificateOutputs>;
  'commandx:tls:RootCa/installCert': (inputs: InstallInputs) => Promise<InstallOutputs>;
  'commandx:tls:RootCa/installKey': (inputs: InstallInputs) => Promise<InstallOutputs>;
};

export const functions: Functions = {
  'commandx:config:getKubeVipManifest': (i) => getKubeVipManifest(i),
  'commandx:tls:Certificate/installCert': (i) => self<Certificate>(i).installCert(i),
  'commandx:tls:Certificate/installKey': (i) => self<Certificate>(i).installKey(i),
  'commandx:tls:ClusterPki/getKubeconfig': (i) => self<ClusterPki>(i).getKubeconfig(i),
  // 'commandx:tls:installCert': (i) => keypair.installCert()
  // 'commandx:tls:newCertificate':
  // 'commandx:tls:installKey':
  'commandx:tls:RootCa/newCertificate': (i) => self<RootCa>(i).newCertificate(i),
  'commandx:tls:RootCa/installCert': (i) => self<RootCa>(i).installCert(i),
  'commandx:tls:RootCa/installKey': (i) => self<RootCa>(i).installKey(i),
};

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
