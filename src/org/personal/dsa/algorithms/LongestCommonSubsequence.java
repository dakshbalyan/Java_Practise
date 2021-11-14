package org.personal.dsa.algorithms;
// Time : O(mn) where m: length of str1 & n: length of str2
// Space : O(mn)

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "axxxy";
        String str2 = "axxxy";
        int ans = lcs(str1, str2);

        System.out.println(ans - 1);
    }

    private static int lcs(String s1, String s2) {
        int[][] dpTable = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 1; i < dpTable.length; i++) {    // iterating over rows --- dpTable.length gives us length of row || number of rows
            for (int j = 1; j < dpTable[i].length; j++) {    // iterating over columns --- dpTable[i].length gives us length of columns || number of columns
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dpTable[i][j] = dpTable[i - 1][j - 1] + 1;
                else
                    dpTable[i][j] = Math.max(dpTable[i - 1][j], dpTable[i][j - 1]);
            }
        }

        return dpTable[s1.length()][s2.length()];
    }
}
