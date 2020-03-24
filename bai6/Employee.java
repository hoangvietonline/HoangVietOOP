package bai6;

import common.Constant;

/**
 * 
 * @author HoangViet Class Employee extends Person
 * 
 */
public class Employee extends Person {
	private float mSalaryFactor;

	@Override
	public float getSalary() {
		return mSalaryFactor * Constant.BASE_SALARY; //salary = baseSalary * SalaryFactor
	}

	@Override
	public void show() {
		System.out.println("Information Employee");
		System.out.println("ID : " + this.getId());
		System.out.println("Name : " + this.getName());
		System.out.println("Birth day : " + this.getBrithday());
		System.out.println("Address : " + this.getAddress());
		System.out.println("Salary : " + getSalary());
	}

	public float getSalaryFactor() {
		return mSalaryFactor;
	}

	public void setSalaryFactor(float mSalaryFactor) {
		this.mSalaryFactor = mSalaryFactor;
	}
}
