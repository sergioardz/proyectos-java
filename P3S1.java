// Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print
// Longest substring in alphabetical order is: beggh 
// In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print
// Longest substring in alphabetical order is: abc
// Note: This problem may be challenging. We encourage you to work smart. If you've spent more than a few hours on this problem, we suggest that you move on to a different part of the course. If you have time, come back to this problem after you've had a break and cleared your head.


// Import ArrayList
import java.util.ArrayList;

public class P3S1 {
    public static void main(String[] args) {
        // Start variables, (1) String to analize, (2) a substring initialized with the first element of the given string, and (3) An empty array list to hold substrings, (4) maxi variable to track the longest substring in the array
        String str = "azcbobobegghakl";
        String sub = str.substring(0, 1);
        int maxi = sub.length();
        ArrayList<String> mylist = new ArrayList<String>();
        // Iterate through the string length minus -1, as the iteration compares one element ahead
        for (int i = 0; i < str.length() - 1; i++) {
            // Define substrings to select the current element and the next one to compare them
            String aux1 = str.substring(i + 1, i + 2);
            String auxi = str.substring(i, i + 1);
            int res = aux1.compareTo(auxi);
            // If the next element is greater than the current, concatenate that element
            if (res >= 0) {
                sub = sub + aux1;
            // else, include the current state of sub as a sequence, and restart the aux1
            } else {
                mylist.add(sub);
                sub = "" + aux1;
            }
        }
        // Add the latest sub sequence to the array of substrings
        mylist.add(sub);
        // Iterate through the substring array and check the length in order to identify the longest one as the answer
        mylist.forEach((s) -> {
            String longest;
            if (s.length() > maxi) {
                longest = s;
                System.out.println("Longest substring in alphabetical order is: " + longest);
           }
        });
    }
}