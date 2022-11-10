import java.util.Scanner;
public class Fatorial{
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        int f, n;
        System.out.println ("Digite o número:");
        n = in.nextInt();
        f = n;
        do{
            System.out.println (n+"x");
            n = n-1;
            f = f*n;
            System.out.println (n+"="+f);
        } while (n>1);
        f++;
        in.close();
    }
}