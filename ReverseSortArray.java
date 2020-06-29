package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sortedIntegers = sortIntegers(myIntegers);
        printArray(sortedIntegers);
        System.out.println("The sorted array has the values " + Arrays.toString(sortedIntegers));
    }

    public static int[] getIntegers(int num){
        System.out.println("Please input " + num + " values");
        int[] values = new int[num];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] nums){
        System.out.println("Your values are being sorted in a descending order");
        for(int i = 0; i < nums.length; i++){
            System.out.println("Element " + i + " has a value of " + nums[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < (array.length - 1); j++){
                if(array[j] < array[j + 1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
