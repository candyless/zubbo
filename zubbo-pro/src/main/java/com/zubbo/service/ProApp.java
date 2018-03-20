package com.zubbo.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zubbo.api.TestService;

/**
 * Hello world!
 *
 */
public class ProApp 
{
    public static void main( String[] args ) throws InterruptedException, IOException
    {
       ClassPathXmlApplicationContext cxa = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
       cxa.start();
       synchronized (ProApp.class) {
    	   while (true) {
    		   ProApp.class.wait();
		}
       }
    }
}
