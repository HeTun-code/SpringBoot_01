package com.zzy.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zzy.dao.impl.UserDaoImpl;
import com.zzy.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(value = "com.zzy")
@PropertySource(value = "classpath:mysql.properties", ignoreResourceNotFound = true)
public class MyConfig {

    @Value("${driverClass}")
    private String driverClass;
    @Value("${dbUrl}")
    private String dbUrl;
    @Value("${dbUser}")
    private String dbUser;
    @Value("${dbPSW}")
    private String dbPSW;

    @Bean
    public UserDaoImpl getUserDao() {
        return new UserDaoImpl();
    }

    @Bean
    public UserServiceImpl getUserImpl() {
        return new UserServiceImpl();
    }

    @Bean
    public ComboPooledDataSource getcomboPooledDataSource() throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(driverClass);
        comboPooledDataSource.setJdbcUrl(dbUrl);
        comboPooledDataSource.setUser(dbUser);
        comboPooledDataSource.setPassword(dbPSW);
        return comboPooledDataSource;
    }
}
