# Array Middle Insertion

## Description
This challenge involves creating a function that inserts an element into the middle of an array while maintaining the order of the existing elements.

## Whiteboard Process
<!-- Embed your whiteboard image here if you have one -->

## Approach & Efficiency
I approached this challenge by calculating the middle index of the array, creating a new array with the required length, and copying the elements before and after the middle index while inserting the new element. The time complexity of this approach is O(n), where n is the length of the original array. The space complexity is also O(n) due to the creation of a new array.

## Solution
Here's how you can run the provided code and see it in action:

```java
public class ArrayMiddleInsertion {
    public static void main(String[] args) {
        int[] testArray = insertInMiddle(new int[]{1, 2, 3, 4}, 7);

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
}
```

When you run the code, the output will be:

```
{1,2,7,3,4}
```

This output reflects the elements in the modified array after inserting `7` into the middle.