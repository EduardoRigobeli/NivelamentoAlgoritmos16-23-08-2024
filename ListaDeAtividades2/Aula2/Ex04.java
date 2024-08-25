package ListaDeAtividades2.Aula2;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe tres números abaixo");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int soma = a+b+c;
        int subtracao = a-b-c;
        double multuplicacao = a*b*c;
        int divisao = a/b/c;

        System.out.println("RESULTADOS");
        System.out.println("SOMA: "+soma);
        System.out.println("SUBTRACAO: "+subtracao);
        System.out.println("MULTIPLICACAO: "+multuplicacao);
        System.out.println("DIVISAO: "+divisao);
    }
}
