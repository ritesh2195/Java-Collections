package Map;

import java.util.concurrent.ConcurrentHashMap;

public class concurrentMap {

    public static void main(String[] args) {

        ConcurrentHashMap<String, String> conMap =  new ConcurrentHashMap<>();

        conMap.put("1","Java");
        conMap.put("2","Python");
        conMap.put("3","JavaScript");

        System.out.println(conMap);
    }
}
