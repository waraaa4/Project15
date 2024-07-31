package main.quiz;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz5 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("quiz5.txt");
		
		for(int i=1; i <=10; i++) {
			if(i%2 == 0) {
				fw.write(i);
			}
			
		}
		fw.flush();
		
	}

}
