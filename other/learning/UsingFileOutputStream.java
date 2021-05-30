package other.learning;

import java.io.FileOutputStream;
//import java.io.FileWriter;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {


		String location="Using File OP Stream Writer.txt";
		String Content="File OP Stream Writer Example";
		
		FileOutputStream fileOutputStream = new FileOutputStream(location);
		
		byte[] bytes = Content.getBytes();
		
		fileOutputStream.write(bytes);
		fileOutputStream.close();

	}

}
