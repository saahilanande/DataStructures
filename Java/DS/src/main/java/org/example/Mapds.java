package org.example;

import java.util.HashMap;
import java.util.Map;

public class Mapds {

    //Map and SortedMap is a interface which can be implemented by HashMap, LinkedHashMap, and TreeMap
    //It stores key value pair

    public void hashmapDemo(){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        //To get values
        System.out.println("The value to key 101 is "+ map.get(101));

        //To get values
        System.out.println("The values "+ map.values());
    }

    public void linkedmapDemo(){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        //To get values
        System.out.println("The value to key 101 is "+ map.get(101));

        //To get values
        System.out.println("The values "+ map.values());
    }
}
