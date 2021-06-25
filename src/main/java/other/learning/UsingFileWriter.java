package other.learning;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {


		String location="Using File Writer.txt";
		String Content="File Writer Example";
		
		FileWriter fileWriter= new FileWriter(location);
		
		fileWriter.write(Content);
		fileWriter.close();

	}

}
