package no01;

import junit.framework.TestCase;

public class TestPerson extends TestCase {

	public void testSay() {

		Person person = new Person(" Jacker ");

		String str = person.say();

		assertNotNull("Ӧ��Ҫ����ǿ�ֵ", str);

	}

}
