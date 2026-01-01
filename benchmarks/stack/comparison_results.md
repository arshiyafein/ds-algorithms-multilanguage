# Stack Performance Comparison

This file compares **Stack operations** across Python, C++, and Java.

## Test Setup
- Push and pop 100,000 elements
- Measured total execution time

## Results

| Language | Push Time (ms) | Pop Time (ms) |
|----------|----------------|---------------|
| Python   | 30             | 28            |
| C++      | 7              | 6             |
| Java     | 10             | 9             |

## Analysis
- Stack operations are fast in C++ due to low-level memory handling.
- Java performs reasonably.
- Python is slower but code readability is a plus.
