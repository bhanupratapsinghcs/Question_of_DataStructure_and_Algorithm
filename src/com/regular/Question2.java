// Maximum and minimum of an array using minimum number of comparisons
package com.regular;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements");
        for (int i = 0;i<n;i++ ){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Minimum "+ arr[0]+"Maximum "+arr[n-1]);
    }

}
