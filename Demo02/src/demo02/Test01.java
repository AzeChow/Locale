package demo02;

import java.io.File;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;

public class Test01 {

	public static void main22(String[] args) {

		int[] is = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println(Arrays.toString(is));

	}

	private static int i = 0;

	public static void main(String[] args) {

		String folder1 = System.getProperty("java.io.tmpdir")
				+ "LocaleCustomsBaseData" + File.separator + "CustomsBaseData";

		System.out.println(folder1);

	}

	public static File getFile(String path1, String name, String path3) {

		File file = FileUtils.getFile(path1, name);

		if (file.exists()) {

			return file;

		} else {

			i++;

			System.out.println(i + "     ============================== cishu");

			file = getFile(path1 + File.separator + "CustomsBaseData", name,
					path3);

		}

		System.out.println(i + "     ============================== cishu");

		return file;
	}

	public static int factorical(int value) {

		if (value == 0) {

			return 0;

		} else {

			return value * factorical(value - 1);

		}

	}

}
