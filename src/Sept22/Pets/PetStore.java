package Sept22.Pets;

import java.util.ArrayList;

public class PetStore {
    private ArrayList<Pet> pets;

    public PetStore() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void countCats() {
        int ctr = 0;
        for (Pet p : pets) {
            if (p instanceof Cat) {
                ctr++;
            }
        }
        System.out.println("Number of Cats: " + ctr);
    }
    public void countDogs() {
        int ctr = 0;
        for (Pet p : pets) {
            if (p instanceof Dog) {
                ctr++;
            }
        }
        System.out.println("Number of Dogs: " + ctr);
    }
    public void countBirds() {
        int ctr = 0;
        for (Pet p : pets) {
            if (p instanceof Bird) {
                ctr++;
            }
        }
        System.out.println("Number of Birds: " + ctr);
    }

    public void petStoreSounds() {
        int ctr = 0;
        for (Pet p : pets) {
            p.makeSound();
        }
    }

    public void petStoreMoves() {
        int ctr = 0;
        for (Pet p : pets) {
            p.move();
        }
    }
}
