package nullX;

import org.junit.Test;

public class TestNull {

	@Test
	public void testNianzhongjiang() throws Exception {

		int nzj = Integer.valueOf("101010101", 2);

		System.out.println(nzj);

	}

	@Test
	public void testNull() {

		Person p = new Person();

		if (p.getName() == Person.STATE)

			System.out.println("hahhaa");

	}

}

class Person {

	public static String STATE = "1bc";

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}