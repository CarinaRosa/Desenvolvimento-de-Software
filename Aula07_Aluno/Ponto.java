public class Ponto {
    
    private double x;
    private double y;

    public Ponto(){
        
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x = %f y = %f ", x, y);
    }

            
    public double getx(){
        return x;
    }

    public double gety(){
        return y;
    }

    public void setx(double x){
        this.x = x;
    }

    public void sety(double y){
        this.y = y;
    }

    public double Distancia(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(x, 2));
    }

    public double Distancia(Ponto pt2){
        return Math.sqrt(Math.pow(x, 3) + Math.pow(x, 3));
    }
}
