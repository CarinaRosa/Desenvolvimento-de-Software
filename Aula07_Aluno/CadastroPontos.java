/*import java.util.Scanner;*/

public class CadastroPontos {
    public static void main(String[] args) {

        Ponto pt1 = new Ponto();
        Ponto pt2 = new Ponto(5, 10);
        Ponto pt3 = new Ponto(7, 10);
        
        System.out.println(pt1);
        System.out.println(pt2);
        System.out.println(pt3);

        System.out.printf("Distancia pt1 -> origem = %f\n", pt1.distancia());
        System.out.printf("Distancia pt1 - > pt2 = %f\n", pt1.distancia(pt2));
        System.out.printf("Distancia pt2 - > pt3 = %f\n", pt2.distancia(pt3));

        /*Ponto pontos[] = new Ponto[3];
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

              
        teclado.close();*/
    }
}
