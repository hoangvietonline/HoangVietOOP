package bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author HoangViet 
 * Create class ManagerFunction
 *
 */
public class ManagerFunction {
	public ManagerFunction() {

	}

	public static List<Person> mPersonList = new ArrayList<>();

	// function print menu
	public void printMenu() {
		System.out.println("===Menu===");
		System.out.println("1 . Input employee or teacher.");
		System.out.println("2 . Show payroll list.");
		System.out.println("3 . Show person has highest salary.");
		System.out.println("4 . Show total salary must paid. ");
		System.out.println("5. Exit.");
		System.out.println("---------------------------------");
	}

	// function input employee
	public void inputEmployee(Scanner sc) {
		Employee employee = new Employee();
		System.out.println("===Enter Employee===");
		System.out.println("Enter Employee id: ");
		employee.setName(sc.next());
		System.out.println("Enter Employee name");
		employee.setName(sc.next());
		System.out.println("Enter Employee birthday");
		employee.setBrithday(sc.next());
		System.out.println("Enter Employee address");
		employee.setAddress(sc.next());
		System.out.println("Enter Salary Factor");
		sc.nextLine();
		employee.setSalaryFactor(sc.nextFloat());
		mPersonList.add(employee);
	}

	// function input teacher
	public void inputTeacher(Scanner sc) {
		Teacher teacher = new Teacher();
		System.out.println("===Enter Teacher===");
		System.out.println("Enter Teacher id: ");
		teacher.setName(sc.next());
		System.out.println("Enter Teacher name");
		teacher.setName(sc.next());
		System.out.println("Enter Teacher birday");
		teacher.setBrithday(sc.next());
		System.out.println("Enter Teacher address");
		teacher.setAddress(sc.next());
		sc.nextLine();
		System.out.println("Enter Teacher hour");
		teacher.setmHour(sc.nextFloat());
		mPersonList.add(teacher);
	}

	// show payroll list
	public void showPayrollList() {
		System.out.println("List Payroll");
		for (Person person : mPersonList) {
			System.out.println("Name : " + person.getName() + "___" + "Salary : " + person.getSalary());
		}
	}

	// func show person has highest salary
	public void showPersonHighestSalary() {
		System.out.println("Person has highest salary:");
		Person person = getMaxFromArray(mPersonList);
		System.out.println("Name : " + person.getName() + "___" + person.getSalary());
	}

	// func get number max for array
	private Person getMaxFromArray(List<Person> personList) {
		Person person = personList.get(0);
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(0).getSalary() < personList.get(i).getSalary()) {
				person = personList.get(i);
			}
		}
		return person;
	}

	// func show total salary must paid
	public void showTotalSalary() {
		float sumSalary = 0f;
		for (Person person : mPersonList) {
			sumSalary += person.getSalary();
		}
		System.out.println("Total Salary must paid : " + sumSalary);
	}
}
