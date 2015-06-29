package org.tony.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tony.dubbo.demo.provider.DubboDemoProvider;

public class Consumer {
	
	
	
	public static void main(String[] args) {
		  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:*spring/consumer.xml"});
	        context.start();
	
	        DubboDemoProvider demoService = (DubboDemoProvider)context.getBean("demoService"); // 获取远程服务代理
	        String hello = demoService.sayHello("tony"); // 执行远程方法
	 
	        System.out.println( hello ); // 显示调用结果
	}

}
