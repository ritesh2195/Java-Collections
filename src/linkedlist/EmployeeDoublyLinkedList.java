package linkedlist;

public class EmployeeDoublyLinkedList {

    EmployeeNode head;
    EmployeeNode tail;
    int size = 0;

    public void addDataFront(Employee employee){

        EmployeeNode node = new EmployeeNode(employee);

        if (head==null){

            tail = node;
        }

        else {

            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;

        size++;

    }

    public void addDataBack(Employee employee){

        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null){

            head = node;
        }

        else {

            tail.setNext(node);

            node.setPrevious(tail);
        }

        tail = node;

        size++;
    }

    public void getData(){

        EmployeeNode current = head;

        while (current!=null){

            System.out.println(current);

            current = current.getNext();
        }
    }

    public EmployeeNode removeDataFront(){

        if (isEmpty()){

            return null;
        }

        EmployeeNode removeNode  = head;

        if (tail.getPrevious()==null){

            head = null;
        }

        else {

            head.getNext().setPrevious(null);
        }

        head = head.getNext();

        removeNode.setNext(null);

        return removeNode;
    }

    public EmployeeNode removeDataBack() {

        if (isEmpty()) {

            return null;
        }

        EmployeeNode removeNode = tail;

        if (tail.getPrevious() == null) {

            head = null;

        } else {

            removeNode.getPrevious().setNext(null);

        }

        tail = tail.getPrevious();

        removeNode.setPrevious(null);

        return removeNode;
    }
    public boolean isEmpty(){

        return head == null;
    }
}
