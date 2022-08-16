## Queue

Similar to Stack, Queue is a linear data structure that follows a particular order in which the operations are performed
for storing data. The order is First In First Out (FIFO). One can imagine a queue as a line of people waiting to receive
something in sequential order which starts from the beginning of the line. It is an ordered list in which insertions are
done at one end which is known as the rear and deletions are done from the other end known as the front. A good example
of a queue is any queue of consumers for a resource where the consumer that came first is served first.
The difference between stacks and queues is in removing. In a stack we remove the item the most recently added; in a
queue, we remove the item the least recently added.

### Basic Operations on Queue:

1. **void enqueue(int data)**: Inserts an element at the end of the queue i.e. at the rear end.
2. **dequeue()**: This operation removes and returns an element that is at the front end of the queue.

### Auxiliary Operations on Queue:

1. front(): This operation returns the element at the front end without removing it.
2. rear(): This operation returns the element at the rear end without removing it.
3. boolean isEmpty(): This operation indicates whether the queue is empty or not.
4. int size(): This operation returns the size of the queue i.e. the total number of elements it contains.

### Types of Queues:

1. Simple Queue: Simple queue also known as a linear queue is the most basic version of a queue. Here, insertion of an
   element i.e. the Enqueue operation takes place at the rear end and removal of an element i.e. the Dequeue operation
   takes place at the front end.
2. Circular Queue:  In a circular queue, the element of the queue act as a circular ring. The working of a circular
   queue
   is similar to the linear queue except for the fact that the last element is connected to the first element. Its
   advantage is that the memory is utilized in a better way. This is because if there is an empty space i.e. if no
   element
   is present at a certain position in the queue, then an element can be easily added at that position.
3. Priority Queue: This queue is a special type of queue. Its specialty is that it arranges the elements in a queue
   based
   on some priority. The priority can be something where the element with the highest value has the priority so it
   creates
   a queue with decreasing order of values. The priority can also be such that the element with the lowest value gets
   the
   highest priority so in turn it creates a queue with increasing order of values.
4. Dequeue: Dequeue is also known as Double Ended Queue. As the name suggests double ended, it means that an element can
   be
   inserted or removed from both the ends of the queue unlike the other queues in which it can be done only from one
   end.
   Because of this property it may not obey the First In First Out property.

![image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/02/Queue.png)

```java
class Queue {
    int front, rear, size;
    int capacity;
    int array[];

    public Queue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    // Queue is full when size becomes
    // equal to the capacity
    boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    // Queue is empty when size is 0
    boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    void enqueue(int item) {
        if (isFull(this))
            return;
        this.rear = (this.rear + 1)
                % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item
                + " enqueued to queue");
    }

    // Method to remove an item from queue.
    // It changes front and size
    int dequeue() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front = (this.front + 1)
                % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    int front() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    // Method to get rear of queue
    int rear() {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }
}

// Driver class
public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue()
                + " dequeued from queue\n");

        System.out.println("Front item is "
                + queue.front());

        System.out.println("Rear item is "
                + queue.rear());
    }
}
```

```
Output: 

10 enqueued to queue
20 enqueued to queue
30 enqueued to queue
40 enqueued to queue
10 dequeued from queue
Front item is 20
Rear item is 40
```

### Complexity Analysis:

### Time Complexity:

Operations Complexity

Enque(insertion)           O(1)

Deque(deletion)            O(1)

Front(Get front)           O(1)

Rear(Get Rear)             O(1)

### Auxiliary Space: O(N).

N is the size of array for storing elements.

### Pros of Array Implementation:

1. Easy to implement.

### Cons of Array Implementation:

1. Static Data Structure, fixed size.
2. If the queue has a large number of enqueue and dequeue operations, at some point (in case of linear increment of
   front
   and rear indexes) we may not be able to insert elements in the queue even if the queue is empty (this problem is
   avoided
   by using circular queue).


