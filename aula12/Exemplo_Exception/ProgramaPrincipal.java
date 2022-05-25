package aula12.Exemplo_Exception;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        //Para rodar o ConsoleUtils
        /*int num = ConsoleUtils.lerInteiro("Digite um inteiro:");
        System.out.printf("Inteiro digitado: %d", num);*/


        //Para rodar o Fatorial
        int num = ConsoleUtils.lerInteiro("Digite um inteiro:");
        long fat = Fatorial.calcular(num);
        if (fat == -1) {
            System.out.println("Não foi possivel calcular!");
        } else {
            System.out.printf("\n%d! = %d", num, fat);
        }
    }
}
