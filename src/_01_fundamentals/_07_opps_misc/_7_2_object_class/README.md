## Object class in Java

The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of
java.

The Object class is beneficial if you want to refer any object whose type you don't know. Notice that parent class
reference variable can refer the child class object, know as upcasting.

Let's take an example, there is getObject() method that returns an object but it can be of any type like
Employee,Student etc, we can use Object class reference to refer that object. For example:

> Object obj=getObject();//we don't know what object will be returned from this method

### Methods of Object class

The Object class provides many methods. They are as follows:

| Method                                                                    | Description                                                                                                                                               |
|---------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| public final Class getClass()                                             | returns the Class class object of this object. The Class class can further be used to get the metadata of this class.                                     |
| public int hashCode()                                                     | returns the hashcode number for this object.                                                                                                              |
| protected Object clone() throws CloneNotSupportedException                | creates and returns the exact copy (clone) of this object.                                                                                                |
| public String toString()                                                  | returns the string representation of this object.                                                                                                         |
| public final void notify()                                                | wakes up single thread, waiting on this object's monitor.                                                                                                 |
| public final void notifyAll()                                             | wakes up single thread, waiting on this object's monitor.                                                                                                 |
| public final void wait(long timeout)throws InterruptedException           | causes the current thread to wait for the specified milliseconds, until another thread notifies (invokes notify() or notifyAll() method).                 |
| public final void wait(long timeout,int nanos)throws InterruptedException | causes the current thread to wait for the specified milliseconds and nanoseconds, until another thread notifies (invokes notify() or notifyAll() method). |
| public final void wait()throws InterruptedException                       | causes the current thread to wait, until another thread notifies (invokes notify() or notifyAll() method).                                                |
| protected void finalize()throws Throwable                                 | is invoked by the garbage collector before object is being garbage collected.                                                                             |
| public boolean equals(Object obj)                                         | public boolean equals(Object obj)                                                                                                                         |

