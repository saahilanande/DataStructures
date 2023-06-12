# DATASTRUCTURES

A data structure is a storage that is used to store and organize data. It is a way of arranging data on a computer so that it can be accessed and updated efficiently.

## ARRAY(static)
- It is fixed length container containing n elements Indexable from the range(0, n-1)
- An array is a collection of items stored at contigous memory location
- It is sequential data struture for storing and accessing data
- Real world example : Storing lists of items, representing matrices, implementing dynamic programming algorithms, and handling image or audio data

### Complexity

    Access: O(1) Due to indexing

    Search: O(n) 

    Inseartion: O(n)

    Deletion: O(n)

---

## Stack

- Stack is a linear data structure which follows a particular order in which the operations are performed. The order may be 
- LIFO(Last In First Out) 
- FILO(First In Last Out)
- Real world example : Used in web browsers for backtracking, text editors for undo/redo operations

In stack, a new element is added at one end and an element is removed from that end only. The insert and delete operations are often called push and pop

### complexity

    size() – Returns the size of the stack – Time Complexity: O(1)

    Search(top() / peek()) – Returns a reference to the topmost element of the stack – Time Complexity: O(1) for any specific variable O(N)

    Insertion(push(a)) – Inserts the element ‘a’ at the top of the stack – Time Complexity: O(1)

    Deletion(pop()) – Deletes the topmost element of the stack – Time Complexity: O(1)


---


## Queue

- A Queue is a linear structure which follows a particular order in which the operations are performed. 
- The order is First In First Out (FIFO)
- Real world example : task scheduling, message queues, network packet handling and process scheduling

### complexity

    Enqueue: Adds an item to the queue. If the queue is full, then it is said to be an Overflow condition – Time Complexity : O(1)

    Dequeue: Removes an item from the queue. The items are popped in the same order in which they are pushed. If the queue is empty, then it is said to be an Underflow condition – Time Complexity : O(1)

    Front: Get the front item from queue – Time Complexity : O(1)

    Rear: Get the last item from queue – Time Complexity : O(1)

---

## linked list

- A linked list a linear data structure, in which the elements are not stored at contigous memory location. Its a collection of nodes where each node contains data and a reference to the next node in the sequence.
- Elements are stored in nodes that contain data and references to the next node.
- Dynamic size, as nodes can be added or removed easily.
- Efficient insertion and deletion operations within the list.
- Random access is not efficient; elements must be traversed sequentially
- Real world example: Application file systems, music playlists, task schedulers

### complexity

    Insertion - O(1), if inserted on head  O(N), elsewhere
    Deletion - O(1), if deleted on head O(N), elsewhere
    Access - O(N)
    Search - O(N)

---

## HASHMAP
- Hash maps are indexed data structures. 

- A hash map makes use of a hash function to compute an index with a key into an array of buckets or slots. Its value is mapped to the bucket with the corresponding index. 

- The key is unique and immutable.

### complexity

    Memory index access takes constant time and hashing takes constant time. Hence, the search complexity of a hash map is also constant time, that is, O(1).
    
---
## Heap
Heap is a special tree structure in which each parent node is less than or equal to its child node. Then it is called a Min Heap. If each parent node is greater than or equal to its child node then it is called a max heap. It is very useful is implementing priority queues where the queue item with higher weightage is given more priority in processing.

- heapify − This function converts a regular list to a heap. In the resulting heap the smallest element gets pushed to the index position 0. But rest of the data elements are not necessarily sorted.

- heappush − This function adds an element to the heap without altering the current heap.

- heappop − This function returns the smallest data element from the heap.

- heapreplace − This function replaces the smallest data element with a new value supplied in the function.

### complexity

    Adding/inserting an element is O(log N).
