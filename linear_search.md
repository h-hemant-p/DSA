# **Linear Search**

Linear search (or sequential search) is a simple searching algorithm that checks each element in a list one by one until the desired element is found or the list ends.

**👉How Linear Search Works**

1. Start from the first element of the array.
2. Compare each element with the target element.
3. If a match is found, return the index of the element.
4. If the element is not found, return `-1` or indicate that the search was unsuccessful.

**👉Algorithm (Step-by-Step)**

1. Take an array and a target value.
2. Loop through each element of the array:
   * If the current element matches the target, return the index.
   * Otherwise, move to the next element.
3. If the loop completes without finding the element, return `-1`.

**👉Implementation in Java**

```java
public class LinearSearch {
    // Method for linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int result = linearSearch(numbers, target);
    
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
```

**👉Time Complexity Analysis**

* **Best Case (O(1))** → The target element is found at the first position.
* **Worst Case (O(n))** → The target element is at the last position or not present.
* **Average Case (O(n))** → On average, we check half of the elements.


**✅Advantages of Linear Search**

* Can be used on **unsorted** and **unordered** data.

**❌Disadvantages of Linear Search**

* Slow for large datasets.
* Inefficient compared to binary search for sorted data.


**👉Use Cases of Linear Search**

* Searching in **unsorted** or **unordered** lists.
* Small datasets where performance is not a concern.
* When using  **linked lists** , as binary search requires random access.

---

**Happy Learning😊!**
