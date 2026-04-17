public class Rectangle {
    double lenght;
    double width;
    Rectangle(){}
    
    public void setLength(double lenght){
        this.lenght=lenght;
    }
    public void setWidth(double width){
        this.width = width;

    }

    public double getLength(){
        return lenght;
    }
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return lenght*width;
    }
    
}
