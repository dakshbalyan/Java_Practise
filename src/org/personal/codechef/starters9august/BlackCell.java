package org.personal.codechef.starters9august;

import java.io.IOException;
import java.util.Scanner;

public class BlackCell {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            System.out.println((n * n) / 2);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

// https://www.codechef.com/START9C/problems/BLACKCEL