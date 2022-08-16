## Singleton Pattern

The Singleton Pattern puts restriction on the instantiation of a class and ensures that only one instance of the class
exists in the java virtual machine. The singleton class must provide a global access point to get the instance of the
class. Singleton pattern is generally useful when the object that is created once and shared across different
threads/applications. If in your solution some object has only one instance and you want to model that in your design
then you should use singleton pattern.

Some usages of the Singleton pattern are in thread pool, logging, caching, driver objects etc. We can even see the
usage of Singleton design pattern in core java classes also. For example, java.lang.Runtime, java.awt.Desktop etc.

### How to implement a Singleton Design Pattern in general?

In order to implement a Singleton pattern, we have different scenarios, but each of them has the following common
approach.

- Private constructor to restrict instantiation of the class from other classes.
- Private static variable of the same class that is the only instance of the class.
- Public static method that returns the instance of the class, this is the global access point for outer world to get
  the instance of the singleton class.

## Thread-Safe Singleton (Eager Initialization)

In eager initialization, an instance is created at the time of class loading. We will not have any thread safety issue
if we choose to go with eager initialization. If your application always creates and uses an instance of the Singleton
or the overhead of creation and runtime aspects of the Singleton are not burdensome, you may want to create your
Singleton eagerly, like this:

```java
public class Singleton {

    //Eager Initialization
    //Below instance is guaranteed to be thread safe.

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        //We have already got an instance, so just return it.
        return uniqueInstance;
    }
}
```