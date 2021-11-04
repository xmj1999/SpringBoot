package com.boot.Config;

import com.boot.Bean.Pet;
import com.boot.Bean.Stu;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration(proxyBeanMethods = false)
public class MyConfig {
    @Bean
    public Pet pig(){
        return new Pet("pp",12);
    }
}
