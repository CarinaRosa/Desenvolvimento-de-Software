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
        return this.x;
    }

    public double gety(){
        return this.y;
    }

    public void setx(double x){
        this.x = x;
    }

    public void sety(double y){
        this.y = y;
    }
}
