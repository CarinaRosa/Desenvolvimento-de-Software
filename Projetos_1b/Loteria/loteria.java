
import java.util.Scanner;


public class loteria {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //Random gerador = new Random();      
       
        int vetor[] = new int[]{1,2,3,4,5,6};
        //int num;
        

        //Para o Random não gerar numeros repetidos
        /*for (int i = 0; i < vetor.length; i++) {
            num = gerador.nextInt(60)+1;
            for (int j = 0; j < vetor.length; j++) {
                if (num == vetor[j] && j != i) {
                    num = gerador.nextInt(60)+1;
                }else{
                    vetor[i] = num;
                }
            }

            
        }*/

        //Validar se realmente não foram repetidos
        /*for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]  + " ");
        }*/



        //Solicitar que o usuario insira os numeros

        int vetor2[] = new int[6];
        int contador = 0;

        do {
            System.out.println("Digite um numero da sorte: ");
            int numSorte = teclado.nextInt();

            if (numSorte > 0 && numSorte <= 60) {
                vetor2[contador] = numSorte;
                contador++;
            }else{ // Validar que seja de 1 a 60
                System.out.println("Informe um numero de 1 a 60.");
            }
        } 
        
        //Mostrar os numeros que o usuario inseriu
        while (contador < vetor2.length);{

            System.out.println("Os numeros que você escolheu foram: ");
        //Teste se o vetor esta funcionando
            for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor2[i]  + " ");
            
            }

        }

        //Mostrar os numeros que foram sorteados pelo Random
        System.out.println("Os numeros Sorteados foram: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]  + " ");
        }
        

        //Validar se os numeros sorteados são iguais aos numeros do usuario
        int acertos = 0;

        for (int i = 0; i < vetor2.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor2[i] == vetor[j]) {
                    acertos++;
                    
                }
            }
        }
        //retornar recompensa
        
        if (acertos == 6) {
            System.out.println("Parabens, você acertou 6 numeros e ganhou R$ 1.000.000,00. Vá até a casa loterica mais proxima para retirar sua recompensa.");
        } else if (acertos == 5) {
            System.out.println("Parabens, você acertou 5 numeros e ganhou R$ 250.000,00. Vá até a casa loterica mais proxima para retirar sua recompensa.");
        } else if (acertos == 4) {
            System.out.println("Parabens, você acertou 4 numeros e ganhou R$ 50.000,00. Vá até a casa loterica mais proxima para retirar sua recompensa.");
        } else {
            System.out.println("Infelizmente, você não ganhou desta vez.");
        }

        
        
        teclado.close();
    }
}
