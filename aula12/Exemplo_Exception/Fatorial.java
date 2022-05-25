package aula12.Exemplo_Exception;

import java.util.Scanner;

public class Fatorial {
    
    public static long calcular(int num){

        if (num>0) {
            int fat = 1;
            for (int i = 2; i < num; i++) {
                fat *= i;
            }
        } else {
            System.out.printf("Não existe fatorial de numero negativo: %d", num);
            return -1;
        }
        // System.out.println(n);
        // Scanner input = new Scanner(System.in);
        // int numDigitado = input.nextInt();
        

        // for (int i = 0; i < numDigitado.length; i--) {
        //     int numDigitado = n*(n-1);
        // }

        // try {
            
        // } catch (Exemplo_Exception) {
        //     //TODO: handle exception
        // }
    }
}
