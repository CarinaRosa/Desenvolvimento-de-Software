import java.util.Random;
import java.util.Scanner;

public class loteria {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();      
       
        int vetor[] = new int[6];
        int num;
        

        //Para o Random não gerar numeros repetidos
        for (int i = 0; i < vetor.length; i++) {
            num = gerador.nextInt(60)+1;
            for (int j = 0; j < vetor.length; j++) {
                if (num == vetor[j] && j != i) {
                    num = gerador.nextInt(60)+1;
                }else{
                    vetor[i] = num;
                }
            }

            
        }

        //Validar se realmente não foram repetidos
        /*for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]  + " ");
        }*/



        //Solicitar que o usuario insira os numeros

        int vetor2[] = new int[6];
        

        System.out.println("Digite o primeiro numero da sorte: ");
        int jogada1 = teclado.nextInt();
        System.out.println("Digite o segundo numero da sorte: ");
        int jogada2 = teclado.nextInt();
        System.out.println("Digite o terceiro numero da sorte: ");
        int jogada3 = teclado.nextInt();
        System.out.println("Digite o quarto numero da sorte: ");
        int jogada4 = teclado.nextInt();
        System.out.println("Digite o quinto numero da sorte: ");
        int jogada5 = teclado.nextInt();
        System.out.println("Digite o sexto numero da sorte: ");
        int jogada6 = teclado.nextInt();

        //Validar se os numeros sorteados são iguais aos numeros do usuario

        //retornar recompensa
        
        
        teclado.close();
    }
}
