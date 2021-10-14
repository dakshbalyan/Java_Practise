package org.personal.foobar;

public class Level2 {
    static int numOfNodes;
    static int[] nodes;
    static int[] parentNodes;

    public static int[] solution(int h, int[] q) {
        // Your code here
        numOfNodes = (int) (Math.pow(2, h) - 1);
        nodes = new int[numOfNodes];
        parentNodes = new int[numOfNodes];
        parentNodes[numOfNodes - 1] = -1;

        for (int i = 0; i < numOfNodes; i++) {
            nodes[i] = i + 1;
        }
        createNextParents(numOfNodes);
        int[] res = new int[q.length];
        for (int i = 0; i < q.length; i++) {
            res[i] = parentNodes[q[i] - 1];
        }
        return res;
    }

    public static void createNextParents(int ptr) {
        ptr--;
        if (ptr > 0) {
            int rnode = nodes[ptr] - 1;
            int lnode = (rnode % 2 == 0) ? rnode / 2 : rnode / 2 + 1;
            parentNodes[rnode - 1] = parentNodes[lnode - 1] = nodes[ptr];

            createNextParents(lnode);
            createNextParents(rnode);
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = {19, 14, 28};
        int height = 5;
        int[] res = solution(height, arr);
        int a = Integer.MIN_VALUE;
        for (int x : res)
            System.out.print(x + " ");
        System.out.println();
    }
}
