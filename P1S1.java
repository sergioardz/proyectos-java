// Write a program that counts up the number of vowels contained in the string s. Valid vowels are: 'a', 'e', 'i', 'o', and 'u'. For example, if s = 'azcbobobegghakl', your program should print:

// Number of vowels: 5

public class P1S1 {
    public static void main(String[] args) {
        // Set variables, (1) String to check the vowels, and (2) a counter to keep track of the number of vowels
        String str = "azcbobobegghakl";
        int numOfVowels = 0;
        // Iterate through the string and check every time if any element is equal to the valid vowels defined, if so increment the counter
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                numOfVowels++;
            }
        }
        // Print out the final state of the counter as the answer
        System.out.println("Number of vowels: " + numOfVowels);
    }
}