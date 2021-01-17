package LIST;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratingArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("New Delhi");
        list.add("Patna");
        list.add("Nagpur");
        list.add("Pune");

        for (int i=0; i<list.size(); i++){

            System.out.println(list.get(i));
        }

        System.out.println("***********");

        for (String s : list){

            System.out.println(s);
        }

        System.out.println("*************");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next());
        }

        System.out.println("4th *********************");

        list.stream().forEach(s -> System.out.println(s));
    }
}
