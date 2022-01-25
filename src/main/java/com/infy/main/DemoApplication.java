package com.infy.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.main.model.Employee;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		PrimeNumbers pn= new PrimeNumbers();
		pn.getFirstHundredPrimeNo();
		/*
		 * char arr[]=new char[6]; arr[0]='A'; arr[1]='B'; arr[2]='J'; arr[3]='C';
		 * arr[4]='D'; arr[5]='E';
		 * 
		 * //Make changes and try to delete elements from different positions
		 * ArrayTest.delete(arr, 3); for(int i=0;i<arr.length;i++)
		 * System.out.println(arr[i]);
		 * 
		 * 
		 * List<Employee> list = new ArrayList<>();
		 * 
		 * list.add(new Employee(1,"Nilesh")); list.add(new Employee(2,"Priyanka"));
		 * list.add(new Employee(3,"Hitesh"));
		 * 
		 * Comparator<Employee> comp =Comparator.comparing(Employee::geteId);
		 * Collections.sort(list,comp); for(Employee e:list) {
		 * System.out.println(e.geteId()+" "+e.geteName()); }
		 */
		
		/*
		 * LinkedList list = new LinkedList(); list.addAtEnd("Milan");
		 * list.addAtEnd("Venice"); list.addAtEnd("Munich"); list.addAtEnd("Vienna");
		 * System.out.println("Adding an element to the linked list");
		 */
	
	}

}
