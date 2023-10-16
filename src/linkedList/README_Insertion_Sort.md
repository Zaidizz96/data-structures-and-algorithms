# Insertion Sort Algorithm

**Insertion Sort** is a simple and efficient sorting method used to arrange a list of elements. It works by taking one element at a time from an unsorted list and placing it in the correct order within a sorted list. In this guid.

## Visual Representation ( trace )

### Pass 1:

**Insertion Sort - Pass 1**

- **Sorted Array**: `[8]`
- **Unsorted Array**: `[4, 23, 42, 16, 15]`

In the first pass of Insertion Sort, the algorithm initializes the sorted array with the first element, which is 8. This becomes our initial sorted portion. The unsorted array contains the remaining elements.

### Pass 2:

**Insertion Sort - Pass 2**

- **Sorted Array**: `[4, 8]`
- **Unsorted Array**: `[23, 42, 16, 15]`

During the second pass, we evaluate the next element, which is 4, in the unsorted portion. We compare it with the elements in the sorted array. As 4 is smaller than 8, we shift 8 one position to the right, making space for 4. The sorted array becomes `[4, 8]`.

### Pass 3:

**Insertion Sort - Pass 3**

- **Sorted Array**: `[4, 8, 23]`
- **Unsorted Array**: `[42, 16, 15]`

In the third pass, we consider the next element, which is 23. It's larger than 8 but smaller than 42. So, we insert 23 between 8 and 42. The sorted array now looks like `[4, 8, 23]`.

### Pass 4:

**Insertion Sort - Pass 4**

- **Sorted Array**: `[4, 8, 16, 23]`
- **Unsorted Array**: `[42, 15]`

In the fourth pass, we examine the element 16. We compare it with the elements in the sorted array. It is smaller than 23 but larger than 8. Therefore, it's inserted in the correct position between 8 and 23. The sorted array is now `[4, 8, 16, 23]`.

### Pass 5:

**Insertion Sort - Pass 5**

- **Sorted Array**: `[4, 8, 15, 16, 23]`
- **Unsorted Array**: `[42]`

The fifth pass deals with the element 15. It is smaller than 23 but larger than 16. So, 15 is inserted in the correct position between 16 and 23. The sorted array becomes `[4, 8, 15, 16, 23]`.

### Pass 6:

**Insertion Sort - Pass 6**

- **Sorted Array**: `[4, 8, 15, 16, 23, 42]`
- **Unsorted Array**: `[]`

In the final pass, we have the element 42. It is larger than all the elements in the sorted array, so it remains in place. The array is now completely sorted.

### Efficiency

- **Time Complexity**: The basic operation in Insertion Sort is comparison. It compares elements to find the correct position for insertion. This operation happens approximately `n * (n-1)` times, leading to a time complexity of O(n^2).

- **Space Complexity**: Insertion Sort is an in-place sorting algorithm. It doesn't require additional space, so the space complexity is O(1).

This trace illustrates how Insertion Sort progressively builds a sorted array by inserting elements in the correct order one at a time.
