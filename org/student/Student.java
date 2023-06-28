package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Its a child class studentName");
	}
	public void studentDept() {
		System.out.println("Its a child class studentDept");
	}
	public void studentId() {
		System.out.println("Its a child class studentId");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();

	}

}
