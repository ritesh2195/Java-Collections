package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("ritesh","ranjan",2566));

        employeeList.add(new Employee("ranjan","kumar",5666));

        employeeList.add(new Employee("sameer","jha",6466));

        employeeList.add(new Employee("pawan","dev",56649));

        //employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);

        for (Employee emp: employeeArray){

            System.out.println(emp);
        }

        System.out.println(employeeList.contains(new Employee("ranjan","kumar",5666)));

        System.out.println(employeeList.indexOf(new Employee("ranjan","kumar",5666)));

        System.out.println(employeeList.get(0));
    }
}
