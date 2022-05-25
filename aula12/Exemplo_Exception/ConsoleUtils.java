package aula12.Exemplo_Exception;

import java.util.Scanner;

public class ConsoleUtils {

    public static int lerInteiro(String msg){
        System.out.println(msg);
        Scanner input = new Scanner(System.in);
        String linhaDigitada = input.next();
        try {
            int num = Integer.parseInt(num);
            return num;
        } catch (NumberFormatException ex) {
            System.out.println("Valor informado não é um numero inteiro valido. Tente novamente!");
        }
        
    }
}