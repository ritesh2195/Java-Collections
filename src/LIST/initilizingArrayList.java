package LIST;

import java.util.ArrayList;
import java.util.Arrays;

public class initilizingArrayList {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        list.add("ritesh");
        list.add(25);
        list.add(33.89);
        list.add('A');

        System.out.println(list);
        System.out.println("*****************");

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("ranjan","sameer","pawan"));

        System.out.println(list1);
        System.out.println("*****************");

        ArrayList<String> list2 = new ArrayList<>(5);

        list2.add("patna");
        list2.add("buxar");

        System.out.println(list2);
    }
}
