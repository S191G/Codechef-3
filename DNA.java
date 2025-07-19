import java.util.*;
import java.lang.*;

class DNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder encoded = new StringBuilder();
            for (int i = 0; i < n; i += 2) {
                String pair = s.substring(i, i + 2);
                if (pair.equals("00")) {
                    encoded.append("A");
                } else if (pair.equals("01")) {
                    encoded.append("T");
                } else if (pair.equals("10")) {
                    encoded.append("C");
                } else {
                    encoded.append("G");
                }
            }
            System.out.println(encoded.toString());
        }
        sc.close();
    }
}