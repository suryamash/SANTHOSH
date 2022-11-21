package org.college;

public class College {
	
	private void collegeName() {
		System.out.println("collegeName");

	}
	
	private void collegeCode() {
	System.out.println("collegeCode");

	}
	
	private void collegeRank() {
	System.out.println("collegeRank");

	}
	
	public static void main(String[] args) {
		College a = new College();
		a.collegeName();
		a.collegeCode();
		a.collegeRank();
		
		Student b= new Student();
		b.studentName();
		b.studentDept();
		b.studentId();
		
		Hostel c= new Hostel();
		c.hostelName();
		
		dept d = new dept();
		d.deptName();
	}

}
