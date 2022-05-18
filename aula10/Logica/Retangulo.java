package aula10.Logica;

public class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Retangulo(double altura2){

    }

    public Retangulo(double base, double altura){
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
        return base * altura;
    }

    @Override
    public String preencherCor() {
        return "azul";
    }
}
