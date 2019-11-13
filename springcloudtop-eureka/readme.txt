eureka集群主要配置点：

instance
	hostname			在系统hosts文件定义
	preferIpAddress		使用默认false（使用true导致unavailable-replicas）
	
client
	registerWithEureka	使用默认true
	fetchRegistry		使用默认true
	serviceUrl			使用hostname风格（不能用ip），填其他节点（不包括本身）的地址


系统hosts文件：

192.168.56.101  eureka.node1
192.168.56.102  eureka.node2
192.168.56.103  eureka.node3
