import java.util.Scanner;
public class calculadora{
    public static int operacao(int a, int b){

        int a;
        int b;
        String operacao = "";
        int resultado;
        
        if(operacao === 1){
            resultado = a + b;
        
        }else if(operacao === 2){
            resultado = a - b;

        }else if(operacao === 3){
            resultado = a * b;

        }else if(operacao === 4){
            resultado = a / b;
        }

        else{
            System.out.printIn("Operação invalida! Digite 1 para soma, 2 para subtração, 3 para multiplicação e 4 para divisão.")
        }    

   
    }

    public static void main(String[] args) {

        System.out.println("Digite o primeiro numero inteiro: ");
        System.out.println("Digite o segundo numero inteiro: ");
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int operacao = teclado.nextInt();

        System.out.println("Primeiro numero digitado: " + a);
        System.out.println("Segundo numero digitado: " + b);
        System.out.println("Resultado da operação:" + resultado);
        
        teclado.close();
              

    }

    System.out.printIn(resultado);
    
}

