# First-in, First-out Animal Shelter

## Description
This challenge involves creating an AnimalShelter class that holds dogs and cats and operates using a first-in, first-out approach. The class implements methods for enqueuing and dequeuing animals based on their species preference.

## Whiteboard Process

![Whiteboard](../../assets/whiteboard%20code%20challange%20(animal%20shelter).png)

## Approach & Efficiency
- The `AnimalShelter` class uses two separate queues, one for dogs and one for cats, to maintain the order of arrival for each species.
- When enqueuing an animal, it is added to the respective queue based on its species.
- When dequeuing an animal, the method checks the preference ("dog" or "cat") and dequeues from the corresponding queue.
- If the preference doesn't match any available animals, it returns null.

**Time Complexity**:
- Enqueue operation: O(1) - Constant time as it involves adding an element to the end of the queue.
- Dequeue operation: O(1) - Constant time as it involves removing an element from the front of the queue.

**Space Complexity**:
- The space complexity is O(n), where n is the number of animals in the shelter.

## Solution
To run the code, you can follow these steps:

1. Clone the repository.
2. Compile and run the Java program.
3. Use the `enqueue` method to add animals to the shelter, specifying their species ("dog" or "cat") and name.
4. Use the `dequeue` method to retrieve animals based on their species preference ("dog" or "cat").

Example code:
```java
AnimalShelter shelter = new AnimalShelter();
shelter.enqueue(new Animal("dog", "Buddy"));
shelter.enqueue(new Animal("cat", "Whiskers"));
shelter.enqueue(new Animal("dog", "Max"));

System.out.println("Dequeue a dog: " + shelter.dequeue("dog").getName()); // Output: Buddy
System.out.println("Dequeue a cat: " + shelter.dequeue("cat").getName()); // Output: Whiskers
System.out.println("Dequeue a cat: " + shelter.dequeue("cat").getName()); // Output: Max
System.out.println("Dequeue a dog: " + shelter.dequeue("dog")); // Output: null (no more dogs)
