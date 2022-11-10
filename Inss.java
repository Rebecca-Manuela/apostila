import java.util.Scanner;
public class Inss {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double salario, inss;
		int i = 1;
		while (i<=4) {
			System.out.println ("Digite seu salário:");
			salario = in.nextDouble();
			if (salario<2000) {
				inss = (2000-salario*8.5)/100;
				System.out.println ("O desconto é:"+inss);
			} else {
				inss = (salario-2000*11)/100;
				System.out.println ("O desconto é:"+inss);
			}
		}
		i++;
		in.close();
	}

}
