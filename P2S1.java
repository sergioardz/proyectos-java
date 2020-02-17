// Write a program that prints the number of times the string 'bob' occurs in s. For example, if s = 'azcbobobegghakl', then your program should print
// Number of times bob occurs is: 2

public class P2S1 {
    public static void main(String[] args) {
        // Set variables, (1) String to check, (2) the substring to search within given String, and (3) a counter to keep track of hoy many times is the substring present
        String str = "azcbobobegghakl";
        String aux = "bob";
        int count = 0;
        // Iterate through the given String (minus 2 places as the susbstring is of length 3)
        for (int i = 0; i < str.length()-2; i++) {
            // Generate a sub variable with a slice of the given string of length 3 in order to compare against the substring, if so increment counter
            String sub = str.substring(i, i+3);
            if (sub.equals(aux)) {
                count++;
            }
        }
        // Print out the latest status of count as the answer
        System.out.println("Number of times bob occurs is: " + count);
    }
}