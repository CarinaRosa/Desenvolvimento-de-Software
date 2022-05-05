package aula03;

import java.util.Scanner;

public class ParImpar{
    public static String verificarParImpar(int n){
        if(n % 2 == 0){
            return "Par";
        }

        else {
            return "Impar";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        do{
            n = teclado.nextInt();
            if (n >= 0) {
                System.out.printf(verificarParImpar(n));
            }
        }
        while(n >= 0);
            teclado.close();
    
    }
    
}