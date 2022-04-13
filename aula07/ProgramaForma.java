public class ProgramaForma {
    public static void main(String[] args) {
        FormaGeometrica obj1 = new FormaGeometrica();
        System.out.println(obj1 + " - " + obj1.getCorPreenchimento());
        Circulo obj2 = new Circulo();
        System.out.println(obj2 + " - " + obj2.getCorPreenchimento());
        Retangulo obj3 = new Retangulo();
        System.out.println(obj3 + " - " + obj3.getCorPreenchimento());
        Triangulo obj4 = new Triangulo();
        System.out.println(obj4 + " - " + obj4.getCorPreenchimento());
    }
}
