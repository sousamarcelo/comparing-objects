package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;

public class Program {
	
	public static void main(String[] args)  {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<Employee>();
		
		String path = "C:\\temp\\test\\Employee.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String emp = br.readLine();
			while (emp != null) {
				String[] fields = emp.split(",");
				employees.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				emp = br.readLine();
			}
			
			Collections.sort(employees);
			
			for(Employee employee : employees) {
				System.out.println(employee);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("error: " + aiobe);
		}
		
		sc.close();
		
	}

}
