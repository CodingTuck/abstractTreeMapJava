package tucker21TreeMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class ExecutableTreeMap {

	public static void main (String[] args) {
		//create the array for Employee class holding at least 8 objects
				Employee[] arrayObjects = new Employee[8];
				arrayObjects[0] = new Employee("23232", "Baker", "Amy", 100000);
				arrayObjects[1] = new Employee("56789", "Jones", "Dan", 130000);
				arrayObjects[2] = new Employee("11111", "Scott", "Bob", 65000);
				arrayObjects[3] = new Employee("67765", "Jones", "Don", 140000);
				arrayObjects[4] = new Employee("12345", "Baker", "Tom", 200000);
				arrayObjects[5] = new Employee("12579", "Jones", "Pat", 80000);
				arrayObjects[6] = new Employee("45454", "Perez", "Ava", 105000);
				arrayObjects[7] = new Employee("24680", "Scott", "Ann", 90000);
				
				//create ArrayList from the array of Employee objects
				ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(arrayObjects));
				
				//display the employees using an advanced for loop
				for(Employee tree : employeeList) {									
					System.out.println(tree);
				}
				
				//create the treemap
				TreeMap<String, Employee> keyValues = new TreeMap<String, Employee>();
				//map emp ID numbers to associated employee and add elements
				for(Employee mapOut : employeeList) {
					keyValues.put(mapOut.getId(), mapOut);
				}
				
				//treemap foreach expression and lambda expression to print out the employees
				System.out.println("All Employees \n");
				keyValues.forEach((stringKey, empValues) -> System.out.println((stringKey + ":" + empValues)));
	}
}
