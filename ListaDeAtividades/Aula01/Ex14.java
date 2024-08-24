package ListaDeAtividades.Aula01;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.next();
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.println("Meu nome é "+nome+", tenho "+idade+" anos");
    }
}
