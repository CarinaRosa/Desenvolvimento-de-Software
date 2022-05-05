package Projetos_1b.Fibonacci;

import java.util.Scanner;

public class fibonacci {  

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int f = teclado.nextInt();

        teclado.close();

        long n1 = 0, n2 = 1;

        if (f == 0) {
            System.out.println("o enesimo numero é = 0.");
        }else if (f == 1) {
            System.out.println("o enesimo numero é = 1.");
        }else if (f < 0) {
            System.out.println("Insira um numero positivo");
        }else {
            for (int i = f; i > 0; i--) {
                System.out.print(n1 + " ");
                long n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                           
                
            }
            System.out.println("Este é o n-esimo numero.");
        }
        
    }
}
