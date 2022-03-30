import java.util.Scanner;

public class calculadora{             

    public static Void main(String[] args) {

        System.out.println("Digite o primeiro numero inteiro: ");
        System.out.println("Digite o segundo numero inteiro: ");
        System.out.println("Digite a operação desejada (1: soma, 2: subtração, 3: multiplicação e 4: divisão): ");
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int numero = teclado.nextInt();
               
        teclado.close();
            
        
        int resultado;
        if(numero == 1){
            resultado = soma(a, b);
        
        }else if(numero == 2){
            resultado = subtracao(a, b);

        }else if(numero == 3){
            resultado = multiplicacao(a, b);

        }else if(numero == 4){
            resultado = divisao(a, b);
        }

        else{
            System.out.println("Operação invalida! Digite 1 para soma, 2 para subtração, 3 para multiplicação e 4 para divisão.");
        }    

        
                 

    }
     /*
    Void resultado;

        System.out.println("Primeiro numero digitado: " + a);
        System.out.println("Segundo numero digitado: " + b);
        System.out.println("Resultado da operação:" + resultado);
    */
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

