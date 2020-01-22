package code401challenges.utilities;

public class AnimalShelter {
    public Animal waitlist;
    public Animal endOfList;

    public AnimalShelter() {};

    public static class Animal<E> {
        E animal;
        String name;
        Animal<E> next;

        public Animal(E animal, String name) {
            this.animal = animal;
            this.name = name;
            this.next = null;
        }

        // non-static factory method
        public Animal noName(E animal) {
            return new Animal(animal, "tobes");
        }
    }

    public String enqueue(Animal a) {
        if (a.animal.equals("dog") || a.animal.equals("cat")) {
            if (this.waitlist == null) {
                waitlist = a;
            } else {
                endOfList.next = a;
            }
            endOfList = a;
            String success = "successfully added new " + a.animal;
            return success;
        }

        String message = "unable to add new animal";
        return message;
    }

    public Animal dequeue() {
        Animal runner = waitlist;
        waitlist = waitlist.next;
        return runner;
    }

    public Animal dequeue(String pref) {
        if (pref.equals("dog") || pref.equals("cat")) {
            Animal runner = waitlist;
            if (runner.animal.equals(pref)) {
                waitlist = waitlist.next;
                return runner;
            }
            while (runner != null) {
                if (runner.next.animal.equals(pref)) {
                    Animal adopt = runner.next;
                    runner = runner.next;
                    return adopt;
                }
                runner = runner.next;
            }
        }
        return null;
    }
}