import { Config } from '@pulumi/pulumi';
import * as remote from '@unmango/pulumi-commandx/remote';

const config = new Config();
const connection = {
  host: config.require('host'),
  port: config.requireNumber('port'),
  user: config.require('user'),
  password: config.require('password'),
};

const chmod = new remote.Chmod('chmod', {
  connection,
});
