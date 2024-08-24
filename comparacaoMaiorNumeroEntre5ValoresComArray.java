import java.util.Scanner;

public class comparacaoMaiorNumeroEntre5ValoresComArray {
    public static void visualizaMaiores(Integer maiorValor, Integer maiorPosicao) {
        System.out.println("\nO maior valor é "+maiorValor+" na "+maiorPosicao+"° Posição");
    }

    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        final Integer quantidades = 5;
        Integer numeros[] = new Integer[quantidades];
        Integer maiorValor=0,maiorPosicao=0;

        for (int i = 0; i< quantidades; i++){
            System.out.println("Informe o "+(i+1)+" valor: ");
            numeros[i] = prompt.nextInt();

            if(numeros[i] == 0){
                maiorValor = numeros[1];
                maiorPosicao = i+1;
            } else if (numeros[i] > maiorValor){
                maiorValor = numeros[i];
                maiorPosicao = i+1;
            }
        }

        System.out.println("Os valores recebidos forma:");
        for (int i = 0; i < quantidades; i++) {
            System.out.println((i+1)+"° Posição = "+numeros[i]);
        }

        visualizaMaiores(maiorValor,maiorPosicao);
    }
}
