package quanJiaoBanJiao;

public class QjBj {

	public static void main(String[] args) {

		for (int i = Character.MIN_VALUE; i <= Character.MAX_VALUE; ++i) {

			System.out.println(i + "    " + (char) i);

		}

		/*
		 * ��������Կ���
		 * 
		 * 1.����ַ��Ǵ�33��ʼ��126���� ------------ 2.�����ַ���Ӧ��ȫ���ַ��Ǵ�65281��ʼ��65374����
		 * ---------------------3.���а�ǵĿո���32.��Ӧ��ȫ�ǿո���12288 ��Ǻ�ȫ�ǵĹ�ϵ������,
		 * ���ո�����ַ�ƫ������65248(65281-33 =65248)
		 */

	}

	/**
	 * ȫ���ַ���ת������ַ���
	 * 
	 * @param fullWidthStr
	 *            �ǿյ�ȫ���ַ���
	 * @return ����ַ���
	 */
	private static String fullWidth2halfWidth(String fullWidthStr) {

		if (null == fullWidthStr || fullWidthStr.length() <= 0) {

			return "";

		}

		char[] charArray = fullWidthStr.toCharArray();

		// ��ȫ���ַ�ת����char�������
		for (int i = 0; i < charArray.length; ++i) {

			int charIntValue = (int) charArray[i];

			// �������ת����ϵ,����Ӧ�±�֮�����ƫ����65248;����ǿո�Ļ�,ֱ����ת��
			if (charIntValue >= 65281 && charIntValue <= 65374) {

				charArray[i] = (char) (charIntValue - 65248);

			} else if (charIntValue == 12288) {

				charArray[i] = (char) 32;

			}
		}

		return new String(charArray);
	}

}
