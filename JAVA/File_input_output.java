package ����;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_input_output {

	public static void main(String[] args) {
		
		File f = new File("input.txt");
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextInt()) { //�о���� �ִ� ���Ͽ��� �������� �о�� ������ �ִ��� �����
				System.out.println(sc.nextInt() * 100); //������ 100�� ���ؼ� ����Ѵ�.
			}
			sc.close(); //scanner �Լ��� �ݾ��ش�.
		} catch (FileNotFoundException e) {
			System.out.println("������ �о���� �������� ������ �߻��ߴ�.");
		}
		
	}

}
