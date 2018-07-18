package 연습;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_input_output {

	public static void main(String[] args) {
		
		File f = new File("input.txt");
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextInt()) { //읽어오고 있는 파일에서 다음으로 읽어올 정수가 있는지 물어본다
				System.out.println(sc.nextInt() * 100); //정수에 100을 곱해서 출력한다.
			}
			sc.close(); //scanner 함수를 닫아준다.
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 과정에서 오류가 발생했다.");
		}
		
	}

}
