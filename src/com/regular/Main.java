package com.regular;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n =  sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements");
        for (int i = 0;i<n;i++ ){
            arr[i] = sc.nextInt();
        }
        int[] res = reverseArray(arr,n);
        System.out.println(Arrays.toString(res));

    }
    public static int[] reverseArray(int[] arr, int n){
        for(int i=0;i<(n/2);i++){
            int temp= arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i]=temp;
        }
        return  arr;
    }
}
