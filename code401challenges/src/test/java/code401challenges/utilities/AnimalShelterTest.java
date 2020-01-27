package code401challenges.utilities;

import code401challenges.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testAnimalShelterInstance() {
        AnimalShelter aS = new AnimalShelter();
        assertEquals("should return string message for newly instantiated AnimalShelter", "new animal shelter up and running", aS.toString());
    }

    @Test
    public void testAnimalShelterWaitlist() {
        AnimalShelter aS = new AnimalShelter();
        assertEquals("should return null waitlist for newly instantiated AnimalShelter", null, aS.waitlist);
    }

    @Test
    public void testAnimalShelterEndOfList() {
        AnimalShelter aS = new AnimalShelter();
        assertEquals("should return null endOfList for newly instantiated AnimalShelter", null, aS.waitlist);
    }

    @Test
    public void testAnimalShelterEnqueue() {
        AnimalShelter aS = new AnimalShelter();
        AnimalShelter.Animal a = new AnimalShelter.Animal("dog", "champ");
        AnimalShelter.Animal b = new AnimalShelter.Animal("cat", "kitty");
        aS.enqueue(a);
        aS.enqueue(b);
        assertEquals("should return name of enqueued animal in waitlist", a.name, aS.waitlist.name);
        assertEquals("should return name of second enqueued animal in waitlist", b.name, aS.endOfList.name);

    }

    @Test
    public void testAnimalShelterValidation() {
        AnimalShelter aS = new AnimalShelter();
        AnimalShelter.Animal a = new AnimalShelter.Animal("dog", "champ");
        AnimalShelter.Animal b = new AnimalShelter.Animal("cat", "kitty");
        AnimalShelter.Animal c = new AnimalShelter.Animal("bat", "bruce");

        aS.enqueue(a);
        aS.enqueue(b);
        aS.enqueue(c);

        assertEquals("should return last valid animal name", "kitty", aS.endOfList.name);
    }

    @Test
    public void testAnimalShelterDequeue() {
        AnimalShelter aS = new AnimalShelter();
        AnimalShelter.Animal a = new AnimalShelter.Animal("dog", "champ");
        AnimalShelter.Animal b = new AnimalShelter.Animal("cat", "kat williams");
        AnimalShelter.Animal c = new AnimalShelter.Animal("cat", "garfield");

        aS.enqueue(a);
        aS.enqueue(b);
        aS.enqueue(b);

        assertEquals("should return name of first cat on waitlist", "kat williams", aS.dequeue("cat").name);
    }

    @Test
    public void testAnimalShelterFactoryMethod() {
        AnimalShelter aS = new AnimalShelter();
        AnimalShelter.Animal nameless = AnimalShelter.Animal.noName("dog");
        aS.enqueue(nameless);
        assertEquals("should return default factory name", "tobes", aS.endOfList.name);
    }

    @Test
    public void testAnimalShelterDequeueAny() {
        AnimalShelter aS = new AnimalShelter();
        AnimalShelter.Animal a = new AnimalShelter.Animal("dog", "champ");
        AnimalShelter.Animal b = new AnimalShelter.Animal("cat", "kat williams");
        AnimalShelter.Animal c = new AnimalShelter.Animal("cat", "garfield");

        aS.enqueue(a);
        aS.enqueue(b);
        aS.enqueue(b);

        assertEquals("should return name of first animal on waitlist", a.name, aS.dequeue().name);
    }
}
