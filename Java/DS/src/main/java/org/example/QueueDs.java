package org.example;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDs {

    //Queue is a interface which can be used by 3 classes.
    //The classes that implements queue interface are  PriorityQueue, LinkedList and PriorityBlockingQueue(Thread Safe)

    public void QueueDs(){
        //Initializing a PriorityQueue
        Queue priQue = new PriorityQueue();

        //Adding item to queue
        priQue.add("one");
        priQue.add("two");
        priQue.add("three");
        priQue.add("four");
        priQue.add("five");

        //Printing the queue
        System.out.println("Queue "+priQue.toString());

        //Checking the top of the queue
        System.out.println("Item front of the queue "+priQue.peek());

        //Removing items from
        priQue.remove();
        priQue.remove();

        //Checking the top of the queue
        System.out.println("Item front of the queue after removing items "+priQue.peek());
    }

}
