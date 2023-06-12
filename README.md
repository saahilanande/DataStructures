#DATASTRUCTURES

A data structure is a storage that is used to store and organize data. It is a way of arranging data on a computer so that it can be accessed and updated efficiently.

##ARRAY(static)
-It is fixed length container containing n elements Indexable from the range(0, n-1)

-An array is a collection of items stored at contigous memory location

-It is sequential data struture for storing and accessing data

---
###Complexity

Access O(1) Due to indexing

Search O(n) 

Inseartion O(n)

Deletion O(n)

##Stack

-Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be 

-LIFO(Last In First Out) 

-FILO(First In Last Out)

In stack, a new element is added at one end and an element is removed from that end only. The insert and delete operations are often called push and pop

---
###complexity

size() – Returns the size of the stack – Time Complexity: O(1)

top() / peek() – Returns a reference to the topmost element of the stack – Time Complexity: O(1)

push(a) – Inserts the element ‘a’ at the top of the stack – Time Complexity: O(1)

pop() – Deletes the topmost element of the stack – Time Complexity: O(1)