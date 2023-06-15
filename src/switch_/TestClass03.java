package switch_;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.println("1번째 문자열 입력 : ");
		s1 = sc.next();
		
		switch (s1) {
		case "안녕": System.out.println("안녕 입력");
			break;
		case "그래": System.out.println("그래 입력");
			break;
		default: System.out.println("그 외의 값 입력");
		}
	}
}
