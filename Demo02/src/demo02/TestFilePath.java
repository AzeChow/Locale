package demo02;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class TestFilePath {

	public static void main(String[] args) {

		File file = null;

		String vName = "CustomsBaseData.xml";

		// 从本地上查找 版本列表文件
		file = FileUtils.getFile(getCustomsBaseDataFolderForLocalUpdate(),
				vName);

		if (!file.exists()) {

			file = FileUtils.getFile(getCustomsBaseDataFolderForLocalUpdate()
					+ File.separator + "CustomsBaseData");

			if (!file.exists()) {

				System.out.println(" ------------------- 如果不存在就这里看到了");

			} else {

				System.out.println("!Ysy!");

				System.out.println(file.getAbsoluteFile().getName());

			}

		}

		System.out.println(file.getPath());

	}

	private static String getCustomsBaseDataFolderForLocalUpdate() {

		// 获取目录 |*****/CustomsBaseData/|
		String folder = System.getProperty("java.io.tmpdir") + File.separator
				+ "CustomsBaseData";

		File file = new File(folder);

		// 文件是否存在
		if (!file.exists()) {

			// 创建文件目录
			file.mkdirs();

		}

		return folder;
	}

}
