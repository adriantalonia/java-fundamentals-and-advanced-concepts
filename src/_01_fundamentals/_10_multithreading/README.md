# Multithreading in Java

Multithreading in Java is a process of executing multiple threads simultaneously.

A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are
used to achieve multitasking.

However, we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate
separate memory area so saves memory, and context-switching between the threads takes less time than process.

Java Multithreading is mostly used in games, animation, etc.

### Advantages of Java Multithreading

1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.

2) You can perform many operations together, so it saves time.

3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.

### Multitasking

Multitasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU.
Multitasking can be achieved in two ways:

- Process-based Multitasking (Multiprocessing)
- Thread-based Multitasking (Multithreading)

### 1) Process-based Multitasking (Multiprocessing)

- Each process has an address in memory. In other words, each process allocates a separate memory area.
- A process is heavyweight.
- Cost of communication between the process is high.
- Switching from one process to another requires some time for saving and loading registers, memory maps, updating
  lists, etc.

### 2) Thread-based Multitasking (Multithreading)

- Threads share the same address space.
- A thread is lightweight.
- Cost of communication between the thread is low.

### What is Thread in java

A thread is a lightweight subprocess, the smallest unit of processing. It is a separate path of execution.

Threads are independent. If there occurs exception in one thread, it doesn't affect other threads. It uses a shared
memory area.

![image](https://static.javatpoint.com/images/java-multithreading.png)

As shown in the above figure, a thread is executed inside the process. There is context-switching between the threads.
There can be multiple processes inside the OS, and one process can have multiple threads.

### Java Thread class

Java provides Thread class to achieve thread programming. Thread class provides constructors and methods to create and
perform operations on a thread. Thread class extends Object class and implements Runnable interface.

### Java Thread Methods

| Modifier and Type | Method           | Description                                                      |
|-------------------|------------------|------------------------------------------------------------------|
| void              | start()          | It is used to start the execution of the thread.                 |
| void              | run()            | It is used to do an action for a thread.                         |
| 	static void      | sleep()          | It sleeps a thread for the specified amount of time.             |
| static Thread     | 	currentThread() | It returns a reference to the currently executing thread object. |
| void              | join()           | It waits for a thread to die.                                    |



