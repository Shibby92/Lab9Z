public class SumaCifri {

	public static void main(String[] args) {
		int broj = TextIO.getInt();
		int suma = 0;
		while (broj != 0) {
			suma += broj % 10;
			broj /= 10;
		}
		System.out.println("Suma cifri je: " + suma);

	}

}
