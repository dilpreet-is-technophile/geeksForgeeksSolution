import java.util.*;
import java.lang.*;
import java.io.*;

class maxValueAfterMOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num of test cases");
        int T = input.nextInt();
        while (T-- > 0) {
            System.out.println("enter size of array and no of operations");
            int N = input.nextInt();
            int M = input.nextInt();

            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = 0;
            }

            while (M-- > 0) {
                System.out.println("enter the operation");
                int a = input.nextInt();
                int b = input.nextInt();
                int k = input.nextInt();
                for (int j = a; j <= b; j++) {
                    A[j] = A[j] + k;

                }

            }
            int max = 0;
            for (int k = 0; k < N; k++) {
                if (A[k] > max) {
                    max = A[k];
                }
            }
            System.out.println(max);

        }
    }
}