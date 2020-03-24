package bai6;

import common.Constant;

/**
 * 
 * @author HoangViet Class Teacher extends Person
 */
public class Teacher extends Person {
	private float mHour;

	public float getmHour() {
		return mHour;
	}

	public void setmHour(float mHour) {
		this.mHour = mHour;
	}

	@Override
	public float getSalary() {
		return mHour * Constant.ONE_HOUR;// salary teacher = hour * amount worked in 1 hour
	}

	@Override
	public void show() {
		System.out.println("Information Teacher");
		System.out.println("ID : " + this.getId());
		System.out.println("Name : " + this.getName());
		System.out.println("Birth day : " + this.getBrithday());
		System.out.println("Address : " + this.getAddress());
		System.out.println("Salary : " + getSalary());
	}
}
