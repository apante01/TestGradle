package testFibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacciGetNumber() {
int n = 10;
        int[] array = new int[n];
        array[0]=0;
        array[1]=1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }for (int i=0;i<n;i++){
            System.out.println(array[i]);
        }

    }
}
