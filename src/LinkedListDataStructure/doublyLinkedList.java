package LinkedListDataStructure;

public class doublyLinkedList {

    Node head;
    Node tail;

    public void add(String data){

        Node node = new Node(data);

        if (tail==null){

            head = node;
        }

        else {

            tail.setNext(node);

            node.setPrivious(tail);
        }

        tail = node;
    }

    public void getData(){

        Node current = head;

        while (current!=null){

            System.out.println(current);

            current = current.getNext();
        }
    }

    public String removeData(){

        Node removeNode = tail;

        if (tail==null){

            return null;
        }


    }

    public static void main(String[] args) {

        doublyLinkedList list = new doublyLinkedList();

        list.add("ritesh");
        list.add("ranjan");
        list.add("sameer");

        list.getData();
    }

}
