"""A Python Pulumi program"""

import pulumi_commandx as commandx

ca = commandx.tls.RootCa("simple",
                 algorithm=commandx.tls.Algorithm.RSA,
                 validity_period_hours=256)

cert = commandx.tls.Certificate("simple",
                        algorithm=commandx.tls.Algorithm.RSA,
                        allowed_uses=[commandx.tls.AllowedUsage.CERT_SIGNING],
                        ca_cert_pem=ca.cert_pem,
                        ca_private_key_pem=ca.private_key_pem,
                        validity_period_hours=256)
