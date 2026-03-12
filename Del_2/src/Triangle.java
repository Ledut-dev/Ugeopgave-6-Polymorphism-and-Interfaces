public class Triangle implements Shape{

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Assuming Triangle is right-angled, since other variations require a more complex formula
    public double getArea(){
        return 0.5 * this.a * this.b;
    }

    public String getAreaFormated(){
        return String.format("%.2f",this.getArea());
    }

    public String getPerimeterFormated(){
        return String.format("%.2f",this.getPerimeter());
    }

    public double getPerimeter(){
        return this.a + this.b + this.c;
    }
}