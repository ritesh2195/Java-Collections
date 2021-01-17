package LIST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class duplicatesElementArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5,5,6,6,7,7,8,8,9,9));

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(list);

        ArrayList<Integer> arrayList = new ArrayList<>(linkedHashSet);

        System.out.println(arrayList);

        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());

        System.out.println(list1);
    }
}
