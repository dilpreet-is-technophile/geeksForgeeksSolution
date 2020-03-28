import java.util.*;
import java.lang.*;
import java.io.*;

class firstComeFIrstServe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter test case num");
        int t = scn.nextInt();
        while (t-- > 0) {
            int count = 0;
            int Y = 0;
            int X = -1;
            System.out.println("enter size of array");
            int n = scn.nextInt();
            System.out.println("enter time of occurance");
            int num = scn.nextInt();
            int A[] = new int[n];
            System.out.println("enter array");
            for (int i = 0; i < n; i++) {
                A[i] = scn.nextInt();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (num == 1) {
                        if (A[i] == A[j]) {
                            count = count + 1;
                        }
                    } else {
                        if (A[i] == A[j]) {
                            count = count + 1;
                            Y = A[i];
                            System.out.print("this is Y " + count);
                        }

                    }

                }
                if (count == 1) {

                }
                if (count != 0) {
                    break;
                }

            }
            if (count == num) {
                X = Y;
            }
            System.out.print(X);

        }

    }
}