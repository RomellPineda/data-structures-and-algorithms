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
        return smashCode % yumBucketz;
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

