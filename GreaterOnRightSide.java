import java.util.*;
import java.lang.*;
import java.io.*;

public class GreaterOnRightSide {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num of test cases");
        int t = input.nextInt();
        while(t-->0){
            System.out.println("enter size of array");
            int n = input.nextInt();
            System.out.println("enter array elements");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i] = input.nextInt();
            }
            
            for(int j=0;j<n;j++){
                int max=0;
                for(int k=j+1;k<n;k++){
                    if(a[k]>max){
                        max=a[k];
                    }
                }
                a[j]=max;
                if(j==n-1){
                    a[j]=-1;
                }
            }
            
            for(int h=0;h<n;h++){
                System.out.print(a[h]+" ");
            }
            System.out.println();
        }
    }
}