package day04;

import java.util.Scanner;

public class Test_4 {
	public static void main(String[] args) {
		/* 문제 1
		 * 1부터 100까지의 숫자 중에서 3의 배수인 숫자를 모두 출력하는 프로그램을 작성하세요.
		 */
		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 3 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		/* 문제 2
		 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		 */
//		Scanner sc = new Scanner(System.in);
//		System.out.print("값을 입력해주세요. : ");
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= n; i++) {
//			sum += i;
//		}
//		System.out.println("1부터 입력한 값의 총합은 : " + sum);
		
		/* 문제 3
		 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		 *	하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		 *	숫자를 입력하면 숫자만큼 점점 증가하는 별 찍기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요.");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}
		
	}
}
