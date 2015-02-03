package no01;

public class Person {

	private String name;

	public Person() {

	}

	public Person(String _name) {

		name = _name;
	}

	public String say() {

		return "Hello , I am " + name + " ! ";

	}

}
