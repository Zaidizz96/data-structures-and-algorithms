package dataStructures.animalShelter;

public class Driver {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Animal("dog", "Buddy"));
        shelter.enqueue(new Animal("cat", "Whiskers"));
        shelter.enqueue(new Animal("dog", "Max"));

        System.out.println("Dequeue a dog: " + shelter.dequeue("dog").getName());
        System.out.println("Dequeue a cat: " + shelter.dequeue("cat").getName());
        System.out.println("Dequeue a cat: " + shelter.dequeue("dog").getName()); // Output: Max

    }
}
