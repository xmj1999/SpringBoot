package com.boot;

import com.boot.Bean.Pet;
import com.boot.Config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run= SpringApplication.run(MainApplication.class, args);
//        MyConfig bean=run.getBean(MyConfig.class);
//        Pet pet01=run.getBean("pig", Pet.class);
//        Pet pet02=bean.pig();
//        System.out.println(pet01==pet02);
    }
}
