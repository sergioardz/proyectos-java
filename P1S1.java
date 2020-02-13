public class P1S1 {
    public static void main(String[] args) {
        String str = "azcbobobegghakl";
        int numOfVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                numOfVowels++;
            }
        }
        System.out.println("Number of vowels: " + numOfVowels);
    }
}