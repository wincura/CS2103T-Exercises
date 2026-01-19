public class Topic1_1 {
    // Method for Enumerations Topic
    public static void describe(String c, Priority p) {
        // Usage of switch to handle enumeration value
        switch (p) {
            case LOW:
                System.out.println(c + " indicates low priority");
                break;
            case MEDIUM:
                System.out.println(c + " indicates medium priority");
                break;
            case HIGH:
                System.out.println(c + " indicates high priority");
                break;
        }
    }

    public static void main(String[] args) {
        // Main code block for Defining Classes Topic
        System.out.println("Topic 1.1: Creation of object instances using default and parameter values.");
        Circle ca = new Circle();

        System.out.println(ca.getArea());
        ca = new Circle(1, 2, 5);
        System.out.println(ca.getArea());

        // Main code block for Getters and Setters Topic
        System.out.println("\nTopic 1.1: Getting and setting of instance variables.");
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


        // Main code block for Class-level Members Topic
        System.out.println("\nTopic 1.1: Getting and setting of class variables.");
        Circle cc = new Circle();
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        cc = new Circle(0, 0, 10);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        cc = new Circle(0, 0, -15);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());
        cc.setRadius(12);
        System.out.println("max radius used so far : " + Circle.getMaxRadius());

        // Main code block for Enumerations Topic
        System.out.println("\nTopic 1.1: Usage of Enumerations");
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}