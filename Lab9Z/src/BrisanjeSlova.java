public class BrisanjeSlova {

	public static void main(String[] args) {
		String recenica = TextIO.getln();
		String slovo = TextIO.getln();
		String temp;
		String veliko = slovo.toUpperCase();
		temp = recenica.replaceAll(slovo, "");
		temp = temp.replaceAll(veliko, "");
		System.out.println(temp);
	}

}
