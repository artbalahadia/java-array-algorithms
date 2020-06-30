package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntegers = readIntegers(5);
        int minValue = findMin(myIntegers);
        System.out.println("The minimum value from your input is " + minValue);
    }

    public static int[] readIntegers(int count){
        System.out.println("Please enter " + count + " values:");
        int[] values = new int[count];

        for(int i = 0; i < count; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int findMin(int[] arr){
        int minValue = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
