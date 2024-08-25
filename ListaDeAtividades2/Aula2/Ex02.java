package ListaDeAtividades2.Aula2;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.next();
        System.out.println("Informe seu endereco: ");
        String endereco = sc.next();
        System.out.println("Informe seu telefone: ");
        int tel = sc.nextInt();

        System.out.println("NOME: "+nome);
        System.out.println("ENDERECO: "+endereco);
        System.out.println("TELEFONE: "+tel);
    }
}
