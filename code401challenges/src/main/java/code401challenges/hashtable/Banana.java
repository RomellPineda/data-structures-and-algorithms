package code401challenges.hashtable;

// https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/
public class Banana<K, V> {
    public K key;
    public V value;

    Banana<K, V> next;

    public Banana(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
