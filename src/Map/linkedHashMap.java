package Map;

import java.util.LinkedHashMap;

public class linkedHashMap {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1,"ritesh");
        map.put(2,"ranjan");
        map.put(3,"mishra");

        System.out.println(map);
        System.out.println("******************");

        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        map1.put(1,"ritesh");
        map1.put(3,"mishra");
        map1.put(2,"ranjan");

        System.out.println(map1);
    }
}
