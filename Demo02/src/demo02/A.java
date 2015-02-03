package demo02;

public class A extends B {

	private int name;

	public A(String _name) {

		super.setName(_name);

		System.out.println(super.getName());

		this.setName("xxxx");

	}

}

class B {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}