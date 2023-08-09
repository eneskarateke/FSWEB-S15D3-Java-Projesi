package com.workintech.maps.main;

import com.workintech.maps.models.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee>  employees = new LinkedList<>();
        Employee e1= new Employee(1,"enes","karateke");
        Employee e2= new Employee(1,"enes","karateke");
        Employee e3= new Employee(2,"dogancan","kinik");
        Employee e4= new Employee(2,"dogancan","dogancan");
        Employee e5= new Employee(3,"serkan","toraman");
        Employee e6= new Employee(3,"serkan","toraman");
        Employee e7= new Employee(4,"aytac","sahin");
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        System.out.println("Emloyees: " + employees);

        Map<Integer,Employee> uniqueEmployees = new HashMap<>();
        List<Employee> removedEmployees = new ArrayList<>();

        Iterator iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = (Employee) iterator.next();
            if(uniqueEmployees.containsKey(employee.getId())){
                removedEmployees.add(employee);
                iterator.remove();
            } else {
                uniqueEmployees.put(employee.getId(), employee);
            }
        }

        //System.out.println(removedEmployees);
//        for(Employee employee: removedEmployees){
//            employees.remove(employee);
//        }
        System.out.println(employees);
        System.out.println(uniqueEmployees);
        //employees.removeAll(removedEmployees);

        //System.out.println(employees);
    }
}