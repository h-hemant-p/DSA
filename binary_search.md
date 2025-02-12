# **Binary Search**

Binary search is an efficient searching algorithm that finds an element in a **sorted array** by repeatedly dividing the search space in half.

**👉How Binary Search Works**

1. **Check the middle element** of the array.
2. If the middle element is **equal** to the target, return its index.
3. If the middle element is **greater** than the target, search in the  **left half** .
4. If the middle element is **less** than the target, search in the  **right half** .
5. Repeat steps 1–4 until the element is found or the search space is exhausted.

**👉Algorithm (Step-by-Step)**

1. Set **low = 0** and  **high = array.length - 1** .
2. Repeat the following while `low <= high`:
   * Calculate  **mid = (low + high) / 2** .
   * If `arr[mid] == target`, return `mid` (element found).
   * If `arr[mid] > target`, update `high = mid - 1` (search left).
   * If `arr[mid] < target`, update `low = mid + 1` (search right).
3. If the element is not found, return `-1`.


**👉Iterative Approach Implementation**

```java
public class BinarySearch {
    // Iterative binary search method
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
  
        while (low <= high) {
            int mid = low + (high - low) / 2; // Prevents overflow
      
            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] > target) {
                high = mid - 1; // Search left half
            } else {
                low = mid + 1; // Search right half
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70}; // Sorted array
        int target = 40;
        int result = binarySearch(numbers, target);
  
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
```


**👉Recursive Approach Implementation**

```java
public class BinarySearchRecursive {
    // Recursive binary search method
    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high) return -1; // Base case: not found
  
        int mid = low + (high - low) / 2;
  
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return binarySearch(arr, low, mid - 1, target);
        else return binarySearch(arr, mid + 1, high, target);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70}; // Sorted array
        int target = 50;
        int result = binarySearch(numbers, 0, numbers.length - 1, target);
  
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
```


**Time Complexity Analysis**

| Case                   | Complexity                                    |
| ---------------------- | --------------------------------------------- |
| **Best Case**    | O(1) (Target found at the middle)             |
| **Worst Case**   | O(log n) (Target is at the ends or not found) |
| **Average Case** | O(log n)                                      |


**👉Advantages of Binary Search**

✔️ Faster than linear search ( **O(log n) vs. O(n)** ).

✔️ Efficient for  **large datasets** .

✔️ Can be implemented **recursively** or  **iteratively** .


**👉Disadvantages of Binary Search**

❌ Requires the array to be **sorted** beforehand.

❌ Not efficient for **small datasets** (overhead of sorting).

❌ Difficult to use with **linked lists** (as binary search requires random access).


**👉Use Cases of Binary Search**

* Searching in **large, sorted** datasets.
* Finding elements in  **sorted databases** .
* Implementing functions like **indexOf()** in arrays.

**👉Comparison: Linear Search vs. Binary Search**

| Feature                     | Linear Search                 | Binary Search               |
| --------------------------- | ----------------------------- | --------------------------- |
| **Time Complexity**   | O(n)                          | O(log n)                    |
| **Requires Sorting?** | No                            | Yes                         |
| **Best for**          | Small datasets, unsorted data | Large datasets, sorted data |
| **Performance**       | Slower                        | Faster                      |

---

**Happy Learning😊!**
