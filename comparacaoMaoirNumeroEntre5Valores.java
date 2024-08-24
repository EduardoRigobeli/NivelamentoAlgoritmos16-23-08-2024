import java.util.Scanner;

//2. Escreva um progrma para ler 5 valores (valide para não aparecer
// valores iguais) e escrever o maior deles e qual posição ele foi informado

public class comparacaoMaoirNumeroEntre5Valores {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Integer maiorValor,maiorPosicao;

        System.out.print("Informe o primeiro numero: ");
        Integer numero1 = prompt.nextInt();
        maiorValor = numero1;
        maiorPosicao = 1;

        System.out.print("Informe o seguno numero: ");
        Integer numero2 = prompt.nextInt();
        if (numero2>maiorValor) {
            maiorValor = numero2;
            maiorPosicao = 2;
        }

        System.out.print("Informe o terceiro numero: ");
        Integer numero3 = prompt.nextInt();
        if (numero3 > maiorValor) {
            maiorValor = numero3;
            maiorPosicao = 3;
        }

        System.out.print("Informe o quarto numero: ");
        Integer numero4 = prompt.nextInt();
        if (numero4 > maiorValor) {
            maiorValor = numero4;
            maiorPosicao = 4;
        }

        System.out.print("Informe o quinto numero: ");
        Integer numero5 = prompt.nextInt();
        if (numero5 > maiorValor){
            maiorValor = numero5;
            maiorPosicao = 5;
        }

        System.out.println("O maior valor informado foi "+maiorValor+" informado pela "+maiorPosicao+"° posicao");
    }
}
