# 基于 Docker 安装 ElasticSearch
```
version: '3.3'
services:
  elasticsearch:
    image: wutang/elasticsearch-shanghai-zone:6.3.2
    container_name: elasticsearch
    restart: always
    ports:
      - 9200:9200
      - 9300:9300
    environment:
      cluster.name: elasticsearch
```
## 启动 SkyWalking
http://skywalking.apache.org/downloads/ 这里我们需要下载 6.x releases 版本

下载完成后解压缩，进入 apache-skywalking-apm-incubating/config 目录并修改 application.yml 配置文件
- 注释 H2 存储方案
- 启用 ElasticSearch 存储方案
- 修改 ElasticSearch 服务器地址

修改完配置后，进入 apache-skywalking-apm-incubating\bin 目录，运行 startup.bat 启动服务端
#agent

修改项目的 VM 运行参数，点击菜单栏中的 Run -> EditConfigurations...，此处我们以 nacos-provider 项目为例，修改参数如下
```
-javaagent:F:\gitRepo\apache-skywalking-apm-incubating\agent\skywalking-agent.jar


-Dskywalking.agent.service_name=nacos-provider


-Dskywalking.collector.backend_service=localhost:11800
```

## Java 启动方式
```
java -javaagent:/path/to/skywalking-agent/skywalking-agent.jar -Dskywalking.agent.service_name=nacos-provider -Dskywalking.collector.backend_service=localhost:11800 -jar yourApp.jar
```