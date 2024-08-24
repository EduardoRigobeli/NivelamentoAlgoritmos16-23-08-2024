import java.util.Scanner;

public class validacaoDeSenha {
    public static void main(String[] args) {
        Scanner prompt = new Scanner (System.in);
        final Integer senhaCorreta = 12345, quantidadeMaximaTentativas=3;
        Integer senhaDigitada = 0,quantadadeTentativas=0;
        do {
            System.out.print("Informe a senha: ");
            senhaDigitada= prompt.nextInt();
            if(!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("A senha esta incorreta");
                quantadadeTentativas++;
            }
        }while (!senhaDigitada.equals(senhaCorreta) && quantadadeTentativas < quantidadeMaximaTentativas);

        if (quantadadeTentativas.equals(quantidadeMaximaTentativas)){
            System.out.println("Sua conta esta bloqueada por tentar mais de "+quantidadeMaximaTentativas+"X a senha");
        } else {
            System.out.println("Senha Correta");
        }
    }
}
