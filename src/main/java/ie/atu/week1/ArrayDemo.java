package ie.atu.week1;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] firstArray;
        firstArray = new int[10];
        Scanner userInput = new Scanner(System.in);

        int indexValue = 0;
        for(int arrayValue: firstArray) {
            arrayValue = (indexValue+1) * 100;
            firstArray[indexValue] = arrayValue;
            System.out.println(indexValue + " - Array item: " + arrayValue);
            indexValue++;
        }

        try {
            System.out.println("Input a new array value: ");
            int finalValue = userInput.nextInt();
            firstArray[10] = finalValue;

            System.out.println(10 + " - Array item: " + finalValue);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array size limit exceeded " + e);
        }
    }
}
