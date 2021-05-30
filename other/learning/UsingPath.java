package other.learning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) throws IOException {


		String location="Using Path Writer.txt";
		String Content="File Path Writer Example";
		
		Path path= Paths.get(location);
		Files.write(path, Content.getBytes());

	}

}
