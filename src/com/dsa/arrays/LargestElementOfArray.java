package com.dsa.arrays;

import java.util.Scanner;

public class LargestElementOfArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //reading size
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        //reading numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int largestElement = findLargestElement(size, numbers);
        System.out.println("Largest element: "+largestElement);
    }

    public static int findLargestElement(int size, int[] array){
        int largestElement = array[0];
        //iterating to find the largest number
        for (int i = 0; i < size; i++) {
            if (array[i] > largestElement) {
                largestElement = array[i];
            }
        }
        return largestElement;
    }
}
