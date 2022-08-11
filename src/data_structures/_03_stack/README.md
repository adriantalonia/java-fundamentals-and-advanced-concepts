## Stack Data Structure

Stack is a linear data structure that follows a particular order in which the operations are performed. The order may be
LIFO(Last In First Out) or FILO(First In Last Out).

This strategy states that the element that is inserted last will come out first. You can take a pile of plates kept on
top of each other as a real-life example. The plate which we put last is on the top and since we remove the plate that
is at the top, we can say that the plate that was put last comes out first.

Some of its main operations are: push(), pop(), top(), isEmpty(), size(), etc.

**Push**: Adds an item to the stack. If the stack is full, then it is said to be an Overflow condition.

**Algorithm for push:**

```
begin
if stack is full
return
endif
else  
increment top
stack[top] assign value
end else
end procedure
```

**Pop**: Removes an item from the stack. The items are popped in the reversed order in which they are pushed. If the
stack is empty, then it is said to be an Underflow condition.

**Algorithm for pop:**

```
begin
if stack is empty
return
endif
else
store value of stack[top]
decrement top
return value
end else
end procedure
```

**Peek or Top:** Returns the top element of the stack.

**Algorithm for peek:**

```
begin
return stack[top]
end procedure
```

**isEmpty:** Returns true if the stack is empty, else false.

**Algorithm for isEmpty:**

```
begin
if top < 1
return true
else
return false
end procedure
```

![image](https://media.geeksforgeeks.org/wp-content/uploads/20210716162942/stack-660x345.png)

**How to understand a stack practically?**
There are many real-life examples of a stack. Consider the simple example of plates stacked over one another in a
canteen. The plate which is at the top is the first one to be removed, i.e. the plate which has been placed at the
bottommost position remains in the stack for the longest period of time. So, it can be simply seen to follow the
LIFO/FILO order.

**Time Complexities of operations on the stack:**
push(), pop(), isEmpty() and peek() all take O(1) time. We do not run any loop in any of these operations.

#### Types of Stacks:

- **Register Stack:** This type of stack is also a memory element present in the memory unit and can handle a small
  amount of data only. The height of the register stack is always limited as the size of the register stack is very
  small compared to the memory.
- **Memory Stack:** This type of stack can handle a large amount of memory data. The height of the memory stack is
  flexible as it occupies a large amount of memory data.

```java
class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }
}

// Driver code
class Main {
    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
```

**Pros:** Easy to implement. Memory is saved as pointers are not involved.

**Cons:** It is not dynamic. It doesn’t grow and shrink depending on needs at runtime.