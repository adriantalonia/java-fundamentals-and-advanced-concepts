## Linked List | Inserting a node

**A node can be added in three ways**

1) At the front of the linked list
2) After a given node.
3) At the end of the linked list.

### Add a node at the front: (4 steps process)

The new node is always added before the head of the given Linked List. And newly added node becomes the new head of the
Linked List. For example, if the given Linked List is 10->15->20->25 and we add an item 5 at the front, then the Linked
List becomes 5->10->15->20->25. Let us call the function that adds at the front of the list is push(). The push() must
receive a pointer to the head pointer, because push must change the head pointer to point to the new node

![image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist_insert_at_start.png)

```java
/*This function is in LinkedList class.Inserts a
        new Node at front of the list.This method is
        defined inside LinkedList

class shown above */
public void push(int new_data)
        {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
        Node new_node=new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next=head;

        /* 4. Move the head to point to new Node */
        head=new_node;
        }
```

We have a pointer to the head and we can directly attach a node and change the pointer. So the Time complexity of
inserting a node at head position is O(1) as it does a constant amount of work.

### Add a node after a given node: (5 steps process)

We are given a pointer to a node, and the new node is inserted after the given node.

![image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist_insert_middle.png)

```java
/* This function is in LinkedList class.
Inserts a new node after the given prev_node. This method is
defined inside LinkedList class shown above */
public void insertAfter(Node prev_node,int new_data)
        {
        /* 1. Check if the given Node is null */
        if(prev_node==null){
        System.out.println(
        "The given previous node cannot be null");
        return;
        }

	/* 2. Allocate the Node &
	3. Put in the data*/
        Node new_node=new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next=prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next=new_node;
        }

```

Time complexity of insertAfter() is O(n) as it depends on n where n is the size of the linked list

Space complexity: O(1) since using constant space to modify pointers

### Add a node at the end: (6 steps process)

The new node is always added after the last node of the given Linked List. For example if the given Linked List is 5->
10->15->20->25 and we add an item 30 at the end, then the Linked List becomes 5->10->15->20->25->30.
Since a Linked List is typically represented by the head of it, we have to traverse the list till the end and then
change the next to last node to a new node.

![image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist_insert_last.png)

```java
/* Appends a new node at the end. This method is
defined inside LinkedList class shown above */
public void append(int new_data)
        {
	/* 1. Allocate the Node &
	2. Put in the data
	3. Set next as null */
        Node new_node=new Node(new_data);

	/* 4. If the Linked List is empty, then make the
		new node as head */
        if(head==null)
        {
        head=new Node(new_data);
        return;
        }

	/* 4. This new node is going to be the last node, so
		make next of it as null */
        new_node.next=null;

        /* 5. Else traverse till the last node */
        Node last=head;
        while(last.next!=null)
        last=last.next;

        /* 6. Change the next of last node */
        last.next=new_node;
        return;
        }
```

Time complexity of append is O(n) where n is the number of nodes in the linked list. Since there is a loop from head to
end, the function does O(n) work.
This method can also be optimized to work in O(1) by keeping an extra pointer to the tail of the linked list/
