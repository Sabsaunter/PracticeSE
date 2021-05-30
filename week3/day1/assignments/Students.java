package week3.day1.assignments;

public class Students {
	
	public void getStudentInfo(String name) {

		System.out.println("Student name is: "+name);

	}
	
	public void getStudentInfo(int id) {

		System.out.println("Student id is: "+id);

	}
	
	public void getStudentInfo(String name, String dept) {

		System.out.println("Student name & dept is: "+name+"., "+dept);

	}
	
	public void getStudentInfo(int id, String name) {

		System.out.println("Student id & name is: "+id+"., "+name);

	}
	
	public void getStudentInfo(String email, Long mobileno) {

		System.out.println("Student email & mobile no is: "+email+"., "+mobileno);

	}
	

	public static void main(String[] args) {
		
		Students studDetail=new Students();
		studDetail.getStudentInfo("XYZ");
		studDetail.getStudentInfo(123);
		studDetail.getStudentInfo("ABC", "IT");
		studDetail.getStudentInfo(456, "Steve Jobs");
		studDetail.getStudentInfo("test@gmail.com", 9099999999l);

		

	}

}
