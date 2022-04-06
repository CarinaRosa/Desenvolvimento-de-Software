import java.util.Random;
import java.util.Scanner;

public class jogo {
    //Atributos
    //Rotinas principais

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        boolean acerto = false;
        int tentativa = 10;
        int numSorteado = gerador.nextInt(100);
        long adivinha = 0;

        //System.out.println(numSorteado);

        while (tentativa > 0 && acerto ==  false) {
            System.out.println("Digite um numero: ");
            adivinha = teclado.nextLong();

            if (numSorteado == adivinha) {
                System.out.println("Parabens, você acertou!! ");
                acerto = true;
            } else if (adivinha < numSorteado) {
                --tentativa;
                System.out.println("Numero informado muito baixo, tente um numero maior. Você possui " + tentativa + " tentativas restantes.");                
            } else if (adivinha > numSorteado){
                --tentativa;
                System.out.println("Numero informado muito alto, tente um numero menor. Você possui " + tentativa + " tentativas restantes.");
            }

            if (tentativa == 0) {
                System.out.println("Suas tentativas acabaram e você não conseguiu acertar o numero.");
            }
        }

        teclado.close();

    }
}
