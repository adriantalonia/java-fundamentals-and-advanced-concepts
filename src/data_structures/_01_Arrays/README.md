## Arrays in Java

An array in Java is a group of like-typed variables referred to by a common name. Arrays in Java work differently than
they do in C/C++. Following are some important points about Java arrays.

- In Java, all arrays are dynamically allocated. (discussed below)
- Arrays are stored in contagious memory [consecutive memory locations].
- Since arrays are objects in Java, we can find their length using the object property length. This is different from
  C/C++, where we find length using sizeof.
- A Java array variable can also be declared like other variables with [] after the data type.
- The variables in the array are ordered, and each has an index beginning from 0.
- Java array can also be used as a static field, a local variable, or a method parameter.
- The size of an array must be specified by int or short value and not long.
- The direct superclass of an array type is Object.
- Every array type implements the interfaces Cloneable and java.io.Serializable.
- This storage of arrays helps us in randomly accessing the elements of an array [Support Random Access].
- The size of the array cannot be altered(once initialized). However, an array reference can be made to point to another
  array.

An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class depending on the
definition of the array. In the case of primitive data types, the actual values are stored in contiguous memory
locations. In the case of class objects, the actual objects are stored in a heap segment.

![image](https://media.geeksforgeeks.org/wp-content/uploads/Arrays1.png)

### Creating, initializing and accessing an Array

- One-Dimensional Arrays:
  The general form of a one-dimensional array declaration is

```
type var-name[];
OR
type[] var-name;
```

An array declaration has two components: the type and the name. type declares the element type of the array. The element
type determines the data type of each element that comprises the array. Like an array of integers, we can also create an
array of other primitive data types like char, float, double, etc., or user-defined data types (objects of a class).
Thus, the element type for the array determines what type of data the array will hold.

```
// both are valid declarations
int intArray[]; 
or int[] intArray; 

byte byteArray[];
short shortsArray[];
boolean booleanArray[];
long longArray[];
float floatArray[];
double doubleArray[];
char charArray[];

// an array of references to objects of
// the class MyClass (a class created by
// user)
MyClass myClassArray[]; 

Object[]  ao,        // array of Object
Collection[] ca;  // array of Collection
                     // of unknown type
```

### Instantiating an Array in Java

When an array is declared, only a reference of an array is created. To create or give memory to the array, you create an
array like this: The general form of new as it applies to one-dimensional arrays appears as follows:

> var-name = new type [size];

Here, type specifies the type of data being allocated, size determines the number of elements in the array, and var-name
is the name of the array variable that is linked to the array. To use new to allocate an array, you must specify the
type and number of elements to allocate.

### Example:

```
int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array
OR

int[] intArray = new int[20]; // combining both statements in one
```

### Note :

1) The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for
   boolean), or null (for reference types). Do refer to default array values in Java.
2) Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. Second, you
   must
   allocate the memory to hold the array, using new, and assign it to the array variable. Thus, in Java, all arrays are
   dynamically allocated.

## Array Literal

In a situation where the size of the array and variables of the array are already known, array literals can be used.

```
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
// Declaring array literal
int[] intArray = { 1,2,3,4,5,6,7,8,9,10 };
```

- The length of this array determines the length of the created array.
- There is no need to write the new int[] part in the latest versions of Java.

## Arrays of Objects

An array of objects is created like an array of primitive type data items in the following way.

> Student[] arr = new Student[7]; //student is a user-defined class

## Multidimensional Arrays:

Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays. These
are also known as Jagged Arrays. A multidimensional array is created by appending one set of square brackets ([]) per
dimension.

![image](https://media.geeksforgeeks.org/wp-content/cdn-uploads/Blank-Diagram-Page-1-13.jpeg)

```
int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array
```

```java
public class multiDimensional {
    public static void main(String args[]) {
        // declaring and initializing 2D array
        int arr[][]
                = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};

        // printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }
    }
}

```

## Arrays Types and Their Allowed Element Types

| Array Types                | Allowed Element Types                                       |
|----------------------------|-------------------------------------------------------------|
| Primitive Type Arrays      | Any type which can be implicitly promoted to declared type. |
| Object Type Arrays         | Its child-class objects are allowed.                        |
| Abstract Class Type Arrays | Its child-class objects are allowed.                        |
| Interface Type Arrays      | Its implementation class objects are allowed.               |

https://www.geeksforgeeks.org/arrays-in-java/