package Topic1_3;

public class Topic1_3 {
    // Declaration of array of superclass type
    private static Shape[] shapes = new Shape[100];
    private static int count = 0;

    public static void addShape(Shape s) {
        // Set value at array index to shape and increment global count
        shapes[count] = s;
        count++;
    }

    public static void printAreas() {
        // Usage of for loop to iterate through array
        for (int i = 0; i < count; i++) {
            // Print the area, calculated based on behavior of subclass
            System.out.println(shapes[i].area());
        }
    }

    // Main code block provided by exercise
    public static void main(String[] args) {
        // Main code block for OOP Polymorphism Topic
        System.out.println("Topic 1.3: OOP Polymorphism for different subclass behaviors");
        addShape(new Circle(5));
        addShape(new Rectangle(3, 4));
        addShape(new Circle(10));
        printAreas();
        addShape(new Rectangle(4, 4));
        printAreas();
    }
}
