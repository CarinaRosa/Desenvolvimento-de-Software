package aula03;

import java.util.Random;

public class sorteio {

    // Atributos, propriedades, variaveis globais
    // Funções e procedimentos
    // Rotina principal
    public static void main(String[] args) {
        Random gerador = new Random(); 
        int c = 1;
        int maior = 0;
        int menor = 0;
        int soma = 0;

        while (c <= 1000) {
            //ler o numero
            int n = 1 + gerador.nextInt(100);
            
            System.out.println(n);

            if (c == 1) {
                maior = n;
                menor = n;
            }
            
            soma = soma + n;        
            
            if (maior < n) {
                maior = n;                
            }                       
          
            if (menor > n) {
                menor = n;                
            }

            c++; // c +=1 ou c=c+1;            
                               
        }
    
        System.out.println("O maior é:" + maior);
        System.out.println("O menor é:" + menor);
        System.out.println("media=" + soma/1000);
     
      
      
    }

}