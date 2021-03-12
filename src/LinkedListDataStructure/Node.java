package LinkedListDataStructure;

import java.util.Objects;

public class Node {

    private Node next;
    private Node privious;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data.equals(node.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    public Node getPrivious() {
        return privious;
    }

    public void setPrivious(Node privious) {
        this.privious = privious;
    }

    public Node(String data) {
        this.data = data;

        next = null;
    }

    private String data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
