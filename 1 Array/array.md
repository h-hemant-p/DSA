# **Array**

An **array** is a **fixed-size**, contiguous block of memory used to store multiple elements.

**👉Key Characteristics:**

- **Index-based** (0-based indexing)
- **Fixed size** (Cannot resize after declaration)
- **Efficient** in accessing elements (O(1) time complexity)

**👉Types Of Array**

1. **Linear Array**
2. **Multi Dimentional Array**
3. **Jagged Array**

**👉Linear Array Declaration & Initialization in Java**

```java
// Declaration (only allocates reference)
int[] arr;

// Allocating memory with a fixed size
int[] arr = new int[5];  // Default values: [0, 0, 0, 0, 0]

// Assign values directly
int[] arr = {10, 20, 30, 40, 50};

// Assign values using index
arr[0] = 5;  
arr[1] = 15;

// Traversing
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}


```

**👉Multi-Dimensional Array Declaration and Initialization**

```java
// 2D Array Example

// Declaration
// int[][] matrix = new int[3][3];

// declaration + Initialization
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Traversing
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

**👉Jagged Array Declaration and Inialization**

```java
// Jagged Array Example

// Declaration and Initialization
int[][] jaggedArray = {
    {1, 2},        // First row has 2 elements
    {3, 4, 5},     // Second row has 3 elements
    {6, 7, 8, 9}   // Third row has 4 elements
};

// Traversing the Jagged Array
for (int i = 0; i < jaggedArray.length; i++) {
    for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
    }
    System.out.println();
}
```



**👉Key Differences Between 2D and Jagged Arrays:**

* A **2D array** has rows of equal length.
* A **jagged array** has rows of varying lengths.



✅ **Advantages:**

1. **Fast Access (O(1))** - Direct indexing.
2. **Memory Efficiency** - Stores data in a contiguous manner.
3. **Easy to Implement** - Simple data structure.

❌ **Disadvantages:**

1. **Fixed Size** - Cannot dynamically resize.
2. **Insertion/Deletion Costly** - Shifting elements required (O(n)).
3. **Wastage of Memory** - If elements are not fully used.


---

**Happy Learning😊!**
