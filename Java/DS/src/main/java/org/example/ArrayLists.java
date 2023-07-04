package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public void stringList(){

        //Initializing the Dynamic array from collection Api
        ArrayList<String> stringArry = new ArrayList<>();

        //ArrayList implements List interface so it can do list operations
        stringArry.add("one");
        stringArry.add("two");
        stringArry.add("three");
        stringArry.add("four");
        stringArry.add("Five");

        //Displaying the list
        System.out.println("String array before:" + stringArry.toString());

        //Displaying the lenght
        System.out.println("String array before:" + stringArry.size());

        //Removing item from List
        stringArry.remove(0);
        stringArry.remove("Five");

        //Displaying the list
        System.out.println("String array After removing:" + stringArry.toString());

        //Displaying the lenght
        System.out.println("Lenght of String array After Removing:" + stringArry.size());


        //replacing elements
        stringArry.set(1,"Replaced");

        //Displaying the list
        System.out.println("String array After Replacing: " + stringArry.toString());

        //Searching a item for the first occurance of it
        System.out.println("Index of the item Replaced "+stringArry.indexOf("Replaced"));


    }
}
