package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.UserBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserBean user1 = context.getBean("User",UserBean.class);
        UserBean user2 = context.getBean("User",UserBean.class);
        UserBean user3 = context.getBean("User",UserBean.class);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
