package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {

	public static void main(String[] args) throws IOException {

		// 바이트 기반 스트림 생성
		FileInputStream fis = new FileInputStream("reader.txt");

		while (true) {
			int i = fis.read(); // 1바이트씩 읽기
			if (i == -1) {
				break;
			}
			System.out.print(i + " ");
		}
		
		// 바이트 기반 스트림 생성
		FileInputStream fis2 = new FileInputStream("reader.txt");
		// 보조 스트림 생성
		InputStreamReader isr2 = new InputStreamReader(fis2);
		
		while (true) { //복붙
			int i = isr2.read();
			if (i == -1) {
				break;
			}
			System.out.print((char) i); // 문자로변환 (안녕하세요)
		}

	}

}
