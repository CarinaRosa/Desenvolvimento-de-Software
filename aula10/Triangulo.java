package aula10;

public class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(){

    }
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea(){
        return base * altura / 2;
    }
    @Override
    public String preencherCor() {
        return "amarelo";
    }
}
