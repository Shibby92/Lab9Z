public class StraniceTrougla {

	public static void main(String[] args) {
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		int c = 0;
		while ((a + b <= c) || (a + c <= b) || (b + c <= a))
			c++;
		System.out.println(c);
	}

}