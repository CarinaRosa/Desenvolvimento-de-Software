import java.util.Scanner;

public class fatorial {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite um numero interiro positivo: ");

        int n = teclado.nextInt();

        teclado.close();            

        /*
           
        }else*/ if (n >= 0) {

            while (n > 0) { 
                n = n*(n-1)*1;
                n--;
                System.out.println(n);
            }          
                
        }
        else{
            System.out.printf("Numero informado não é positivo. Tente novamente.");
        }

        if (n == 0) {

            System.out.println("O resultado do fatorial é 1.");
        }
        

    }
}
