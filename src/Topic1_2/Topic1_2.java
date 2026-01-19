package Topic1_2;

public class Topic1_2 {
    // Main code block provided by exercise
    public static void main(String[] args) {
        // Main code block for OOP Inheritance Topic
        System.out.println("Topic 1.2: OOP Inheritance of members from other classes.");
        // create a todo task and print details
        Todo t = new Todo("Read a good book");
        System.out.println(t.getDescription());
        System.out.println(t.isDone());

        // change todo fields and print again
        t.setDone(true);
        System.out.println(t.isDone());

        // create a deadline task and print details
        Deadline d = new Deadline("Read textbook", "Nov 16");
        System.out.println(d.getDescription());
        System.out.println(d.isDone());
        System.out.println(d.getBy());

        // change deadline details and print again
        d.setDone(true);
        d.setBy("Postponed to Nov 18th");
        System.out.println(d.isDone());
        System.out.println(d.getBy());
    }
}