package SET;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

    enum Lang{

        JAVA,
        PYTHON,
        JAVASCRIPT,
        RUBY,
        PERL;
    }

    public static void main(String[] args) {

        EnumSet<Lang> langs = EnumSet.allOf(Lang.class);

        System.out.println(langs);

        // create empty enumset

        EnumSet<Lang> langs1 = EnumSet.noneOf(Lang.class);

        System.out.println(langs1);

        EnumSet<Lang> langs2 = EnumSet.range(Lang.JAVA, Lang.JAVASCRIPT);

        System.out.println(langs2);

        EnumSet<Lang> PythonEnum = EnumSet.of(Lang.PYTHON);

        System.out.println(PythonEnum);

        Iterator<Lang> itr = langs.iterator();

        while (itr.hasNext()){

            System.out.println(itr.next()+" ");
        }
    }
}
