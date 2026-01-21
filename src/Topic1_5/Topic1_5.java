package Topic1_5;

public class Topic1_5 {
    // Methods provided by exercise, added exception handling to each

    // Usage of try-catch block to handle non-integer/empty/invalid user input
    public static void printArea(String descriptor){
        try {
            System.out.println(descriptor + "=" + calculateArea(descriptor));
        } catch (NumberFormatException e) {
            System.out.println("WIDTH or HEIGHT is not a number:" + descriptor);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("WIDTH or HEIGHT is missing:" + descriptor);
        } catch (IllegalShapeException e) {
            System.out.println("Too many dimensions: " + descriptor);
        }
    }

    // Usage of throw keyword to throw exceptions and throws keyword to handle them up the call stack
    private static int calculateArea(String descriptor) throws IndexOutOfBoundsException, IllegalShapeException {
        String[] dimensions = descriptor.split("x");
        if (dimensions.length > 2) {
            throw new IllegalShapeException();
        } else if (dimensions.length < 2) {
            throw new IndexOutOfBoundsException();
        }
        return Integer.parseInt(dimensions[0]) * Integer.parseInt(dimensions[1]);
    }

    // Main code block provided by exercise
    public static void main(String[] args) {
        System.out.println("Topic 1.5: Introduction to Java Exception Handling using try-catch blocks and throw/throws keyword");
        printArea("3x4");
        printArea("3xy");
        printArea("3x");
        printArea("3");
        printArea("3x4x5");
    }
}
