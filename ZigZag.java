import java.util.*;
import java.lang.*;
import java.io.*;

class ZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int A[] = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = scn.nextInt();
            }

            int max = 0;
            int min = 0;
            int mid = 0;
            for (int i = 0; i < n; i = i++) {

                max = A[i];
                min = A[i];
                mid = A[i];
                if (A[i] > max) {
                    max = A[i];
                }
                if (min > A[i]) {
                    min = A[i];
                }
                if (max > A[i] && A[i] > min) {
                    mid = A[i];
                }
                A[i + 1] = max;
                A[i] = min;
                A[i + 2] = mid;

            }
            for (int i = 0; i < n; i++) {
                System.out.print(A[i] + " ");
            }

        }

    }
}