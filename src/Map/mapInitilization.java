package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mapInitilization {

    public static HashMap <String, Integer> map1;

    static {

        map1 = new HashMap<>();
        map1.put("age",25);
    }

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("name","ritesh");
        map.put("designation","engineer");

        System.out.println(map.get("name"));
        System.out.println(mapInitilization.map1.get("age"));

        Map<String, String> map2 = Stream.of(new String [][]{
                {"name","ritesh"},{"age","25"}
        }).collect(Collectors.toMap(data ->data[0],data ->data[1]));

        Map<String, String> map3 = Collections.singletonMap("name","sameer");

        Map<String,String> synmap = Collections.synchronizedMap(map);

        synmap.put("home","bxr");

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println(synmap);

    }
}
