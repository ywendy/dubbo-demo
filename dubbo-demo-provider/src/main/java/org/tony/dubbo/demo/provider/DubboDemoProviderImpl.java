package org.tony.dubbo.demo.provider;

public class DubboDemoProviderImpl implements DubboDemoProvider {

	public String sayHello(String name) {

		System.out.println("hello world!" + name);
		return "hello:" + name;
	}

}
