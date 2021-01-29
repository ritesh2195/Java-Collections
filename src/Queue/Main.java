package Queue;

public class Main {

    public static void main(String[] args) {

        Employee ritesh = new Employee("ritesh","ranjan",2566);

        Employee ranjan = new Employee("ranjan","kumar",6166);

        Employee sameer = new Employee("sameer","vyas",6555);

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(ritesh);
        queue.add(ranjan);
        queue.add(sameer);

        queue.printQueue();
        System.out.println("................");

        queue.remove();

        queue.printQueue();
    }
}
