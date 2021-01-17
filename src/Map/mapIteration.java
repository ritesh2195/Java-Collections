package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapIteration {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"ritesh");
        map.put(2,"ranjan");
        map.put(3,"mishra");

        Iterator<Integer> itr = map.keySet().iterator();

        while (itr.hasNext()){

            int key = itr.next();

            System.out.println(map.get(key));
        }

        System.out.println("************************");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){

            Map.Entry<Integer,String> entry = iterator.next();

            int key = entry.getKey();

            String value = entry.getValue();

            System.out.println(value);
        }
    }
}
