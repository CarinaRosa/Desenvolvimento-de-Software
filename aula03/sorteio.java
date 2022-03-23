import java.util.Random;

public class sorteio {

    // Atributos, propriedades, variaveis globais
    // Funções e procedimentos
    // Rotina principal
    public static void main(String[] args) {
        Random gerador = new Random(); 
        int c = 1;
        
        while (c <= 1000) {
            //ler o numero
            int n = 1 + gerador.nextInt(100);
            c++; // c +=1 ou c=c+1;
            System.out.println(n);
        }
        

       
    }

}