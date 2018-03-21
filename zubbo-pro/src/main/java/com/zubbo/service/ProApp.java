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
    	com.alibaba.dubbo.container.Main.main(args);
    }
    
    public static void startBySpring() throws InterruptedException {
    	ClassPathXmlApplicationContext cxa = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        cxa.start();
        synchronized (ProApp.class) {
     	   while (true) {
     		   ProApp.class.wait();
 		 }
        }
    }
    
}
