public class Presjek {

	public static void main(String[] args) {
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		int c = TextIO.getInt();
		int d = TextIO.getInt();
		if ((b >= c) && (c >= a))
			System.out.printf("Presjek je [%d , %d]", c, b);
		else if ((c <= a) && (a <= d))
			System.out.printf("Presjek je [%d , %d]", a, d);
		else
			System.out.println("Skupovi se ne sijeku!");

	}

}
