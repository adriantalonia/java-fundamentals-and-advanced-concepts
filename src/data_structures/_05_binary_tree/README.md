## Binary Tree

A tree is a popular data structure that is non-linear in nature. Unlike other data structures like array, stack, queue,
and linked list which are linear in nature, a tree represents a hierarchical structure. The ordering information of a
tree is not important. A tree contains nodes and 2 pointers. These two pointers are the left child and the right child
of the parent node. Let us understand the terms of tree in detail.

- **Root**: The root of a tree is the topmost node of the tree that has no parent node. There is only one root node in
  every tree.
- **Edge**: Edge acts as a link between the parent node and the child node.
- **Leaf**: A node that has no child is known as the leaf node. It is the last node of the tree. There can be multiple
  leaf nodes in a tree.
- **Subtree**: The subtree of a node is the tree considering that particular node as the root node.
- **Depth**: The depth of the node is the distance from the root node to that particular node.
- **Height**: The height of the node is the distance from that node to the deepest node of that subtree.
- **Height of tree**: The Height of the tree is the maximum height of any node. This is same as the height of root node

```
tree
      —-
           j    <– root
       /   \
     f      k  
  /   \      \
a     h      z    <– leaves
```

### Main applications of trees include:

1. Manipulate hierarchical data.
2. Make information easy to search (see tree traversal).
3. Manipulate sorted lists of data.
4. As a workflow for compositing digital images for visual effects.
5. Router algorithms
6. Form of multi-stage decision-making (see business chess).

Binary Tree: A tree whose elements have at most 2 children is called a binary tree. Since each element in a binary tree
can have only 2 children, we typically name them the left and right child.

Binary Tree Representation: A tree is represented by a pointer to the topmost node of the tree. If the tree is empty,
then the value of the root is NULL.
A Tree node contains the following parts.

1. Data
2. Pointer to the left child
3. Pointer to the right child

```java
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
```

### Basic Operation On Binary Tree:

1. Inserting an element.
2. Removing an element.
3. Searching for an element.
4. Traversing an element. There are three types of traversals in a binary tree which will be discussed ahead.

### Auxiliary Operation On Binary Tree:

1. Finding the height of the tree
2. Find the level of the tree
3. Finding the size of the entire tree.

### Applications of Binary Tree:

- In compilers, Expression Trees are used which is an application of binary tree.
- Huffman coding trees are used in data compression algorithms.
- Priority Queue is another application of binary tree that is used for searching maximum or minimum in O(1) time
  complexity.

Binary Tree Traversals:

- PreOrder Traversal: Here, the traversal is: root – left child – right child. It means that the root node is traversed
  first then its left child and finally the right child.
- InOrder Traversal: Here, the traversal is: left child – root – right child. It means that the left child is traversed
  first then its root node and finally the right child.
- PostOrder Traversal: Here, the traversal is: left child – right child – root. It means that the left child is
  traversed first then the right child and finally its root node.

Let us traverse the following tree with all the three traversal methods:

Tree

```

                 1 //Root Node
                / \
               2    3
              / \  / \
             4  5  6  7 //Leaf Nodes

```

1. PreOrder Traversal of the above tree: 1-2-4-5-3-6-7
2. InOrder Traversal of the above tree: 4-2-5-1-6-3-7
3. PostOrder Traversal of the above tree: 4-5-2-6-7-3-1

### First Simple Tree

Let us create a simple tree with 4 nodes. The created tree would be as follows.

```
      tree
 
       1    <-- root
     /   \
    2     3  
  /   
 4
```

```java
// Class containing left and right child
// of current node and key value
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// A Java program to introduce Binary Tree
class BinaryTree {

    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // create root
        tree.root = new Node(1);
 
        /* following is the tree after above statement
 
              1
            /   \
          null  null     */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
 
        /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */

        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
    }
}
```
