package no01;

import junit.framework.TestCase;

public class TestPerson extends TestCase {

	public void testSay() {

		Person person = new Person(" Jacker ");

		String str = person.say();

		assertNotNull("应该要输出非空值", str);

	}

}
