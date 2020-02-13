public class P2S1 {
    public static void main(String[] args) {
        String str = "azcbobobegghakl";
        String aux = "bob";
        int count = 0;
        for (int i = 0; i < str.length()-2; i++) {
            String sub = str.substring(i, i+3);
            if (sub.equals(aux)) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}