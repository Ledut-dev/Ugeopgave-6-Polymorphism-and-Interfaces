import java.util.ArrayList;

public class PaintJob {

    private String name;
    private ArrayList<Shape> surfaces = new ArrayList<>();
    private ArrayList<Shape> deductions = new ArrayList<>();

    public PaintJob(String name){
        this.name = name;
    }

    public void addSurface(Shape s){
        surfaces.add(s);
    }
    public void addDeduction(Shape s){
        deductions.add(s);
    }

    public double getTotalSurface(){
        double total = 0;
        for (Shape s : surfaces){
            total += s.getArea();
        }
        return total;
    }

   public double getTotalDeductions(){
        double total = 0;
        for (Shape s : deductions){
            total += s.getArea();
        }
        return total;
    }

   public double getPaintableArea(){
        return getTotalSurface() - getTotalDeductions();
    }

   public void printSummary(){
       System.out.println("Areas to be painted in " + this.name + ":");
       for (Shape s : surfaces){
           System.out.println(s.getAreaFormated() + "cm²");
       }
       System.out.println();
   }
}
