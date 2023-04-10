package org.department;

import org.college.College;

public class Department extends College {
	protected void deptName() {
		System.out.println("MCA Department");
	}

	public static void main(String[] args) {
		Department dep = new Department();
		dep.collegeCode();
		dep.collegeName();
		dep.collegeRank();
		dep.deptName();

	}

}
