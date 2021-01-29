package Stack;

public class Main {

    public static void main(String[] args) {

        StackArray array = new StackArray(10);

        array.push(new Employee("ritesh","mishra",156));
        array.push(new Employee("sameer","vyas",658));
        array.push(new Employee("pawan","verma", 254));

        array.printStack();

        System.out.println(".....................");

        //array.pop();

        System.out.println(array.peak()) ;
    }
}
