package com.zubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zubbo.api.TestService;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger log = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext cxa = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
         cxa.start();
         TestService test = (TestService)cxa.getBean("testService");
         test.sayHello();
         log.info("Hello it's me!");
         
    }
}
