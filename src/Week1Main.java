public class Week1Main {
    public static void main(String[] args) {

        // main code block for 1.1a
        System.out.println("1.1a Topic: Creation of object instances using default and parameter values.");
        Circle ca = new Circle();

        System.out.println(ca.getArea());
        ca = new Circle(1, 2, 5);
        System.out.println(ca.getArea());

        // main code block for 1.1b
        System.out.println("1.1b Topic: Getting and setting of instance variables.");
        Circle cb = new Circle();

        cb.setX(4);
        cb.setY(5);
        cb.setRadius(6);
        System.out.println("x      : " + cb.getX());
        System.out.println("y      : " + cb.getY());
        System.out.println("radius : " + cb.getRadius());
        System.out.println("area   : " + cb.getArea());

        cb.setRadius(-5);
        System.out.println("radius : " + cb.getRadius());
        cb = new Circle(1, 1, -4);
        System.out.println("radius : " + cb.getRadius());


        // main code block for 1.1c
        System.out.println("1.1c Topic: Getting and setting of class variables.");
        Circle cc = new Circle();
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        cc = new Circle(0, 0, 10);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        cc = new Circle(0, 0, -15);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        cc.setRadius(12);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
/*
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
         */
    }
}