package no01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test01 {

	@Test
	public void testMemory() throws Exception {

		System.out.println(Runtime.getRuntime().maxMemory());

		System.out.println(Runtime.getRuntime().totalMemory());

		int i = 0;

		String s = "a";

		for (i = 0; i < 20; i++) {

			s += s;

		}

		System.out.println(Runtime.getRuntime().totalMemory());

	}

	@Test
	public void testQuanJiao() {

		String firstStr = "全角； ";

		String secondStr = "全角；　";

		assertEquals("全半角测试", firstStr.trim(), secondStr.trim());

	}

	@Test
	public void testMultiply() {

		Demo01 demo01 = new Demo01();

		// fail("Not yet implemented");
		assertEquals("得到的结果", 0, demo01.multiply(0, 1));

	}

	@Test(timeout = 300, expected = NullPointerException.class)
	public void testFor1200() {

		String s = null;

		s.equals("");

		for (int i = 0; i < 10000; i++) {

			s += i;

		}

	}

}
