import java.util.ArrayList;

public class P3S1 {
    public static void main(String[] args) {
        String str = "azcbobobegghakl";
        String sub = str.substring(0, 1);
        ArrayList<String> mylist = new ArrayList<String>();
        for (int i = 0; i < str.length() - 1; i++) {
            String aux1 = str.substring(i + 1, i + 2);
            String auxi = str.substring(i, i + 1);
            int res = aux1.compareTo(auxi);
            if (res >= 0) {
                sub = sub + aux1;
            } else {
                mylist.add(sub);
                sub = "" + aux1;
            }
        }
        mylist.add(sub);
        int maxi = sub.length();
        mylist.forEach((s) -> {
            String longest;
            if (s.length() > maxi) {
                longest = s;
                System.out.println("Longest substring in alphabetical order is: " + longest);
           }
        });
    }
}