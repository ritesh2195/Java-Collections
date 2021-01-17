package Map;

import java.util.HashMap;
import java.util.Map;

public class mapComparison {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("name","ritesh");
        map.put("age","25");
        map.put("city","buxar");

        Map<String,String> map1 = new HashMap<>();

        map1.put("name","ritesh");
        map1.put("age","25");
        map1.put("city","buxar");

        System.out.println(map.equals(map1));

        Map<String,String> map2 = new HashMap<>();

        map2.put("name","buxar");
        map2.put("age","25");
        map2.put("city","ritesh");

        System.out.println(map.equals(map2));

        Map<String,String> map3 = new HashMap<>();

        map3.put("name","ritesh");
        map3.put("age","25");
        map3.put("city","ara");
        map3.put("city","buxar");

        System.out.println(map.equals(map3));

        System.out.println(map.keySet().equals(map3));
        System.out.println(map.keySet().equals(map1.keySet()));
    }
}
