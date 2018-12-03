package nxy;

/**
 * ������
 * 
 * @author yancy
 *
 */
public class ArrayAlg {
	/**
	 * ������Сֵ�����ֵ��pair
	 * 
	 * @param a
	 *            ��������
	 * @return
	 */
	public static Pair<String> minmax(String[] a) {
		if (a == null || a.length == 0)
			return null;
		String min = a[0];
		String max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min.compareTo(a[i]) > 0)
				min = a[i];
			if (max.compareTo(a[i]) < 0)
				max = a[i];
		}
		return new Pair<String>(min, max);
	}

	/**
	 * ���췽��
	 */
	public ArrayAlg() {
		System.out.println("use constructor");
	}
}
