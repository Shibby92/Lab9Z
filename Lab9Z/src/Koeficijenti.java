public class Koeficijenti {

	public static void main(String[] args) {
		System.out.println("Unesite koeficijente a, b i c: ");
		double a = TextIO.getDouble();
		double b = TextIO.getDouble();
		double c = TextIO.getDouble();
		if ((a < -10 || a > 10) || (b < -10 || b > 10) || (c < -10 || c > 10)) {
			System.out.println("Koeficienti a, b, c nisu u zadanom intervalu!");
			return;
		}
		System.out.println("Unesite tacku x: ");
		int x = TextIO.getInt();
		double rezultat = a * Math.pow(x, 2) + b * x + c;
		System.out.printf("f(%d) = %f", x, rezultat);

	}

}
