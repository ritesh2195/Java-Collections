package LinkedListDataStructure;

public class singlyLinkedList {

    private Node head;
    private Node tail;
    int size=0;

    public void add(String data){

        Node node = new Node(data);

        node.setNext(head);

        head = node;
        size++;
    }

    public void addLast(String data){

        Node node = new Node(data);

        if (tail==null){

            head = node;
        }

        else {

            tail.setNext(node);
        }

        tail = node;
    }



    public void get(){

        Node current = head;

        while (current!=null){

            System.out.println(current);

            current = current.getNext();
        }
    }

    public int getSize(){

        return size;
    }

    public static void main(String[] args) {

        singlyLinkedList list = new singlyLinkedList();

        list.add("ritesh");
        list.add("ranjan");
        list.add("sameer");

        list.get();
    }
}
