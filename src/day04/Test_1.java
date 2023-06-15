package day04;

import java.util.Scanner;

public class Test_1 {
	public static void main(String[] args) {
		/* 문제 1
		 * 월 입력받고 그에 해당하는 계절 출력하기 (if문 과 switch문 이용)
		 *	ex) 1월 --> 겨울/ 3월 --> 봄/ 7월 --> 여름 /10월 --> 가을
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("월을 입력하세요. : ");
//		int num = sc.nextInt();
//		int y = 0;
//		if(12 >= num && num >=10) {
//			y = 4; // 가을
//		} else if (10 > num && num >= 7) {
//			y = 3; // 여름
//		}else if (7 > num && num >= 3) {
//			y = 2; //
//		}else if (3 > num && num >= 1) {
//			y = 1;
//		}
//		
//		switch (y) {
//		case 1: System.out.println("봄"); break;
//		case 2: System.out.println("여름"); break;
//		case 3: System.out.println("가을"); break;
//		case 4: System.out.println("겨울"); break;
//		}
//		
		
		/* 문제 2
		 * 출생월을 입력받아 계절 출력하기 (for, if문 사용)
		 */ 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("출생월을 입력해주세요.");
//		int m = sc.nextInt();
//			if(12 >= m && m >=10) { //가을
//				System.out.println("가을");
//			} else if (10 > m && m >= 7) { //여름
//				System.out.println("여름");
//			}else if (7 > m && m >= 3) { //봄
//				System.out.println("봄");
//			}else if (3 > m && m >= 1) { //겨울
//				System.out.println("겨울");
//		}
		
		/* 문제 3
		 * 출력 값의 짝수 , 홀수를 구분해서 나온 짝수끼리 합과 나온 홀수끼리의 합을 출력하시오.
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.println("입력한 수까지 짝,홀을 구분하고 더합니다. : ");
//		int n = sc.nextInt();
//		int sum1 = 0, sum2 = 0;
//		for(int i = 1; i <= n; i++) {
//			if(i % 2 == 0) {
//				sum1 += i;
//			}else {
//				sum2 += i;
//			}
//		}
//		System.out.println("짝수의 합 : " + sum1);
//		System.out.println("홀수의 합 : " + sum2);
		
		/* 문제 4
		 * 사용자에게 명령어를 입력받아 처리하는 프로그램을 작성하세요.
		   "count" 명령어는 입력할 학생의 수를 입력받습니다.
            > 학생 수를 입력 받지 않고 아래 명령어를 입력하는 경우 "학생 수를 입력하세요"를 출력한 후 메인 메뉴로 돌아옵니다.
			"member" 명령어는 사용자의 이름과 주소를 입력받은 후 메인 메뉴로 돌아옵니다.
			"grade" 명령어는 사용자의 국어, 수학, 영어 성적을 차례대로 입력 받은 후 메인 메뉴로 돌아옵니다.
				"print" 명령어는 입력 받은 정보를 아래와 같이 출력한 후 메인 메뉴로 돌아옵니다. 메인 메뉴를 돌아온 후에는 학생의 수를 다시 입력 받아야하며, 다른 명령어 입력 시 "학생 수를 입력하세요"를 출력합니다.
         이름 : ㅇㅇㅇ
         주소 : ㅇㅇㅇ
         국어 : ㅇㅇㅇ
         수학 : ㅇㅇㅇ
         영어 : ㅇㅇㅇ
         총점 : ㅇㅇㅇ
         평균 : ㅇㅇㅇ \n
			"exit" 명령어를 입력할 경우 프로그램을 종료합니다.
			단, 변수는 아래의 변수만 사용합니다.
         Scanner 변수
         명령어 저장 변수 cmd (기본값 : "")
         학생 수 저장 변수 cnt (기본값 : -1)
         학생 정보 저장 변수 String[][] student (기본값 : {})
         성적 저장 변수 int[][] grade (기본값 : {})
         LCV 변수 boolean flag (기본값 : true)
			while 한 번, switch 한 번, for 세 번, if 세 번만 사용하면 됩니다.
		 */
		
		// 풀 가치가 없음
	
	}
}
