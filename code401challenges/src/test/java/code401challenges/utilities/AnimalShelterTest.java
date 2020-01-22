package code401challenges.utilities;

import code401challenges.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    @Test
    public void testAnimalShelterInstance() {
        AnimalShelter aS = new AnimalShelter();
        assertEquals("should return null waitlist for newly instantiated AnimalShelter", null, aS.waitlist);
        assertEquals("should return null endOfList for newly instantiated AnimalShelter", null, aS.waitlist);

    }

    @Test
    public void testAnimalShelterEnqueue() {
        AnimalShelter aS = new AnimalShelter();
        AnimalShelter.Animal a = new AnimalShelter.Animal("dog", "champ");
        aS.enqueue(a);
        assertEquals("should return name of enqueued animal in waitlist", a.name, aS.waitlist.name);
    }
}
