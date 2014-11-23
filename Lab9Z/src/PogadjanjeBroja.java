public class PogadjanjeBroja {

	public static void main(String[] args) {
		int random = (int) (1 + (Math.random() * 100 + 1));
		int brojac = 0;
		int broj;
		do {
			broj = TextIO.getInt();
			brojac++;
			if (broj < random)
				System.out.println("Vise");
			else if (broj > random)
				System.out.println("Manje");
			else {
				System.out.println("Pogodak!");
				broj = -1;
			}

		} while (broj != -1);
		System.out.println("Broj pokusaja: " + brojac);

	}

}
