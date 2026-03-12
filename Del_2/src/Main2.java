import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args){

        PaintJob paintjob = new PaintJob("Stue");
        //Bagvæg
        paintjob.addSurface(new Rectangle(300,250));
        //"For"væg
        paintjob.addSurface(new Rectangle(300,250));
        //Væg under viduer
        paintjob.addSurface(new Rectangle(300,100));
        //Væg over vinduer
        paintjob.addSurface(new Rectangle(300,50));

        //Vinduer
        paintjob.addDeduction(new Rectangle(100,100));
        paintjob.addDeduction(new Rectangle(100,100));
        //Vindue
        paintjob.addDeduction(new Rectangle(100,100));
        //Døre
        paintjob.addDeduction(new Rectangle(80,150));
        paintjob.addDeduction(new Rectangle(80,150));

        paintjob.printSummary();
        System.out.println();
        System.out.println("Total area to be painted: " + paintjob.getPaintableArea() + " cm² | Total area not painted: " + paintjob.getTotalDeductions() + " cm²");


    }
}