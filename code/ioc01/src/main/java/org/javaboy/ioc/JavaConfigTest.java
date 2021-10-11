package org.javaboy.ioc;

import org.javaboy.ioc.javaconfig.JavaConfig;
import org.javaboy.ioc.javaconfig.SayHello;
import org.javaboy.ioc.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class JavaConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
        SayHello sayHello = ctx.getBean("he",SayHello.class);
        System.out.println(sayHello.sayHello("allboy"));

        UserService userService = ctx.getBean(UserService.class);
        List<String> allUsers = userService.getAllUsers();
        System.out.println("allUsers = " + allUsers);
    }

}
