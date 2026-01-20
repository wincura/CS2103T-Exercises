package Topic1_4;

import java.util.ArrayList;

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

    // Main code block provided by exercise
    public static void main(String[] args) {
        // Main code block for Java Collections Topic
        System.out.println("Adding numbers to the list");
        addNumber(3);
        addNumber(8);
        addNumber(24);
        System.out.println("The total is: " + getTotal());
        System.out.println("8 in the list : " + isFound(8) );
        System.out.println("5 in the list : " + isFound(5) );
        removeNumber(8);
        System.out.println("The total is: " + getTotal());
    }
}
