package linkedlist;

public class MainMethod {

    public static void main(String[] args) {

        Employee ritesh = new Employee("ritesh","ranjan",2566);

        Employee ranjan = new Employee("ranjan","kumar",6166);

        Employee sameer = new Employee("sameer","vyas",6555);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.add(ritesh);

        list.add(ranjan);

        list.add(sameer);

        list.getList();

        System.out.println(list.getSize());

        System.out.println(list.isEmpty());

        System.out.println(list.remove());

        System.out.println(list.getSize());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");

        EmployeeDoublyLinkedList list1 = new EmployeeDoublyLinkedList();

        list1.addDataFront(ritesh);
        list1.addDataFront(ranjan);
        list1.addDataFront(sameer);

        Employee pawan = new Employee("pawan","verma",3266);

        list1.addDataBack(pawan);

        list1.getData();

        System.out.println(list1.removeDataBack());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

        list1.getData();

        System.out.println(">>>>>>>>>>>>>>>>>");

        EmployeeDoublyLinkedList linkedList = new EmployeeDoublyLinkedList();

        linkedList.addDataBack(new Employee("nfjbj","bdjb",664));

        System.out.println(linkedList.removeDataBack());

        linkedList.getData();

    }

}
