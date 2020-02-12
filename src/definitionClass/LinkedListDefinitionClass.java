package definitionClass;

import adt.LinkedListADT;

public class LinkedListDefinitionClass<E> implements LinkedListADT<E> {

    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;

    private boolean isEmpty() {
        return size == 0;
    }

    private void addAfter(Node<E> node, E data) {
        Node<E> node1 = new Node<>(node.next.previous, data, node.next);

        node.next = node1;
        node.next.previous = node1;
        size++;
    }

    private void addFirst(E data) {
        head = new Node<>(null, data, head);
        size++;
    }

    private E removeFirst() {
        E temp = null;

        return temp;
    }

    @Override
    public boolean add(E item) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }


    private static class Node<E> {
        private Node<E> previous;
        private E data;
        private Node<E> next;

        public Node(Node<E> previous, E data, Node<E> next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this.data = data;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}
