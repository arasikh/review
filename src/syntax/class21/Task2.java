package syntax.class21;

public class Task2 {
}

class shape{
    double radius;
    shape(double radius){
        this.radius=radius;

    }
}

class Circle extends shape{
    Circle(double radius){
        super(radius);
    }
    void calculateAndPrintArea(){
        double area =Math.PI*Math.pow(radius,2);
        System.out.println("Area "+area);
    }

}

class Tester{

    public static void main(String[] args) {
        Circle circle= new Circle(2);
        circle.calculateAndPrintArea();
    }

}