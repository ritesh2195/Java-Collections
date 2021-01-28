package string;

public class Node {

    private String data;
    Node next;

    public Node(String data) {
        this.data = data;
        next = null;
    }

    public String toString(){

        return data.toString();
    }
}
