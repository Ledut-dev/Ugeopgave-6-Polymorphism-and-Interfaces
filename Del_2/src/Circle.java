public class Circle implements Shape{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return (this.radius*this.radius)*Math.PI;
    }

    public String getAreaFormated(){
        return String.format("%.2f",this.getArea());
    }

    public String getPerimeterFormated(){
        return String.format("%.2f",this.getPerimeter());
    }

    public double getPerimeter(){
        return Math.PI * (2 * this.radius);
    }
}