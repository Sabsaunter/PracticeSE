package other.learning;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {


		String location="Using Buffered File Writer.txt";
		String Content="File Buffered Writer Example";
		
		FileWriter fileWriter= new FileWriter(location);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				
		bufferedWriter.write(Content);
		bufferedWriter.close();

	}

}
