https://spring.io/projects/spring-cloud

先启动 configserver，启动后会连不上eureka（因为此时eureka还没启动）

再启动eureka，几分钟后configserver会自动注册上eureka

本地application.yml不支持profiles定义server.port，必须使用本地bootstrap.yml

TODO 日志logback.xml放在公共包内，使用java args传递logback变量
TODO retry BackOff Policies  https://cloud.spring.io/spring-cloud-static/Greenwich.SR3/single/spring-cloud.html#retrying-failed-requests
