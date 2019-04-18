package com.xxm.spring.cloud.alibaba.rocketmq.provider;

import com.xxm.spring.cloud.alibaba.rocketmq.provider.service.RockerMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

@SpringBootApplication
@EnableBinding({Source.class})
public class RocketMQproviderApplication implements CommandLineRunner {

    @Autowired
    private RockerMqService providerService;

    public static void main(String[] args) {
        SpringApplication.run(RocketMQproviderApplication.class, args   );
    }


    /**
     * 实现了 CommandLineRunner 接口，只是为了 Spring Boot 启动时执行任务，不必特别在意
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        providerService.send("Hello RockerMQ");
    }
}
