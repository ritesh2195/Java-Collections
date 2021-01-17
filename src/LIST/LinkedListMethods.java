package LIST;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

    // Linked List is default class in java
    // it implements List, Queue and Stack
    // it allows null values
    // it can contain duplicate elements
    // it is dynamic collection hence insertion and deletion can be easily implemented
    // it is not synchronized
    // Manipulation is fast in Linked List

    public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<>();

        name.add("ritesh");
        name.add("ranjan");
        name.add("mishra");
        name.add(1, "ravi");

        System.out.println(name.size());
        System.out.println(name);
        System.out.println(name.get(1));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

        Iterator<String> itr = name.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next());
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        LinkedList<String> user = new LinkedList<>();

        user.add("sameer");
        user.add("pawan");

        user.addAll(name);

        System.out.println(user);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");

        LinkedList<String> lang = new LinkedList<>();

        lang.add("Java");
        lang.add("Python");
        lang.add("JavaScript");
        lang.add("Ruby");

        Iterator<String> iterator = lang.descendingIterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}