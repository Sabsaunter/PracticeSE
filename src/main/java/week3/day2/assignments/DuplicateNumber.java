package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

//import io.opentelemetry.trace.Link;

public class DuplicateNumber {

	public static void main(String[] args) {


		List<Integer> data = new ArrayList<Integer>();
		
		data.add(1);
		data.add(3);
		data.add(8);
		data.add(3);
		data.add(11);
		data.add(5);
		data.add(6);
		data.add(4);
		data.add(7);
		data.add(6);
		data.add(7);
		
		for (int i = 0; i < data.size(); i++) {
			for (int j = i+1; j < data.size(); j++) {
				
				if (data.get(i)==data.get(j)) {
					
					System.out.print(data.get(i)+" ");
					
									
				}
				
			}
			
		}
		

	}

}
