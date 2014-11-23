public class TriBrojaInterval {

	public static void main(String[] args) {
		int broj1 = TextIO.getInt();
		int broj2 = TextIO.getInt();
		int broj3 = TextIO.getInt();
		if ((broj1 < 50 || broj1 > 200) || (broj2 < 50 || broj2 > 200)
				|| (broj3 < 50 || broj3 > 200))
			return;
		int razliciti = 0;
		if (broj1 != broj2)
			razliciti++;
		if (broj2 != broj3)
			razliciti++;
		if (broj1 != broj3)
			razliciti++;
		if ((broj1 > broj2 && broj1 > broj3)) {
			if (broj2 > broj3) {
				System.out.print(broj3 + " " + broj2 + " " + broj1);
			} else
				System.out.print(broj2 + " " + broj3 + " " + broj1);
		} else if ((broj2 > broj1 && broj2 > broj3)) {
			if (broj1 > broj3) {
				System.out.print(broj3 + " " + broj1 + " " + broj1);
			} else {
				System.out.print(broj1 + " " + broj3 + " " + broj2);
			}
		} else if ((broj3 > broj1 && broj3 > broj2)) {
			if (broj1 > broj2) {
				System.out.println(broj2 + " " + broj1 + " " + broj3);
			} else
				System.out.println(broj1 + " " + broj2 + " " + broj3);
		}

		System.out.println(razliciti + " razlicita broja unesena.");
	}

}
