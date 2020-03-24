springcloud集成seata

基于springcloudtop-feigh添加seata

参考 https://github.com/seata/seata-samples.git 的 springcloud-eureka-feign-mybatis-seata


关于
TransactionException[begin global request failed. xid=null, msg=Data truncation: Data too long for column 'application_id' at ro

是因为seata server的global_table表的application_id长度不够
