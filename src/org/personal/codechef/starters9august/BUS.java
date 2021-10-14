package org.personal.codechef.starters9august;

import java.io.IOException;
import java.util.Scanner;

public class BUS {
//    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        int T = Integer.parseInt(br.readLine());
        int T = sc.nextInt();
        while (T > 0) {
//            String str = br.readLine();
//            String[] str_arr = str.split(" ");
//            int N = Integer.parseInt(str_arr[0]), M = Integer.parseInt(str_arr[1]), Q = Integer.parseInt(str_arr[2]);
            int N = sc.nextInt(), M = sc.nextInt(), Q = sc.nextInt();
            int[] arr = new int[N + 1];
            int cnt = 0;
            boolean b = true;
            while (Q > 0) {
                if (cnt > M) {
                    b = false;
                }
//                String str1 = br.readLine();
//                String[] str_arr1 = str1.split(" ");
//                String ch = str_arr1[0];
//                int j = Integer.parseInt(str_arr1[1]);
                String ch = sc.next();
                int j = sc.nextInt();
//            if(j > N) return false;
                if (ch.equals("+")) {
//                if(set.contains(j)) {
//                    b = false; Q--; break;
//                }
//                else
//                    set.add(j);
                    arr[j] = 1;
                    cnt++;
                } else if (ch.equals("-")) {
//                if(set.contains(j))
//                    set.remove(j);
                    if (arr[j] == 1) {
                        arr[j] = 0;
                        cnt--;
                    } else {
                        b = false;
                    }
                }
                Q--;
            }

            if (b)
                System.out.println("Consistent");
            else
                System.out.println("Inconsistent");
            T--;
        }
    }

//    private static boolean ifConsistent(int N, int M, int Q) throws IOException {
////        HashSet<Integer> set = new HashSet<>(Q);
//        int[] arr = new int[N+1];
//        int cnt = 0; boolean b = true;
//        while(Q > 0){
//            if(cnt > M) {
//                b = false;
//            }
//            String str = br.readLine();
//            String[] str_arr = str.split(" ");
//            String ch = str_arr[0];
//            int j = Integer.parseInt(str_arr[1]);
////            if(j > N) return false;
//            if(ch.equals("+")){
////                if(set.contains(j)) {
////                    b = false; Q--; break;
////                }
////                else
////                    set.add(j);
//                arr[j] = 1;
//                cnt++;
//            }else if(ch.equals("-")){
////                if(set.contains(j))
////                    set.remove(j);
//                if(arr[j] == 1) {
//                    arr[j] = 0; cnt--;
//                }
//                else {
//                    b = false;
//                }
//            }
//            Q--;
//        }
//        return b;
//    }
}

// https://www.codechef.com/START9C/problems/BUS


/*
4
2 1 4
+ 1
+ 2
- 1
- 2
3 2 6
+ 2
+ 1
- 1
+ 3
- 3
- 2
100 10 5
+ 1
+ 2
- 3
+ 3
- 2
6 4 4
+ 3
+ 2
+ 1
+ 4

 */