public class Distancia {
    
    private double pt1;
    private double pt2;
    private double pt3;

    public Distancia(double pt1, double pt2, double pt3) {
        this.pt1 = pt1;
        this.pt2 = pt2;
        this.pt3 = pt3;
    }

    public double getpt1(){
        return this.pt1;
    }

    public double getpt2(){
        return this.pt2;
    }

    public double getpt3(){
        return this.pt3;
    }

    public void setpt1(double pt1){
        this.pt1 = pt1;
    }

    public void setpt2(double pt2){
        this.pt2 = pt2;
    }

    public void setpt3(double pt3){
        this.pt3 = pt3;
    }
}
