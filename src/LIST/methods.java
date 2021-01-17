package LIST;

import java.util.ArrayList;
import java.util.Arrays;

public class methods {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("BRK");
        list.add("SBS");
        list.add("ASM");
        list.add("DSSV");

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("New Delhi");
        list1.add("Patna");
        list1.add("Nagpur");
        list1.add("Pune");

        list.addAll(list1);

//        System.out.println(list);
//        System.out.println("***********");
//
//        list.addAll(2,list1);
//
//        System.out.println(list);

        ArrayList<String> cloneList = (ArrayList<String>)list.clone();

        System.out.println(cloneList);

        System.out.println(list.contains("ASM"));

        System.out.println(list.indexOf("DSSV"));

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("BRK");
        list2.add("SBS");
        list2.add("BRK");
        list2.add("ASM");
        list2.add("BRK");
        list2.add("DSSV");
        list2.add("BRK");

        System.out.println(list2.lastIndexOf("BRK"));

        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        arrayList.removeIf(num -> num%2==0);

        System.out.println(arrayList);

        ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> subList = new ArrayList<>(number.subList(1,5));

        System.out.println(subList);

    }

}
