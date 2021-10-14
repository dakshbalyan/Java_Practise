package org.personal.codechef.starters9august;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XLSQUARE {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        while (T > 0) {
            String str = bufferedReader.readLine();
            String[] strArr = str.split(" ");
            int N = Integer.parseInt(strArr[0]), A = Integer.parseInt(strArr[1]);
            int sqRoot = findPerfectSquare(N);

            if (sqRoot == 1)
                System.out.println(A);
            else
                System.out.println(A * sqRoot);
            T--;
        }
    }

    private static int findPerfectSquare(int n) {
        if (n == 1) return 1;
        int i = 0;
        while (i <= n / 2) {
            if (i * i == n)
                return i;
            else if (i * i > n)
                return i - 1;
            i++;
        }
        return i - 1;
    }
}

// https://www.codechef.com/START9C/problems/XLSQUARE