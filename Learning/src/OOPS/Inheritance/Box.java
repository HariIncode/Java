package OOPS.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side) {
        super();
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double h, double w, double l) {
        this.h = h;
        this.w = w;
        this.l = l;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the Box");
    }
}
