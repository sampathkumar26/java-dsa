package com.dsa.arrays;

import java.util.Scanner;

public class ReversedAnArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //reading size
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        //reading numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] reversed = reverseArray(numbers);

//        int[] reversed = optimizedReverse(numbers);

        for (int number: reversed){
            System.out.printf(number + "\t");
        }
    }

    private static int[] reverseArray(int[] numbers) {
        int size = numbers.length;
        int[] temp = new int[size];
        for(int i=size-1; i>=0;i--){
            temp[temp.length-i-1] = numbers[i];
        }
        return temp;
    }

    public  static int[] optimizedReverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
}
