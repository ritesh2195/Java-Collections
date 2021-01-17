package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class comparingArrayList {

    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("ritesh", "ranjan","mishra"));

        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("ritesh", "ranjan","mishra","sameer"));

        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("mishra", "ranjan","ritesh"));

        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));

        l2.removeAll(l1);

        System.out.println(l2);

        l2.retainAll(l1);

        System.out.println(l1);
    }
}
