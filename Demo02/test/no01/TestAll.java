package no01;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestAll extends TestSuite {

	public static Test suite() {

		TestSuite suite = new TestSuite("TestSuite Test");

		suite.addTestSuite(TestPerson.class);

		return suite;

	}

	public static void main(String[] args) {

		TestRunner.run(suite());

	}

}
