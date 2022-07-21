package com.gmy.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author gmydl
 * @title: ContextConfig
 * @projectName CloudStudy
 * @description: 配置类
 * @date 2022/7/21 13:32
 */
@Configuration
public class ContextConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
