package day04;

import java.util.Scanner;

public class Test_3 {
	public static void main(String[] args) {
		
//		// 초기 잔액을 입력한 후, while문을 이용해서 메뉴가 무한 반복으로 생성되도록 하고
//		// 메뉴판에는 1. 사과(1000원), 2. 포도(1500원), 3.복숭아(1300원)
//		//         4. 샤인머스캣(2000원), 5. 현재 잔액 조회, 6. 금액 충전이 있다.
//		// 각 메뉴에 있는 번호를 누르면 for문을 총 몇개를 구매하는지와 남는 잔액을 출력한다. 
//		// ※ [따로 변수를 추가하여 현재잔액/과일가격을 만들고 for 조건문에 넣으세요.]
//		// 5번을 누르면 현재 잔액을 출력하고, 6번을 누르면 추가할 금액을 입력하고 남는 잔액에 더해 현재 잔액을 출력하도록 한다.
//		
//			
//		Scanner sc = new Scanner(System.in);
//		int mo = 0; //처음 충전 금액
//		int ap = 1000, gr = 1500, pe = 1300, sm = 2000; // 각 과일들 금액
//		
//		System.out.print("현재 가지고 있는 금액을 입력하세요. : ");
//		mo = sc.nextInt(); // 금액 충전
//		
//		while(true) { // 무한 반복
//			
//			System.out.println("====================마트====================");
//			System.out.println("(1). 사과(1000원)\t\t(2). 포도(1500원)");
//			System.out.println("(3). 복숭아(1300원)\t(4). 샤인머스캣(2000원)");
//			System.out.println("(5). 현재 잔액 조회\t\t(6). 금액 충전");
//			System.out.println("===========================================");
//			System.out.print("메뉴를 선택해주세요. : ");
//			
//			int select = sc.nextInt(); // 메뉴 선택
//			int i; // 구매한 과일의 갯수
//			int la; // 현재 금액 / 과일의 가격
//			
//			switch (select) {
//				case 1:
//					la = mo / ap; //
//					System.out.println("사과를 선택하셨습니다. 사과는 개당 1000원입니다.");
//					for(i = 0; i < la; i++) { 
//						mo -= ap;
//					}
//					System.out.println("현재 잔액으로 구매 가능한 사과의 갯수는 " + i + "개 입니다.");
//					System.out.println("현재 남은 잔액은 " + mo + "입니다.");
//					break;
//				case 2:
//					la = mo / gr; //
//					System.out.println("포도를 선택하셨습니다. 포도는 개당 1500원입니다.");
//					for(i = 0; i < la; i++) {  
//						mo -= gr;
//					}
//					System.out.println("현재 잔액으로 구매 가능한 포도의 갯수는 " + i + "개 입니다.");
//					System.out.println("현재 남은 잔액은 " + mo + "입니다.");
//					break;
//				case 3:
//					la = mo / pe; //
//					System.out.println("복숭아를 선택하셨습니다. 복숭아는 개당 1300원입니다.");
//					for(i = 0; i < la; i++) {  
//						mo -= pe;
//					}
//					System.out.println("현재 잔액으로 구매 가능한 복숭아의 갯수는 " + i + "개 입니다.");
//					System.out.println("현재 남은 잔액은 " + mo + "입니다.");
//					break;
//				case 4:
//					la = mo / sm; //
//					System.out.println("샤인머스캣을 선택하셨습니다. 샤인머스캣는 개당 1000원입니다.");
//					for(i = 0; i < la; i++) {  
//						mo -= sm;
//					}
//					System.out.println("현재 잔액으로 구매 가능한 샤인머스캣의 갯수는 " + i + "개 입니다.");
//					System.out.println("현재 남은 잔액은 " + mo + "입니다.");
//					break;
//				case 5:
//					System.out.println("현재 충전된 금액은 " + mo + "원 입니다."); break;
//				case 6: 
//					System.out.print("충전할 금액을 입력해주세요 : ");
//					int add = sc.nextInt();
//					System.out.println("현재 잔금 " + mo + "원에 " + add + "원을 충전하겠습니다.");
//					mo += add; 
//					System.out.println("충전이 완료되었습니다. 현재 잔액은 : " + mo +"원 입니다.");
//			}
//		}
		
		/*  문제 1.
		 *  식량창고에 2마리의 생쥐가 있는데 매 7일이 지나면 생쥐의 마릿수는 2배가 된다.
		 *  식량창고에는 1000kg의 식량이 있는데 1마리당 1일 100g씩 먹는다.
		 *  식량창고에 있는 식량이 떨어지면 식량창고에는 최대 생쥐가 몇마리까지 존재하는지 출력하시오. 
		 */
		
//		int mouse = 2; // 초기 새위
//		int food = 1000000;
//		int i;
//		for(i = 1; i < food; i++) {
//			food = food - (mouse * 100);
//			System.out.println(i + "일 차 생쥐의 마릿수는 " + mouse + "이고 식량은 " + food +"정도 남았습니다." );
//			if(i % 7 ==0) {
//				mouse *= 2;
//			}
//		}
//		System.out.println("총 생쥐의 마릿수는 " + mouse + "이고 " + (i-1) +"일에 식량이 모두 떨어졌다.");
		
		/* 문제2.
		 * 1. 수를 하나 입력받고, 1~ 입력받은 수 까지의 합 구하기
		 */
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수를 입력해주세요. : ");
//		int num = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//			System.out.println("num : " + i);
//			System.out.println("sum : " + sum);
//			System.out.println("-----------------");
//		}

		// 음료 자판기에 아래의 기능을 구현 하시오
		// 1. 입금(추가 입금 시 누적)
		// 2. 구입(음료 선택 시 "음료이름+가 나왔습니다"출력하고 남은 금액 출력)
		//	1. 커피(2500원)
		//	2. 코코아(2000원)
		//	3. 아이스티(1500원)
		// (음료가격보다 금액이 적을 때 "금액이 부족합니다." 출력)
		// 3. 현재 금액 확인
		// 4. 잔돈 반환(잔돈을 반환하고 금액을 0로 만듬)
		// 5. 종료
		// (잘못 입력 시 "다시 입력" 출력)	
		
//		Scanner sc = new Scanner(System.in);
//		int money = 0;
//		
//		while(true) {	
//			System.out.println("(1). 입금\t\t(2). 구입");
//			System.out.println("(3). 현재 급액 확인\t(4). 잔돈 반환");
//			System.out.println("(5). 종료");
//			System.out.print("메뉴를 선택해주세요. : ");
//			int num = sc.nextInt();
//			
//			switch (num) {
//			case 1:
//				System.out.print("입금할 금액을 입력하세요. : ");
//				int add = sc.nextInt();
//				money = money + add; 
//				System.out.println("입금하여 현재금액은 " + money + "원 입니다.");
//				break;
//			case 2:
//				System.out.println("구입할 음료의 리스트입니다.");
//				System.out.println("1. 커피(2500)");
//				System.out.println("2. 코코아(2000)");
//				System.out.println("3. 아이스티(1500)");
//				System.out.print("어느 음료를 시킬지 입력하세요. : ");
//				int ch = sc.nextInt();
//				switch (ch) {
//				case 1:
//					System.out.println("커피를 선택하셨습니다.");
//					money = money - 2500;
//					System.out.println("현재 남은 잔액은 " + money + "원 입니다."); break;
//				case 2:
//					System.out.println("코코아를 선택하셨습니다.");
//					money = money - 2000;
//					System.out.println("현재 남은 잔액은 " + money + "원 입니다."); break;
//				case 3:
//					System.out.println("아이스티를 선택하셨습니다.");
//					money = money - 1500;
//					System.out.println("현재 남은 잔액은 " + money + "원 입니다."); break;
//				} break;
//			case 3:
//				System.out.println("현재 금액을 출력합니다. : " + money); break;
//			case 4:
//				System.out.println("남은 잔액을 반환합니다.");
//				money = 0;
//				System.out.println("현재 남은 잔액은 "+ money +"원 입니다."); break;
//			case 5:
//				System.out.println("종료합니다.");
//				System.exit(0);
//			}
//		}
		
		/* 문제 4
		 * 0단부터 9단까지의 구구단
		 */
		
//		for(int i = 0; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i +" * "+ j +" = "+ i*j);
//			}
//		}
	}
}
