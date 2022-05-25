package aula12.Exemplo_Exception;

import java.util.Scanner;

public class ConsoleUtils {

    public static int lerInteiro(String msg){
        System.out.println(msg);
        Scanner input = new Scanner(System.in);

        while (true) {
            String linhaDigitada = input.next();
        
            try {
                int num = Integer.parseInt(linhaDigitada);
                input.close();
                return num;
            } catch (NumberFormatException ex) {
                // System.out.println("Valor informado não é um numero inteiro valido. Tente novamente!");
                System.out.println(ex.getMessage());
                ex.printStackTrace();
            }
        }
        
        
    }
}