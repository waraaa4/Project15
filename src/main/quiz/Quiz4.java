package main.quiz;

import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz4 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("output.txt");

		for(int i=65; i <= 90; i++) {
			fos.write(i); // A-Z 출력
		}
		
	}

}
