package org.example;

import java.util.*;

public class Setds {

    //Set is an interface which can be implemented by Hashset, Treeset and LinkedHashset
    //Set normally does not keep the order its a unordered datastructure

    //Hashset is the fastest of the three and generally used but it does not keep the order
    public void hashSetdemo(){

        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println("Size of set after item added "+set.size());
        for(String s : set){
            System.out.println(s);
        }

        set.add("One");

        System.out.println("Size of set after dupicate item added "+ set.size());
        System.out.println("Set after dupicate item added "+ set);

        List<String> smallList = new ArrayList<>();
        Collections.addAll(smallList,"banana","mango","apple","apple");

        //Converting the list to set
        set.addAll(smallList);
        System.out.println("Size of set after adding the list "+ set.size());
        System.out.println("Set after after adding the list " + set);

    }

    //Tree set keep the logical order of the items but its slow compared to hashset
    public void treesetdemo(){

        Set<String> set = new TreeSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println("Size of set after item added "+set.size());
        for(String s : set){
            System.out.println(s);
        }

        set.add("One");

        System.out.println("Size of set after dupicate item added "+ set.size());
        System.out.println("Set after dupicate item added "+ set);

        List<String> smallList = new ArrayList<>();
        Collections.addAll(smallList,"banana","mango","apple","apple");

        //Converting the list to set
        set.addAll(smallList);
        System.out.println("Size of set after adding the list "+ set.size());
        System.out.println("Set after after adding the list "+ set);

    }

    public void linkedHashsetdemo(){

        Set<String> set = new TreeSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println("Size of set after item added "+set.size());
        for(String s : set){
            System.out.println(s);
        }

        set.add("One");

        System.out.println("Size of set after dupicate item added "+ set.size());
        System.out.println("Set after dupicate item added "+ set);

        List<String> smallList = new ArrayList<>();
        Collections.addAll(smallList,"banana","mango","apple","apple");

        //Converting the list to set
        set.addAll(smallList);
        System.out.println("Size of set after adding the list "+ set.size());
        System.out.println("Set after after adding the list "+ set);

    }
}
