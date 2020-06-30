package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getArray(5);
        reverseArray(myArray);
    }

    public static int[] getArray(int count){
        int[] values = new int[count];

        System.out.println("Please enter " + count + " values:");
        for(int i = 0; i < count; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void reverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            reversedArray[(arr.length - 1) - i] = arr[i];
        }
        System.out.println("The reversed order of your array is " +
                Arrays.toString(reversedArray));
    }

}
