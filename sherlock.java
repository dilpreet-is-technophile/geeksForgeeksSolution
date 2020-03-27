import java.util.*;
import java.lang.*;
import java.io.*;

class sherlock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num of test cases");
        int T = input.nextInt();

        while (T-- > 0) {
            System.out.println("enter size of array");
            int N = input.nextInt();
            int A[] = new int[N];
            System.out.println("enter elements of array");
            for (int i = 0; i < N; i++) {
                A[i] = input.nextInt();
            }
            int B[] = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = i + 1;
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (B[i] == A[j]) {
                        B[i] = -1;
                    }

                }
            }

            for (int k = 0; k < N; k++) {
                if (B[k] != -1) {
                    System.out.println(B[k]);
                }
            }

        }
    }
}