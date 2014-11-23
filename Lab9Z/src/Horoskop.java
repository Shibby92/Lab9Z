public class Horoskop {
	public static void main(String[] args) {
		int dan = TextIO.getInt();
		int mjesec = TextIO.getInt();
		if (((dan >= 21) && (mjesec == 3)) || ((dan <= 19) && (mjesec == 4)))
			System.out.println("OVAN");
		else if (((dan >= 20) && (mjesec == 4))
				|| ((dan <= 20) && (mjesec == 5)))
			System.out.println("BIK");
		else if (((dan >= 21) && (mjesec == 5))
				|| ((dan <= 20) && (mjesec == 6)))
			System.out.println("BLIZANCI");
		else if (((dan >= 21) && (mjesec == 6))
				|| ((dan <= 22) && (mjesec == 7)))
			System.out.println("RAK");
		else if (((dan >= 23) && (mjesec == 7))
				|| ((dan <= 22) && (mjesec == 8)))
			System.out.println("LAV");
		else if (((dan >= 23) && (mjesec == 8))
				|| ((dan <= 22) && (mjesec == 9)))
			System.out.println("DJEVICA");
		else if (((dan >= 23) && (mjesec == 9))
				|| ((dan <= 22) && (mjesec == 10)))
			System.out.println("VAGA");
		else if (((dan >= 23) && (mjesec == 10))
				|| ((dan <= 21) && (mjesec == 11)))
			System.out.println("SKORPIJA");
		else if (((dan >= 22) && (mjesec == 11))
				|| ((dan <= 21) && (mjesec == 12)))
			System.out.println("STRIJELAC");
		else if (((dan >= 22) && (mjesec == 12))
				|| ((dan <= 19) && (mjesec == 1)))
			System.out.println("JARAC");
		else if (((dan >= 20) && (mjesec == 1))
				|| ((dan <= 18) && (mjesec == 2)))
			System.out.println("VODLIJA");
		else
			System.out.println("RIBE");

	}

}
