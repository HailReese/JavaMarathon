package day8;

public class Task1 {
	public static void main(String[] args) {
		// решение через StringBuilder
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 10000; i++) {
			if (i < 10000)
				sb.append(Integer.toString(i) + ", ");
			else
				sb.append(Integer.toString(i));
		}
		System.out.println(sb.toString());

		// решение через конкатенацию
		String str = null;
		for (int i = 0; i <= 10000; i++) {
			if (i < 10000)
				str += Integer.toString(i) + ", ";
			else
				str += Integer.toString(i);
		}
		System.out.println(str);
	}
}
