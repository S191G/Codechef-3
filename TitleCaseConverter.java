import java.util.Scanner;

public class TitleCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine()); // Number of test cases

        for (int t = 0; t < T; t++) {
            String S = scanner.nextLine();
            String[] words = S.split(" ");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];

                if (word.equals(word.toUpperCase())) {
                    // Word is an acronym (keep unchanged)
                    result.append(word);
                } else {
                    // Convert to title case
                    String formatted = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                    result.append(formatted);
                }

                if (i < words.length - 1) {
                    result.append(" ");
                }
            }

            System.out.println(result.toString());
        }

        scanner.close();
    }
}
