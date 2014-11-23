public class InternetFirme {

	public static void main(String[] args) {
		int brojSati = TextIO.getInt();
		double prvaFirma = 10 + brojSati * 0.5;
		double drugaFirma = brojSati * 0.8;
		if (prvaFirma > drugaFirma)
			System.out.println("Druga je firma isplatnija!");
		else
			System.out.println("Prva firma je isplatnija!");
	}

}
