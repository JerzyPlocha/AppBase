package com.jp.base.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Author: Jerzy Plocha on 29/06/16.
 */
@Configuration
public class DataConfig {

    @Bean
    public DataSource dataSource() {

        BasicDataSource ds = new BasicDataSource();

        ds.setUrl("jdbc:mysql://localhost:3306/base");
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("123qwe");
        ds.setInitialSize(2);
        ds.setMaxTotal(5);

        return ds;
    }
}
