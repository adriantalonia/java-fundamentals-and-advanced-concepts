## Linked List

Like arrays, Linked List is a linear data structure. Unlike arrays, linked list elements are not stored at a contiguous
location; the elements are linked using pointers. They includes a series of connected nodes. Here, each node stores the
data and the address of the next node.

![image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png)

### Why Linked List?

Arrays can be used to store linear data of similar types, but arrays have the following limitations.

- **The size of the arrays is fixed**: So we must know the upper limit on the number of elements in advance. Also,
  generally, the allocated memory is equal to the upper limit irrespective of the usage.
- **Insertion of a new element / Deletion of a existing element in an array of elements is expensive**: The room has to
  be
  created for the new elements and to create room existing elements have to be shifted but in Linked list if we have the
  head node then we can traverse to any node through it and insert new node at the required position.

### Representation:

A linked list is represented by a pointer to the first node of the linked list. The first node is called the head. If
the linked list is empty, then the value of the head points to NULL.

Each node in a list consists of at least two parts:

1. A Data Item (we can store integer, strings or any type of data).
2. Pointer (Or Reference) to the next node (connects one node to another) or An address of another node

```java
class LinkedList {
    Node head; // head of the list

    /* Linked list Node*/
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(int d) {
            data = d;
            next = null;
        }
    }
}
```

### First Simple Linked List:

Let us create a simple linked list with 3 nodes.

```java
// A simple Java program to introduce a linked list
class LinkedList {
    Node head; // head of list

    /* Linked list Node. This inner class is made static so that
    main() can access it */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        } // Constructor
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

		/* Three nodes have been allocated dynamically.
		We have references to these three blocks as head,
		second and third

		llist.head	 second			 third
			|			 |				 |
			|			 |				 |
		+----+------+	 +----+------+	 +----+------+
		| 1 | null |	 | 2 | null |	 | 3 | null |
		+----+------+	 +----+------+	 +----+------+ */

        llist.head.next = second; // Link first node with the second node

		/* Now next of the first Node refers to the second. So they
			both are linked.

		llist.head	 second			 third
			|			 |				 |
			|			 |				 |
		+----+------+	 +----+------+	 +----+------+
		| 1 | o-------->| 2 | null |	 | 3 | null |
		+----+------+	 +----+------+	 +----+------+ */

        second.next = third; // Link second node with the third node

		/* Now next of the second Node refers to third. So all three
			nodes are linked.

		llist.head	 second			 third
			|			 |				 |
			|			 |				 |
		+----+------+	 +----+------+	 +----+------+
		| 1 | o-------->| 2 | o-------->| 3 | null |
		+----+------+	 +----+------+	 +----+------+ */
    }
}
```

### Linked List Complexity:

### Time Complexity

| Time Complexity | Worst Case | Average Case |
|-----------------|------------|--------------|
| Search          | 0(n)       | 0(n)         |
| Insert          | 0(1)       | 0(1)         |
| Deletion        | 0(1)       | 0(1)         |

