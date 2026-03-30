package edu.kis.vh.nursery.list;

class Node {

    public int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class IntLinkedList {

    public static final int INT = -1;
    private Node last;
    private  int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return INT;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return INT;
        int ret = last.value;
        last = last.getPrev();
        return ret;
    }

}

