package collectionProgramme;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		
       al.add(new Employee(101,"Sagar","10000"));
       al.add(new Employee(102,"Samartha","12000"));
       al.add(new Employee(103,"SAkshi","13000"));
       
       Collections.sort(al);
	
}
