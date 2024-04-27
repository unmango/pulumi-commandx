import { ComponentResourceOptions, Input, Output, output } from '@pulumi/pulumi';
import { Command } from '@pulumi/command/remote';
import * as schema from '../schema-types';
import { CommandBuilder, toArray } from './commandBuilder';

type CurlArgs = schema.CurlArgs & {
  urls: Input<string | Input<string>[]>;
};

export class Curl extends schema.Curl {
  constructor(name: string, args: CurlArgs, opts?: ComponentResourceOptions) {
    super(name, args, opts);

    const binaryPath = output(args.binaryPath ?? 'curl');
    const connection = output(args.connection);
    const environment = output(args.environment ?? {});
    const lifecycle = args.lifecycle ?? 'create';
    const stdin = output(args.stdin);
    const triggers = output(args.triggers ?? []);
    const abstractUnixSocket = output(args.abstractUnixSocket);
    const altSvc = output(args.altSvc);
    const anyAuth = output(args.anyAuth ?? false);
    const append = output(args.append ?? false);
    const awsSigv4 = output(args.awsSigv4);
    const basic = output(args.basic ?? false);
    const cacert = output(args.cacert);
    const capath = output(args.capath);
    const cert = output(args.cert);
    const certStatus = output(args.certStatus ?? false);
    const certType = output(args.certType);
    const ciphers = output(args.ciphers);
    const compressed = output(args.compressed ?? false);
    const compressedSsh = output(args.compressedSsh ?? false);
    const config = output(args.config);
    const connectTimeout = output(args.connectTimeout ?? false);
    const connectTo = output(args.connectTo);
    const continueAt = output(args.continueAt);
    const cookie = output(args.cookie);
    const cookieJar = output(args.cookieJar);
    const createDirs = output(args.createDirs ?? false);
    const createFileMode = output(args.createFileMode);
    const crlf = output(args.crlf ?? false);
    const crlfFile = output(args.crlfFile);
    const curves = output(args.curves);
    const data = output(args.data);
    const dataAscii = output(args.dataAscii);
    const dataBinary = output(args.dataBinary);
    const dataRaw = output(args.dataRaw);
    const dataUrlEncode = output(args.dataUrlEncode);
    const delegation = output(args.delegation);
    const digest = output(args.digest ?? false);
    const disable = output(args.disable ?? false);
    const disableEprt = output(args.disableEprt ?? false);
    const disableEpsv = output(args.disableEpsv ?? false);
    const disallowUsernameInUrl = output(args.disallowUsernameInUrl ?? false);
    const dnsInterface = output(args.dnsInterface);
    const dnsIpv4Addr = output(args.dnsIpv4Addr);
    const dnsIpv6Addr = output(args.dnsIpv6Addr);
    const dnsServers = output(args.dnsServers);
    const dohCertStatus = output(args.dohCertStatus ?? false);
    const dohInsecure = output(args.dohInsecure ?? false);
    const dohUrl = output(args.dohUrl);
    const dumpHeader = output(args.dumpHeader);
    const egdFile = output(args.egdFile);
    const engine = output(args.engine);
    const etagCompare = output(args.etagCompare);
    const etagSave = output(args.etagSave);
    const expect100Timeout = output(args.expect100Timeout);
    const fail = output(args.fail ?? false);
    const failEarly = output(args.failEarly ?? false);
    const failWithBody = output(args.failWithBody ?? false);
    const falseStart = output(args.falseStart ?? false);
    const form = output(args.form);
    const formEscape = output(args.formEscape ?? false);
    const formName = output(args.formName);
    const ftpAccount = output(args.ftpAccount);
    const ftpAlternativeUser = output(args.ftpAlternativeUser);
    const ftpCreateDirs = output(args.ftpCreateDirs ?? false);
    const ftpMethod = output(args.ftpMethod);
    const ftpPasv = output(args.ftpPasv ?? false);
    const ftpPort = output(args.ftpPort);
    const ftpPret = output(args.ftpPret ?? false);
    const ftpSkipPasvIp = output(args.ftpSkipPasvIp ?? false);
    const ftpSslCccMode = output(args.ftpSslCccMode);
    const urls = output(args.urls).apply(toArray);

    const builder = new CommandBuilder(binaryPath)
      .option('--abstract-unix-socket', abstractUnixSocket)
      .option('--alt-svc', altSvc)
      .option('--any-auth', anyAuth)
      .arg(urls);

    const command = new Command(name, {
      connection,
      environment,
      stdin: args.stdin,
      triggers,
      [lifecycle]: builder.command,
    }, { parent: this });

    this.command = command;
    this.stderr = command.stderr;
    this.stdin = stdin as Output<string> | undefined;
    this.stdout = command.stdout;

    this.registerOutputs({
      binaryPath,
      connection,
      environment,
      lifecycle,
      stderr: command.stderr,
      stdin,
      stdout: command.stdout,
      triggers,
    });
  }
}
