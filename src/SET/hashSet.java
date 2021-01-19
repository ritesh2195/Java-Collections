package SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("ritesh");
        set.add("ranjan");
        set.add("mishra");

        System.out.println(set);
        System.out.println(set.contains("ritesh"));

        for (String s : set){

            System.out.println(s);
        }

        System.out.println(">>>>>>>>>>>>>>>>>>");

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next());
        }
    }
}
