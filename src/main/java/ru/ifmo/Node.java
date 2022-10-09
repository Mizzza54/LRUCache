package ru.ifmo;

/**
 * @author Michael Gerasimov
 */
public class Node<K, V> {
    private K key;
    private V value;

    private Node<K, V> prev;
    private Node<K, V> next;

    public Node(K key, V value) {
        assert (key != null);
        assert (value != null);
        this.key = key;
        this.value = value;
    }

    public void safeDelete() {
        if (this.prev != null) {
            assert (this.prev.next == this);
            this.prev.next = this.next;
        }
        if (this.next != null) {
            assert (this.next.prev == this);
            this.next.prev = this.prev;
        }
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K, V> getPrev() {
        return prev;
    }

    public void setPrev(Node<K, V> prev) {
        this.prev = prev;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}