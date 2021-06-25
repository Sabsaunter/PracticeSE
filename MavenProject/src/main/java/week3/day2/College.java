package week3.day2;

public class College extends University{
	
	@Override
	void Ug() {


		System.out.println("Under Graduation called from abstract class");
		
	}

	public static void main(String[] args) {

		College myCollege= new College();
		myCollege.Pg();
		myCollege.Ug();

	}

	

}
