public class NFibo {

	public static void main(String[] args) {
		int fibo = 1;
		int naci = 1;
		int temp = 1;
		int n = TextIO.getInt();
		if ((n < 0) || (n > 50)) {
			System.out.println("Uneseni broj izvan dometa!");
			return;
		}
		int brojac = 2;
		while (brojac != n) {
			fibo += naci;
			naci = temp;
			temp = fibo;
			brojac++;
		}
		System.out.println(fibo);

	}

}