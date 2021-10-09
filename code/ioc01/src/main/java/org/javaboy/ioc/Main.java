package org.javaboy.ioc;

import org.javaboy.ioc.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        FileSystemXmlApplicationContext ctx1 = new FileSystemXmlApplicationContext("D:\\spring\\code\\ioc01\\src\\main\\resources\\applicationContext.xml");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
         //跟他要
//        m1(ctx);
//        m3(ctx);
          m4(ctx);
    }

    private static void m4(ClassPathXmlApplicationContext ctx) {
        User u4 = ctx.getBean("user4", User.class);
        System.out.println("user4 = " + u4);
    }

    private static void m3(ClassPathXmlApplicationContext ctx) {
        User user3 = ctx.getBean("user3", User.class);
        System.out.println("user3 = " + user3);
    }

    private static void m1(ClassPathXmlApplicationContext ctx) {
        User u1 = (User) ctx.getBean("user");
        User u2 = ctx.getBean("user2", User.class);
        System.out.println("u1 = " + u1);
        System.out.println("u2 = " + u2);
    }
}
