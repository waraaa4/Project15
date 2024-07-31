package main.quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz10 {

	public static void main(String[] args) throws IOException {

		String filepath = "C:\\cjh\\workspace";

		FileWriter fw = new FileWriter("quiz10.txt");

		printFileList(filepath, fw, 0);
	}

	public static void printFileList(String filepath, FileWriter fw, int level) throws IOException {

		File dir = new File(filepath);

		// 폴더 밑에 있는 파일 목록 꺼내기
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {

			// 배열에서 파일 꺼내기
			File file = files[i];

			// 디렉토리 여부 확인
			boolean isDirectory = file.isDirectory();

			// 파일 이름 꺼내기
			String filename = file.getName();

			StringBuilder builder = new StringBuilder();

			// 들여쓰기로 계층구조 표시
			for (int j = 0; j < level; j++) {
				builder.append("\t");
			}

			builder.append(filename);

			// 파일 이름 출력
			fw.write(builder.toString());

			if (isDirectory) { // 해당 파일이 폴더라면
				fw.write("\n");
				String subfilepath = file.getPath();
				printFileList(subfilepath, fw, level + 1); // 자기 자신을 호출하는 재귀함수
			}

			fw.write("\n");
		}
		fw.flush();

	}

}
