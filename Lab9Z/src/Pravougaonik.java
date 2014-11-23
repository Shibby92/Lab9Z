public class Pravougaonik {

	public static void main(String[] args) {
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (((i == 1) || (i == a)) && ((j == 1) || (j == b)))
					System.out.print("+");
				else if ((j == 1) || (j == b))
					System.out.print("|");
				else if (((i == 1) || (i == a)) && ((j != 1) || (j != b)))
					System.out.print("-");
				else
					System.out.print(" ");

			}
			System.out.println();
		}

	}

}
