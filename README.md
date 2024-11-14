# JavaDataStructures

Data structures I wrote in Java to help me understtand the language and learn the implementation of data structures. 

## Binary Search Tree
Only implemented with integers for now.

```
Constructor (T) - Creates Root note with inital val passed in
getRoot() - Returns the root node
insert(T, startNode) - Takes in new value to insert and the start node where you want the insert to begin (should be the root node)
delete(T, startNode) - Same as insert but deletes the node
preOrder(startNode), postOrder(startNode), inOrder(startNode) - Performs the respective tree traversals starting from the startNode
```

## Heap Tree
Only implemented with integers for now.

### Heap
Stores a fixed size integer array in a heap format. Only implemented with integers for now.
```
insert(int) - adds a new element to the array, will reallocate the array to one with a bigger size and esnure the heap is still in the correct format
heapify() - ensures the array is in heap format using the bubbleUp algorithm
getData() - returns the array
```

### Binary Heap Tree
Stored a tree of integer nodes each with a left and right child (either could be NULL) that respects the rules of a heap.
```
Constructor(int) - Initialises a root node with the value input
getRoot() - Returns the root node.
heapify(int[]) - Replaces the current tree with a new one using the passed in array
preOrder(startNode), postOrder(startNode), inOrder(startNode) - Performs the respective tree traversals starting from the startNode
```

## Linked List
Basic linked list implemetation using templates.
```
Constructor(T) - Creates a new linked list with the valuse passed as the value of the first node
isEmpty() - Returns true if empty and false if not
append(T) - Adds a new value onto the end of the list
printList() - Outputs the list to the console where each element is seperated by " ,"
```

## Queue
Queue implementations using integers.
```
Constructor(int) - Initialises a queue with size passed as the argument
enqueue(int) - adds a new element to the end of the queue, throws queue full exception is the queue is full
dequeue() - removes the first element of the queue and returns it, throws queue empty exception is queue is empty
printContents() - output the contents of the queue to the console
```

## Stack
Implements a templated stack using a linked list.

```
Constructor(T) - intitialises the stack with the value passed
push(T) - adds the element to the stack
pop() - removes the bottom element from the stack and returns it
```

## Dynamic Array
An array that will resize according to how many elements are added.
Implemented with integers for now. 

```
Constructor() - Initialises the array
size() - Returns the size of the array
printArray() - Outputs the array to the console each element is seperated by " ,"
append(int) - Adds a new integer elems to the array using resizing to ensure it can be added
```

## AVL Tree
Unfinished

## BTree
Unfinished
