package Queue;

import java.util.NoSuchElementException;

public class ArrayCircularQueue {

    private int front;
    private int back;
    Employee[] queue;

    public ArrayCircularQueue(int capacity){

        queue = new Employee[capacity];

    }

    public void add(Employee employee){

        if (size() == queue.length-1){

            int numItems = size();

            Employee[] newArray = new Employee[2*queue.length];

            System.arraycopy(queue, front, newArray,0,queue.length-front);

            System.arraycopy(queue,0,newArray,queue.length-front,back);

            queue = newArray;

            front = 0;

            back = numItems;
        }

        queue[back] = employee;

        if (back<queue.length-1) {

            back++;

        }

        else{

            back = 0;
        }

    }

    public Employee remove(){

        if (size() == 0){

            throw new NoSuchElementException();

        }

        Employee employee = queue[front++];

        if (size() == 0){

            front = 0;
            back = 0;
        }

        if (queue.length==front){

            front = 0;
        }

        return employee;
    }

    public int size() {

        if (front <= back) {

            return back - front;
        }

        else {

            return back - front + queue.length;
        }
    }
    public Employee peek(){

        return queue[front];
    }

    public void printQueue() {

        if (front <= back) {

            for (int i = front; i < back; i++) {

                System.out.println(queue[i]);
            }

        }

        else {

            for (int i= front; i<queue.length; i++){

                System.out.println(queue[i]);
            }

            for (int i = 0; i<back; i++){

                System.out.println(queue[i]);
            }
        }
    }
}
