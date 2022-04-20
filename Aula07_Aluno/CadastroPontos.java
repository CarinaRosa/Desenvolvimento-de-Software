import java.util.Scanner;

public class CadastroPontos {
    public static void main(String[] args) {
        Ponto pontos[] = new Ponto[3];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < pontos.length; i++) {
            System.out.printf("\n---------- Ponto ----------\n");

            System.out.println(" Informe x: ");
            Double x = teclado.nextDouble();

            System.out.println(" Informe y: ");
            Double y = teclado.nextDouble();

            pontos[i] = new Ponto(x,y);
        }

        System.out.printf("\n---------- Lista Pontos Informados -----------\n");
        for (int i = 0; i < pontos.length; i++) {
            System.out.println(pontos[i].toString());
        }

        System.out.printf("\n---------- Distancias ----------\n");

        teclado.close();
    }
}
