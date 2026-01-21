package Topic1_4;

import java.util.ArrayList;
import java.util.HashMap;

public class Topic1_4 {
    // Declaring ArrayList and total variables
    private static ArrayList<Integer> nums = new ArrayList<Integer>();
    private static int total = 0;

    // Methods that use the ArrayList methods, update the total variable and print the ArrayList
    private static void addNumber(int num) {
        nums.add(Integer.valueOf(num));
        total += num;
        System.out.println(nums);
    }

    private static void removeNumber(int num) {
        nums.remove(Integer.valueOf(num));
        total -= num;
        System.out.println(nums);
    }

    private static int getTotal() {
        return total;
    }

    private static boolean isFound(int num) {
        for (Integer i : nums) {
            if (i == num) {
                return true;
            }
            else {
                continue;
            }
        }
        return false;
    }

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

    // Main code block provided by exercise
    public static void main(String[] args) {
        // Main code block for Java Collections Topic
        System.out.println("Topic 1.4: Usage of ArrayList to store, update and display integers");
        System.out.println("Adding numbers to the list");
        addNumber(3);
        addNumber(8);
        addNumber(24);
        System.out.println("The total is: " + getTotal());
        System.out.println("8 in the list : " + isFound(8) );
        System.out.println("5 in the list : " + isFound(5) );
        removeNumber(8);
        System.out.println("The total is: " + getTotal());

        // Main code block for Java Collections HashMap Topic
        System.out.println("\nTopic 1.4: Usage of HashMap to store, update and display key-value pairs");
        addToRoster("Monday"); // i.e., one person signed up for Monday
        addToRoster("Wednesday"); // i.e., one person signed up for Wednesday
        addToRoster("Wednesday"); // i.e., another person signed up for Wednesday
        addToRoster("Friday");
        addToRoster("Monday");
        printRoster();
    }
}
