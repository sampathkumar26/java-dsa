package com.dsa.arrays;

public class ArrayExample {
    public static void main(String[] args) {
        //create array and initialize
        int[] marks ={90,80,60,48,70};

        //declare array & initialization
        int size=5;
        int[] failedStudentMarks= new int[size];

        //access the data
        for (int mark : marks) {
            System.out.println(mark);
        }

        //updating array
        failedStudentMarks[0]=marks[3];
        System.out.println(failedStudentMarks[0]);
    }
}
