public class Triangle {
    double height;
    double base;
    Triangle(){}

    public void setHeight(double height){
        this.height = height;

    }
    public void setBase(double base){
        this. base = base;

    }

    public double getHeight(){
        return height;

    }
    public double getBase(){
        return base;
    }

    public double getArea(){
        return 0.5*height*base;
    }
    
}
