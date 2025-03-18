package com.example.demo.collection;

import java.util.ArrayList;

import com.example.demo.clone.Employee;

public class CustomArrayList<E> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        if (!contains(e)) { // Check if the element already exists in the list
            return super.add(e); // If not, add the element to the list
        }
        return false; // If element exists, do not add it and return false
    }

    public static void main(String[] args) {
        CustomArrayList<String> list = new CustomArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicate, won't be added

        // Printing the list
        System.out.println(list); // Output: [Apple, Banana]
        
        CustomArrayList<Employee> employeeList = new CustomArrayList<>();
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.setName("Yu");
        e2.setName("Ying");
        e3.setName("Yu");
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        
        employeeList.stream().forEach(e -> System.out.println(e.getName()));
        
    }
}

