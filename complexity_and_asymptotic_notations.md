## Complexity

Complexity refers to the **efficiency** of an algorithm in terms of **time** and **space** required to execute it.

**Types of Complexities -**

1. Space Complexity
2. Time Complexity

**How to Analyze Complexity? -**

1. **Best Case** (Ω) → Fastest execution time.
2. **Worst Case** (O) → Maximum time required.
3. **Average Case** (Θ) → Expected performance.

##### **Asymptotic Notations**

Asymptotic notations describe the **growth rate** of an algorithm’s time or space complexity as the input size (**n**) increases.

**Types of Asymptotic Notations -**

1. **Big-O Notation (O) :**

   * Represents the **worst-case** time complexity.
   * Gives the **upper bound** of an algorithm.
   * Ensures that an algorithm runs within a certain limit.
   * **Example:** For a function **f(n) = 3n² + 5n + 10**, **Big-O:** O(n²) (dominant term with highest power)
   * | Complexity | Example Algorithm           |
     | ---------- | --------------------------- |
     | O(1)       | Accessing an array element  |
     | O(log n)   | Binary Search               |
     | O(n)       | Linear Search               |
     | O(n log n) | Merge Sort, Quick Sort      |
     | O(n²)     | Bubble Sort, Selection Sort |
2. **Omega Notation (Ω) :**

   * Represents the **best-case** time complexity.
   * Gives the **lower bound** of an algorithm.
   * Ensures that an algorithm takes at least this much time.
   * **Example:** For a function **f(n) = 4n + 6**, **Ω(n)** (as n increases, it grows linearly)
   * | Complexity  | Example Algorithm       |
     | ----------- | ----------------------- |
     | Ω(1)       | Array Access            |
     | Ω(log n)   | Optimized Search        |
     | Ω(n)       | Unsorted List Search    |
     | Ω(n log n) | Best case of Quick Sort |
     | Ω(n²)     | Matrix Multiplication   |
3. **Theta Notation (Θ) :**

   - Represents the **average-case** time complexity.
   - Gives the **tight bound** (upper & lower).
   - Defines an exact growth rate.
   - **Example:** For a function **f(n) = 2n² + 3n + 1**, **Θ(n²)** (both upper and lower bound are same)
   - | Complexity  | Example Algorithm           |
     | ----------- | --------------------------- |
     | Θ(1)       | Direct Access               |
     | Θ(log n)   | Balanced Binary Search Tree |
     | Θ(n)       | Scanning an Array           |
     | Θ(n log n) | Optimal Sorting Algorithms  |
     | Θ(n²)     | Brute Force Algorithms      |


**Relation Between Notations :**
	For a given function **f(n)**:

```
Ω(g(n)) ≤ Θ(g(n)) ≤ O(g(n))
```

This means:

- **Big-O (O)** is the **upper limit** (worst case).
- **Theta (Θ)** is the **exact bound** (average case).
- **Omega (Ω)** is the **lower limit** (best case).

---

**Example :**

Consider a **for loop**:

```cpp
for(int i = 0; i < n; i++) {
    cout << i;
}
```

* **Best Case (Ω)** : Ω(n) → Always runs **n** times.
* **Worst Case (O)** : O(n) → Runs **n** times.
* **Average Case (Θ)** : Θ(n) → Same as best and worst.

---

**Happy Learning😊!**
