package main.quiz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("quiz7.txt");
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		osw.write("프");
		osw.write("로");
		osw.write("그");
		osw.write("래");
		osw.write("밍");
		
		osw.flush();
	}

}
