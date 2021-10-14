package org.personal.dsa.recursion;

public class BasicRecursionPrograms {
    public static void main(String[] args) {
//        System.out.println(powerN(5,5));
//        System.out.print(printNum(6));\
        System.out.println(count(445));
    }

    private static int printNum(int n) {
        if (n == 1)
            return n;
        int res = printNum(n - 1);
        System.out.print(res + " ");

        return n;
    }

    private static int count(int n) {
        if (n == 0)
            return 0;
        return count(n / 10) + 1;
    }

    private static int powerN(int x, int n) {
        int res;
        if (n == 0)
            return 1;
        else
            res = x * powerN(x, n - 1);

        return res;
    }
}
