package demo02;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class TestFilePath {

	public static void main(String[] args) {

		File file = null;

		String vName = "CustomsBaseData.xml";

		// �ӱ����ϲ��� �汾�б��ļ�
		file = FileUtils.getFile(getCustomsBaseDataFolderForLocalUpdate(),
				vName);

		if (!file.exists()) {

			file = FileUtils.getFile(getCustomsBaseDataFolderForLocalUpdate()
					+ File.separator + "CustomsBaseData");

			if (!file.exists()) {

				System.out.println(" ------------------- ��������ھ����￴����");

			} else {

				System.out.println("!Ysy!");

				System.out.println(file.getAbsoluteFile().getName());

			}

		}

		System.out.println(file.getPath());

	}

	private static String getCustomsBaseDataFolderForLocalUpdate() {

		// ��ȡĿ¼ |*****/CustomsBaseData/|
		String folder = System.getProperty("java.io.tmpdir") + File.separator
				+ "CustomsBaseData";

		File file = new File(folder);

		// �ļ��Ƿ����
		if (!file.exists()) {

			// �����ļ�Ŀ¼
			file.mkdirs();

		}

		return folder;
	}

}
