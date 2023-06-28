package org.example;

import java.util.Arrays;

public class Array {

    public void arrayString() {
        //Initializing a string array
        String[] stringArray = {"apple", "banana", "watermelom"};

        //getting the length of the array
        System.out.println("Lenght of the String Array:" + stringArray.length);

        //Print the array
        System.out.println("Array before change:" + Arrays.toString(stringArray));

        //change the item at index
        stringArray[0] = "Mango";
        System.out.println("Array After Change:" + Arrays.toString(stringArray));

    }

    public void arrayInt() {
        //Initializing a int array
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        //getting the length of the array
        System.out.println("Lenght of the String Array:" + intArray.length);

        //Print the array
        System.out.println("Array before change:" + Arrays.toString(intArray));

        //change the item at index
        intArray[0] = 88;
        System.out.println("Array After Change:" + Arrays.toString(intArray));
    }


}


