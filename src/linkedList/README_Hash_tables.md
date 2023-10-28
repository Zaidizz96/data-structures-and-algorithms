# Hashtable Implementation

## Description
This challenge involves implementing a Hashtable class with various methods including setting key-value pairs, getting values by key, checking if a key exists, retrieving a list of all unique keys, and properly hashing keys to in-range values.

## Whiteboard Process
![whiteboard](../../assets/Screenshot%202023-10-28%20191010.png)

## Approach & Efficiency
### Set Method:
- Calculate the hash code for the key and use it to find the index in the bucketArrayList.
- If a collision occurs, use a LinkedList to handle multiple key-value pairs at the same index.
- If the key already exists, replace its value; otherwise, add a new key-value pair.

### Get Method:
- Calculate the hash code for the key and find the index in the bucketArrayList.
- Search within the specified bucket to find the key and return the associated value.
- Time Complexity: O(1) on average (with a good hash function), but can be O(n) in the worst case if there are many collisions.

### Has Method:
- Similar to the Get method, calculate the hash code, find the index, and then search the bucket for the key.
- Return true if the key exists; otherwise, return false.

### Keys Method:
- Iterate through all the buckets and collect all unique keys.
- Return the list of unique keys.
- Time Complexity: O(n), where n is the number of keys.

### Hash Method:
- Calculate the hash code for the key and map it to an index within the valid range.

## Solution
To run the code, follow these steps:
1. Create an instance of the `HashMap` class.
2. Use the `set` method to add key-value pairs.
3. Use the `get` method to retrieve values by key.
4. Use the `has` method to check if a key exists.
5. Use the `keys` method to get a list of unique keys.
6. The `hash` method is used internally for hashing keys to indices.

Example of using the `HashMap` class:

```java
HashMap<String, Integer> myHashMap = new HashMap<>(16);

myHashMap.set("key1", 42);
myHashMap.set("key2", 18);
int value = myHashMap.get("key1"); // Should return 42

boolean exists = myHashMap.has("key3"); // Should return false

Collection<String> keys = myHashMap.keys(); // Returns a list of unique keys
