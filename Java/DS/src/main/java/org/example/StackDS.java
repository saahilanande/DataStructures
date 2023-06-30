package org.example;

import java.util.Stack;

public class StackDS {

    public void createStack(){

        // Initializing integer stack
        Stack<Integer> newStack = new Stack<Integer>();

        // Adding items to stack
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(4);
        newStack.push(5);

        //Stack with added items
        System.out.println("Stack "+newStack.toString());

        //checking the top of the stack
        System.out.println("Top of the stack "+newStack.peek());

        //Removing items from stack
        newStack.pop();
        newStack.pop();

        //checking the top of the stack
        System.out.println("Top of the stack after popping two items "+newStack.peek());


    }
}
