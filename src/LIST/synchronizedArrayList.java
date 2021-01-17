package LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class synchronizedArrayList {

    public static void main(String[] args) {

        List<String> list = Collections.synchronizedList(new ArrayList<String>());

        list.add("ritesh");
        list.add("sameer");
        list.add("pawan");
        list.add("dablu");

        synchronized (list){

            Iterator<String> itr = list.iterator();

            while (itr.hasNext()){

                System.out.println(itr.next());
            }
        }

        CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();

        arrayList.add("Patna");
        arrayList.add("Buxar");
        arrayList.add("Ara");

        System.out.println(arrayList);




    }
}
