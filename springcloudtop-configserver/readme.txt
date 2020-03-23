关于启动报错：

java.security.InvalidAlgorithmParameterException: the trustAnchors parameter must be non-empty

解决方案：
On Red Hat Linux/CentOS, you can do the same from the "ca-certificates" package:


sudo yum install ca-certificates
cp /etc/pki/java/cacerts /path/to/jdk/jre/lib/security/cacerts
