package week3.day1.assignments;

public class Student extends Department{
	
	public void studentName() {

		System.out.println("Student Name is: "+"Gautham");

	}
	
	public void studentDept() {

		System.out.println("Student Dept is: "+"Mech");

	}
	
	public void studentId() {

		System.out.println("Student ID is: "+"Mech051");

	}

	public static void main(String[] args) {


		Student studDetail = new Student();
		studDetail.collegeName();
		studDetail.collegeCode();
		studDetail.collegeRank();
		studDetail.deptName();
		studDetail.studentName();
		studDetail.studentId();
		studDetail.studentDept();

	}

}
