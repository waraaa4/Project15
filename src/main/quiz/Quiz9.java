package main.quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz9 {

	public static void main(String[] args) throws IOException {

		String filepath = "C:\\cjh\\workspace";

		FileWriter fw = new FileWriter("quiz9.txt");

		printFileList(filepath, fw);

	}

	public static void printFileList(String filepath, FileWriter fw) throws IOException {

		File dir = new File(filepath);

		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			String filename = file.getName();
			fw.write(filename); 
		}

		fw.flush();

	}

}
