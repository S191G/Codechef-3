import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

class DifferentConsecutiveCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();      // Length of binary string
            String s = scanner.next();      // The binary string

            int count = 0;

            // Loop to check consecutive characters
            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    count++; // Insertion needed to break same pair
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }
}

