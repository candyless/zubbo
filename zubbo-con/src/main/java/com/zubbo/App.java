package com.zubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zubbo.api.TestService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext cxa = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
         cxa.start();
         TestService test = (TestService)cxa.getBean("testService");
         test.sayHello();
         System.out.println("sdfa");
    }
}
