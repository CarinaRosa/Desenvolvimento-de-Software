package aula10;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        FormaGeometrica vetor[] = new FormaGeometrica[3];

        vetor[0] = new Circulo(0.5);
        vetor[1] = new Retangulo(2.5, 3);
        vetor[2] = new Triangulo(3, 6);

        for (FormaGeometrica f : vetor) {
            System.out.printf("%s -> area: %f -> cor: %s\n", f.getClass().getName(), f.calcularArea(), f.preencherCor());
        }
    }
}