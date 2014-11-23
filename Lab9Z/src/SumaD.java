public class SumaD {
	public static void main(String[] args) {
		int broj;
		do {
			do {
				broj = TextIO.getInt();
				if (broj < 0)
					System.out.println("Unesite prirodan broj!");
			} while (broj < 0);
			int suma = 0;
			for (int i = 1; i <= broj; i++) {
				if (broj % i == 0)
					suma += i;
			}
			if (broj != 0)
				System.out.printf("Suma djelilaca broja %d je %d", broj, suma);
		} while (broj != 0);
	}
}
