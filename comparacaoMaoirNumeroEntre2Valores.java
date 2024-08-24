import java.util.Scanner;
//1. Escreva um progrma para ler 2 valores (valide para não aparecer
// valores iguais) e escrever o maior deles.
public class comparacaoMaoirNumeroEntre2Valores {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.print("Informe o primeiro numero: ");
        Integer numero1 = prompt.nextInt();
        System.out.print("Informe o seguno numeoro: ");
        Integer numero2 = prompt.nextInt();

        if (numero1 > numero2){
            System.out.println("O numero 1: "+numero1+" é maior que o numero 2: "+numero2);
        } else if (numero1 < numero2) {
            System.out.println("O numero 2: "+numero2+" é maior que o numero 1: "+numero1);
        } else {
            System.out.println("O numero 1: "+numero1+" é igual ao numero 2: "+numero2);
        }
    }
}
