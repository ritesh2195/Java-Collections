package linkedlist;

public class EmployeeLinkedList {

    EmployeeNode head;
    private int size;

    public void add(Employee employee){

       EmployeeNode node = new EmployeeNode(employee);

       //head = node;

       node.setNext(head);

       head = node;

       size++;

    }

    public void  getList(){

        EmployeeNode current = head;

        while (current!=null){

            System.out.println(current);

            current = current.getNext();
        }

    }

    public int getSize(){

        return size;
    }

    public boolean isEmpty(){

        return head == null;
    }

    public EmployeeNode remove(){

        if (isEmpty()){

            return null;
        }

        EmployeeNode removeNode = head;

        head.setNext(null);

        size--;

        return removeNode;
    }
}
