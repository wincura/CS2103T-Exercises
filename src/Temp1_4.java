import java.util.HashMap;

// To be integrated into Topic1_4 after updating project
public class Temp1_4 {
    // Declaring of HashMap object to implement roster
    private static HashMap<String, Integer> roster = new HashMap<>();

    // Method to add to roster, update value associated with key
    private static void addToRoster(String day) {
        if (roster.containsKey(day)) {
            Integer newCount = roster.get(day) + 1;
            roster.put(day, newCount);
        } else {
            Integer count = Integer.valueOf(1);
            roster.put(day,count);
        }
    }

    // Method to print roster, iterating through HashMap entries and printing key value pair in desired format
    private static void printRoster() {
        for (HashMap.Entry<String, Integer> entry : roster.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Main code block for Java Collections HashMap Topic
        System.out.println("Topic 1.4: Usage of HashMap to store, update and display key-value pairs");
        addToRoster("Monday"); // i.e., one person signed up for Monday
        addToRoster("Wednesday"); // i.e., one person signed up for Wednesday
        addToRoster("Wednesday"); // i.e., another person signed up for Wednesday
        addToRoster("Friday");
        addToRoster("Monday");
        printRoster();
    }

}