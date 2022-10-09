package ru.ifmo;

/**
 * @author Michael Gerasimov
 */
public interface LRUCache<K, V> {
    int size();

    V get(K key);

    void put(K key, V value);

    String prettyPrint();

    Node<K, V> getHead();

    Node<K, V> getTail();
}
