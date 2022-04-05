import java.util.Random;
import java.util.Scanner;

public class jogo {
    //Atributos
    public static Scanner teclado;
    public static int[] vetor;

    //Funções e procedimentos
    public static void adivinhar(){
        Random gerador = new Random();
        vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(100) +1;
        }
    }

    public static int procurar(int n){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                return i;
            }else if (vetor[i] > n) {
                System.out.println("O numero sorteado é maior do que o digitado.");
            }else {
                System.out.println("O numero sorteado é menor do que o digitado.");
            }

        }
        return -1;
    }
    
    //Rotinas principais

    public static void main(String[] args) {
        adivinhar();
        teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = teclado.nextInt();
        int pos = procurar(num);
        int tentativas = 10;
        
    }
}
