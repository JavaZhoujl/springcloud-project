package com.zhoujl.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.refresh.ContextRefresher;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Set;

@SpringBootApplication
@EnableScheduling
public class ConfigClientApplication
{
    /*private final ContextRefresher contextRefresher;

    private final Environment environment;

    @Autowired
    public ConfigClientApplication(ContextRefresher contextRefresher, Environment environment) {
        this.contextRefresher = contextRefresher;
        this.environment = environment;
    }*/

    public static void main(String[] args )
    {
        SpringApplication.run (ConfigClientApplication.class, args);
    }

    /*@Scheduled(fixedRate = 5 * 1000, initialDelay = 3 * 1000)
    public void autoRefresh() {
        Set<String> refresh = contextRefresher.refresh ();
        refresh.forEach (propertyName->
            System.err.printf ("[Thread :%s] 当前配置已更新，具体 Key：%s , Value : %s \n",
                    Thread.currentThread().getName(),
                    propertyName,
                    environment.getProperty(propertyName)
            )
        );
    }*/
}
