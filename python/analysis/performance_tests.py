import time
from structures.stack import Stack
from algorithms.sorting import bubble_sort

def time_stack():
    s = Stack()
    start = time.time()
    for i in range(10000):
        s.push(i)
    for i in range(10000):
        s.pop()
    end = time.time()
    print("Stack test time:", end-start)

def time_sort():
    arr = list(range(1000, 0, -1))
    start = time.time()
    bubble_sort(arr)
    end = time.time()
    print("Sorting test time:", end-start)

if __name__ == "__main__":
    time_stack()
    time_sort()
