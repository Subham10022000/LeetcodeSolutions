package org.Leetcode;

// Java Program to find
// transpose of a matrix
// Using IN-place algorithm
class TransposeMatrix {
    static final int N = 4;

    // Finds transpose of A[][] in-place
    static void transpose(int A[][])
    {
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
    }

    // Driver code
    public static void main(String[] args)
    {
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        transpose(A);

        System.out.print("Modified matrix is \n");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(A[i][j] + " ");
            System.out.print("\n");
        }
    }
}

//2nd way to do
//// Java Program to find
//// transpose of a matrix
//
//class GFG {
//    static final int N = 4;
//
//    // This function stores transpose
//    // of A[][] in B[][]
//    static void transpose(int A[][], int B[][])
//    {
//        int i, j;
//        for (i = 0; i < N; i++)
//            for (j = 0; j < N; j++)
//                B[i][j] = A[j][i];
//    }
//
//    // Driver code
//    public static void main(String[] args)
//    {
//        int A[][] = { { 1, 1, 1, 1 },
//                { 2, 2, 2, 2 },
//                { 3, 3, 3, 3 },
//                { 4, 4, 4, 4 } };
//
//        int B[][] = new int[N][N], i, j;
//
//        // Function call
//        transpose(A, B);
//
//        System.out.print("Result matrix is \n");
//        for (i = 0; i < N; i++) {
//            for (j = 0; j < N; j++)
//                System.out.print(B[i][j] + " ");
//            System.out.print("\n");
//        }
//    }
//}
//
//// This code is contributed by Anant Agarwal.
//
