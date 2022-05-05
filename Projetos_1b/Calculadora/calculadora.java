package Projetos_1b.Calculadora;

import java.util.Scanner;

public class calculadora{             

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite o primeiro numero inteiro: ");
        int a = teclado.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int b = teclado.nextInt();
        System.out.println("Digite a operação desejada (1-Soma, 2-Subtração, 3-Multiplicação e 4-Divisão): ");
        int numero = teclado.nextInt();                  
          
               
        teclado.close();            
        
        
        if(numero == 1){
             soma(a, b);
             System.out.println("Resultado é: " + soma(a, b));
                     
        }else if(numero == 2){
             subtracao(a, b);
             System.out.println("Resultado é: " + subtracao(a, b));

        }else if(numero == 3){
            multiplicacao(a, b);
            System.out.println("Resultado é: " + multiplicacao(a, b));

        }else if(numero == 4){
            divisao(a, b);
            System.out.println("Resultado é: " + divisao(a, b));
        }

        else{
            System.out.println("Operação invalida! Digite 1 para soma, 2 para subtração, 3 para multiplicação e 4 para divisão.");
        }    

        /*
        System.out.println("Primeiro numero digitado: " + a);
        System.out.println("Segundo numero digitado: " + b);
        System.out.println("Resultado da operação:" );
        */
                 

    }
     
      
    
    public static int soma(int a, int b){
        int resultado = a + b;
        return resultado;

    }

    public static int subtracao(int a, int b){
        int resultado = a - b;
        return resultado;

    }

    public static int multiplicacao(int a, int b){
        int resultado = a * b;
        return resultado;

    }

    public static int divisao(int a, int b){
        int resultado = a / b;
        return resultado;

    }

        
}

