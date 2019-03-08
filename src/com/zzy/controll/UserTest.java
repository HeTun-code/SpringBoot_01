package com.zzy.controll;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zzy.config.MyConfig;
import com.zzy.pojo.User;
import com.zzy.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {
    @Test
    public void test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        ComboPooledDataSource bean = annotationConfigApplicationContext.getBean(ComboPooledDataSource.class);
        System.out.println(bean);
    }
}
