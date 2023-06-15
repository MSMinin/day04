package switch_;

import java.util.Scanner;

public class TestClass05 {
	public static void main(String[] args) {
		//문제 1
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("날짜를 입력해주세요. : ");
//		int n = sc.nextInt();
//		if(n < 1 || n > 31) {
//			System.out.println("날짜가 1보다 작거나 31보다 큽니다.");
//		}else {
//			switch (n % 7) {
//				case 0:System.out.println("일"); break;
//				case 1:System.out.println("월"); break;
//				case 2:System.out.println("화"); break;
//				case 3:System.out.println("수"); break;
//				case 4:System.out.println("목"); break;
//				case 5:System.out.println("금"); break;
//			    case 6:System.out.println("토");
//			}
//		}
		
		// 문제 2
		Scanner sc = new Scanner(System.in);
		String home = null, com = null;	
		int sel;
		while(true) {
			System.out.println("===========");
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.println("===========");
			System.out.print("메뉴를 선택하세요. :");
			sel = sc.nextInt();
			
			switch (sel) {
				case 1: System.out.print("우리집을 등록하세요. : "); 
					home = sc.next(); break;
				case 2: System.out.print("회사를 등록하세요. : "); 
					com = sc.next(); break;
				case 3: 
					System.out.println("-------------");
					System.out.println("우리집 :" + home);
					System.out.println("회사 : " + com);	
					System.out.println("-------------\n");
			}	
		}		
	}
}
