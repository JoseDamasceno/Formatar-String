import java.util.Scanner;

public class Program_media {

	public static void main(final String[] args) {

		Scanner sc = new Scanner(System.in);

		String original = "JOse asdfl LHgjk DAmasnCeno  ";

		String s01 = original.toLowerCase();// minusculo
		String s02 = original.toUpperCase();//
		String s03 = original.trim();

		String s04 = original.substring(10);
		String s05 = original.substring(8, 27);
		String s06 = original.replace('a','x'); //''
		String s07 = original.replace("jo","ro");//ATEN��O AOS "" ''
		
		int i = original.indexOf("o");
		int j = original.lastIndexOf("sc");

		System.out.println("Original -" + original + "-");
		System.out.println("toLowerCase :" + s01 + "-");// minusculo
		System.out.println("toUpperCase :" + s02 + "-");// MAIUSCULO
		System.out.println("trim :" + s03 + "-");// Retira todos os espa�os em Branco da String;
		System.out.println("substring :" + s04 + "-");// Possi��o da String
		System.out.println("substring :" + s05 + "-");// possicao x ate  outra y
		System.out.println("replace :"+ s06 + "-");//('a','x') troca/subtitui a String pela desejada.
		System.out.println("replace :" + s07 + "-");//("JO","RO") troca/subtitui a String pela desejada.
		System.out.println("indeOf :" + i + " -");
		System.out.println("lastIndeOf :" + j + " -");
	sc.close();
	}
}
