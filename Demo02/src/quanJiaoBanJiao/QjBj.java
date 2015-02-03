package quanJiaoBanJiao;

public class QjBj {

	public static void main(String[] args) {

		for (int i = Character.MIN_VALUE; i <= Character.MAX_VALUE; ++i) {

			System.out.println(i + "    " + (char) i);

		}

		/*
		 * 从输出可以看到
		 * 
		 * 1.半角字符是从33开始到126结束 ------------ 2.与半角字符对应的全角字符是从65281开始到65374结束
		 * ---------------------3.其中半角的空格是32.对应的全角空格是12288 半角和全角的关系很明显,
		 * 除空格外的字符偏移量是65248(65281-33 =65248)
		 */

	}

	/**
	 * 全角字符串转换半角字符串
	 * 
	 * @param fullWidthStr
	 *            非空的全角字符串
	 * @return 半角字符串
	 */
	private static String fullWidth2halfWidth(String fullWidthStr) {

		if (null == fullWidthStr || fullWidthStr.length() <= 0) {

			return "";

		}

		char[] charArray = fullWidthStr.toCharArray();

		// 对全角字符转换的char数组遍历
		for (int i = 0; i < charArray.length; ++i) {

			int charIntValue = (int) charArray[i];

			// 如果符合转换关系,将对应下标之间减掉偏移量65248;如果是空格的话,直接做转换
			if (charIntValue >= 65281 && charIntValue <= 65374) {

				charArray[i] = (char) (charIntValue - 65248);

			} else if (charIntValue == 12288) {

				charArray[i] = (char) 32;

			}
		}

		return new String(charArray);
	}

}
