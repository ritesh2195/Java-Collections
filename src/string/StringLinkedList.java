package string;

public class StringLinkedList {

    Node head;

    public void add(String data){

        Node node = new Node(data);

        node.next= head;

        head = node;
    }

    public void get(){

        Node current = head;

        while (current!=null){

            System.out.println(current);

            current = current.next;
        }
    }

    public static void main(String[] args) {

        StringLinkedList list = new StringLinkedList();

        list.add("ritesh");
        list.add("ranjan");
        list.add("sameer");

        list.get();
    }
}
