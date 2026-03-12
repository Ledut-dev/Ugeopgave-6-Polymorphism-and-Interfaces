public class Rectangle implements Shape{

    private int width;
    private int height;

    public Rectangle(int w, int h){
        this.width = w;
        this.height = h;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public String getAreaFormated(){
        return String.format("%.2f",this.getArea());
    }

    public String getPerimeterFormated(){
        return String.format("%.2f",this.getPerimeter());
    }

    public double getPerimeter(){
        return 2*(this.width + this.height);
    }
}