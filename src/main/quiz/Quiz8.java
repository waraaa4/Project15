package main.quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz8 {

	public static void main(String[] args) throws IOException {

		File dir = new File("C:\\cjh\\workspace");

		File[] files = dir.listFiles();

		FileWriter fw = new FileWriter("quiz8.txt");

		for (int i = 0; i < files.length; i++) {
			// 파일 이름 꺼내서
			File file = files[i];
			String filename = file.getName();
			// 텍스트 파일에 쓰기
			fw.write(filename);
			
		}

		// 버퍼 비우기
		fw.flush();

	}

}
