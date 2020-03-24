package com.jmr.shopping;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("resources.mapper")
public class ShoppingMallApplication {

//    @Bean
//    @ConfigurationProperties(prefix = "db")
//    public DataSource dateSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        return dataSource;
//    }

    public static void main(String[] args) {
        SpringApplication.run(ShoppingMallApplication.class, args);
    }

}
