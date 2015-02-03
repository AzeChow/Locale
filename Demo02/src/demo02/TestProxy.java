package demo02;

import java.lang.reflect.Proxy;

public class TestProxy {

	public static void main(String[] args) {

		MyImplment implement = new MyImplment();

		MyHandler handler = new MyHandler(implement);

		MyInterface interfaxe = (MyInterface) Proxy.newProxyInstance(implement
				.getClass().getClassLoader(), implement.getClass()
				.getInterfaces(), handler);

		interfaxe.say();

	}

}
