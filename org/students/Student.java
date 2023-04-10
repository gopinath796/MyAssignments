package org.students;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Tony");
	}

	public void studentDept() {
		System.out.println("MCA Department");
	}

	public void studentId() {
		System.out.println("MCA00796");
	}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentId();
		stu.studentDept();

	}

}
