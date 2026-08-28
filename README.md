# HDFC Life Claim Amount Algorithms

## Complexity

| Method                   | Time       | Extra Space           |
| ------------------------ | ---------- | --------------------- |
| `add()`                  | O(1)       | O(1)                  |
| `insert()`               | O(n)       | O(1)                  |
| `delete()`               | O(n)       | O(1)                  |
| `toArray()`              | O(n)       | O(n)                  |
| Brute-force pair sum     | O(n²)      | O(1)                  |
| Two-pointer pair sum     | O(n log n) | O(n)                  |
| Palindrome               | O(d)       | O(d)                  |
| Partition                | O(n)       | O(1) besides the copy |
| Sliding-window max sum   | O(n)       | O(1)                  |
| Longest unique substring | O(n)       | O(n)                  |
| Recursive binary search  | O(log n)   | O(log n)              |

For 1,000,000 daily claim amounts, I would use two-pointer pair sum instead of brute force.
Brute force takes O(n²) time, which becomes extremely expensive for a large input.
Two-pointer pair sum takes O(n log n) time because the array is sorted first.
After sorting, the two-pointer scan takes only O(n) time.
Therefore, two-pointer pair sum is much more suitable for a dataset of this size.
