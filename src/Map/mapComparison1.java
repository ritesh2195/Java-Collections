package Map;

import java.util.HashMap;
import java.util.HashSet;

public class mapComparison1 {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"ritesh");
        map.put(2,"ranjan");
        map.put(3,"mishra");

        HashMap<Integer,String> map1 = new HashMap<>();

        map1.put(1,"ritesh");
        map1.put(2,"ranjan");
        map1.put(3,"mishra");
        map1.put(4,"sameer");

        HashSet<Integer> set = new HashSet<Integer>(map.keySet());
        set.addAll(map1.keySet());
        set.removeAll(map.keySet());
        System.out.println(set);
    }
}
