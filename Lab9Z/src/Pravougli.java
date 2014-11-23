public class Pravougli {

	public static void main(String[] args) {
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		for (int i = 1; i < a + b; i++) {
			if ((a == Math.sqrt(b * b + i * i))
					|| (b == Math.sqrt(a * a + i * i))
					|| (i == Math.sqrt(b * b + a * a)))
				System.out.println(i);

		}
	}

}
