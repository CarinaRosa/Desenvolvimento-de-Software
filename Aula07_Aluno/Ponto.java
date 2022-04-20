public class Ponto {
    
    private double x;
    private double y;

    public Ponto(){
        x = 0;
        y = 0;
    }

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
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
