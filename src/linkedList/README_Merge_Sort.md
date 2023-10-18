# Merge Sort Algorithm

**Merge Sort** is a divide-and-conquer sorting algorithm known for its stability and efficient performance. It works by recursively dividing the input array into smaller subarrays, sorting each subarray, and then merging them back together in a sorted manner.

## Visual Representation (Trace)

### Initial Array:
[8, 4, 23, 42, 16, 15]

### Step 1: Initial Split
- Split: Array is divided into two halves.

### Step 2: Split into Left and Right
- Left Half: [8, 4, 23]
- Right Half: [42, 16, 15]

### Step 3: Recursively Sort Left and Right
- Sorting Left Half:
    - Left: [8]
    - Right: [4, 23]
- Sorting Right Half:
    - Left: [42]
    - Right: [16, 15]

### Step 4: Merging Left and Right
- Merging Left and Right for Left Half:
    - Merged Left: [4, 8, 23]
    - Right: [4, 8, 23]
- Merging Left and Right for Right Half:
    - Left: [42]
    - Merged Right: [15, 16, 42]

### Step 5: Final Result
- Merging Left and Right for Original Array:
    - Merged Left: [4, 8, 15, 16, 23, 42]
    - Merged Right: [4, 8, 15, 16, 23, 42]

Final Sorted Array: [4, 8, 15, 16, 23, 42]

This visual representation demonstrates how the Merge Sort algorithm recursively divides, sorts, and merges subarrays until the entire array is sorted.

## Merge Sort Algorithm
1. Start with an array of elements to be sorted.
2. If the array has more than one element, divide it into two halves.
3. Recursively sort the left and right halves.
4. Merge the sorted left and right halves to produce a single sorted array.

## Java Implementation

The Java implementation of the Merge Sort algorithm is available in the provided Java source code. This implementation includes the `merge` and `mergeSort` functions, which handle the sorting and merging processes.

## Usage

To use the Merge Sort implementation, you can call the `mergeSort` function and pass your unsorted array as an argument. The sorted array will be modified in place.

```java```
int[] arr = {8, 4, 23, 42, 16, 15};
mergeSort(arr);
System.out.println("Sorted Array: " + Arrays.toString(arr));

## Efficiency : 
Time Complexity: Merge Sort has a time complexity of O(n log n) in the worst, average, and best cases. It consistently performs well, making it suitable for a variety of input data.

Space Complexity: Merge Sort is an out-of-place sorting algorithm, meaning it requires additional space for merging. The space complexity is O(n).