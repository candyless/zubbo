package com.zubbo.service.Impl;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zubbo.api.TestService;

/**
 * @ClassName: TestServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @date 2018年3月20日 上午9:21:04
 */
public class TestServiceImpl implements TestService{

    public static final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);
	
	public void sayHello() {
		log.info("say Hello!");
	}
    
}
