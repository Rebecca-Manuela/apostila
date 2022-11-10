import java.util.Scanner;
public class Tabuada {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		int n, resul, i = 0;
		System.out.println ("Digite um número:");
		n = in.nextInt();
		do {
			resul = n*i;
			System.out.println (n+"x"+i+"="+resul);
			i++;
		} while (i<=10);
		in.close();
	}

}
