package ListaDeAtividades2.Aula2;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Informe um numero");
        int a = sc.nextInt();
        System.out.println("Informe um segundo numero");
        int b = sc.nextInt();
        System.out.println("Informe o terceiro numero");
        int c = sc.nextInt();

        int d = a+b-c;

        System.out.println("O resulado é "+d);
    }
}
