package LIST;

public class MyLinkedList {

    Node head;

    class Node {

        int data;

        Node next;

        Node(int data) {

            this.data = data;

            next = null;
        }

    }
    public void getData(){

        Node n = head;

        while (n != null){

            System.out.println(n.data);

            n = n.next;
        }

    }

        public static void main(String[] args) {

            MyLinkedList list = new MyLinkedList();

            Node first = list.new Node(20);

            list.head = first;

            Node second = list. new Node(30);

            first.next = second;

            Node third = list.new Node(40);

            second.next = third;

            list.getData();
        }
    }
