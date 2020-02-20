package code401challenges.hashtable;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/
public class Hashtable<K, V> {
    private ArrayList<Banana<K, V>> bucketz;

    private int yumBucketz;

    private int size;

    public Hashtable() {
        bucketz = new ArrayList<>();
        yumBucketz = 10;
        size = 0;

        for (int i = 0; i < yumBucketz; i++) {
            bucketz.add(null);
        }
    }

    private int getBucketzIndex(K key) {
        int smashCode = key.hashCode();
        return Math.abs(smashCode % yumBucketz);
    }

    public void add(K key, V value) {
        int bucketzIndex = getBucketzIndex(key);
        Banana<K, V> head = bucketz.get(bucketzIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        size++;
        head = bucketz.get(bucketzIndex);
        Banana<K, V> freshNode =  new Banana<>(key, value);
        freshNode.next = head;
        bucketz.set(bucketzIndex, freshNode);

        if ((1.0 * size)/yumBucketz >= 0.7) {
            ArrayList<Banana<K, V>> temp = bucketz;
            bucketz =  new ArrayList<>();
            yumBucketz = 2 * yumBucketz;
            size = 0;
            for (int i = 0; i < yumBucketz; i++) {
                bucketz.add(null);
            }
            for (Banana<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V get(K key) {
        int bucketzIndex = getBucketzIndex(key);
        Banana<K, V> head = bucketz.get(bucketzIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
}

