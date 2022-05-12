package com.wpf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 测试
 * @author: weixiaohuai
 * @Date: 2021/4/7 15:01
 */
public class SpringDemo {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
		User user = (User) applicationContext.getBean("user");
		user.hello();
	}
}
