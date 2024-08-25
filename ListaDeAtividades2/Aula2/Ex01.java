package ListaDeAtividades2.Aula2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int n1 = sc.nextInt();
        int res = n1 / 2;

        System.out.println("A metade de "+n1+" é "+res);
    }
}
