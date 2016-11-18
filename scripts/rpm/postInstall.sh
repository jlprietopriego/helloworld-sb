#!/bin/sh
chown daemon-demo:daemon-demo /opt/local/daemon-demo/log
ln -s /etc/init.d/daemon-demo /etc/rc2.d/S90daemon-demo
ln -s /etc/init.d/daemon-demo /etc/rc3.d/S90daemon-demo
ln -s /etc/init.d/daemon-demo /etc/rc4.d/S90daemon-demo
ln -s /etc/init.d/daemon-demo /etc/rc5.d/S90daemon-demo