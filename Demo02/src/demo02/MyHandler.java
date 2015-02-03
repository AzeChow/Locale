package demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

	private Object target;

	public MyHandler(Object target) {

		this.target = target;

	}

	@Override
	public Object invoke(Object target, Method method, Object[] params)
			throws Throwable {

		System.out.println(" --------- before --------------");

		Object obj = method.invoke(target, params);

		System.out.println("----------- after ------------------");

		return obj;
	}

}
