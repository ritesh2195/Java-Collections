package linkedlist;

public class printMethod {

    public static void main(String[] args) {

        Employee ritesh = new Employee("ritesh","ranjan",2566);

        Employee ranjan = new Employee("ranjan","kumar",6166);

        Employee sameer = new Employee("sameer","vyas",6555);

        EmployeeDoublyLinkedList list1 = new EmployeeDoublyLinkedList();

        list1.addDataFront(ritesh);
        list1.addDataFront(ranjan);
        list1.addDataFront(sameer);

        Employee pawan = new Employee("pawan","verma",3266);

        list1.addDataBack(pawan);

        list1.getData();

        System.out.println("......................");

        System.out.println(list1.removeDataBack());
        System.out.println(list1.removeDataFront());

        System.out.println("..........................");

        list1.getData();
    }
}
