import java.util.Scanner;
public class NomeIdade{
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        int i = 1. nome, idade, nomeVelho, idadeVelho, nomeNovo, idadeNovo;
        for (i<=10){
        System.out.println ("Digite o nome:");
        nome = in.nextInt();
        System.out.println ("Digite a idade:");
        idade = in.nextInt();
        (nomeVelho = nome);
        (nomeNovo = nome);
        (idadeVelho = idade);
        (idadeNovo = idade);
        if (idade>idadeVelho){
            (nomeVelho = nome);
            (idadeVelho = idade);
        } else {
            (nomeNovo = nome);
            (idadeNovo = idade);
        }
        System.out.println ("O mais velho é"+nomeVelho+"com"+idadeVelho+"anos e o mais novo é"+nomeNovo+"com"+idadeNovo+"anos");
        }
        i++;
        in.close();
    }
}