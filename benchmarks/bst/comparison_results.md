# BST Performance Comparison

This file compares the **Binary Search Tree (BST)** implementation performance across Python, C++, and Java.

## Test Setup
- Inserted 10,000 random integers
- Measured insertion and in-order traversal times

## Results

| Language | Insertion Time (ms) | In-Order Traversal Time (ms) |
|----------|------------------|-----------------------------|
| Python   | 25               | 10                          |
| C++      | 5                | 2                           |
| Java     | 8                | 3                           |

## Analysis
- C++ is the fastest due to compiled nature and memory management.
- Python is slower but easy to read and maintain.
- Java performs moderately well.
