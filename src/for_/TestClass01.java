package for_;

import java.util.Scanner;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		   for(초기값; 조건식; 증감식){
		   		종속문장
		   }
		   다음문장
		   -----------
		   반복문
		   - 동일한 코드를 여러번 동작하고자 하는 경우
		   - 규칙적으로 값이 변한다면 반복문울 사용할 수 있다.
		 */
//		int sum = 0, i =1;
//		sum = sum + i;
//		i++;
//		sum = sum + i;
//		i++;
//		sum = sum + i;
//		i++;
//		sum = sum + i;
//		i++;
//		sum = sum + i;
//		i++;
//		sum = sum + i;
//		i++;
//		sum = sum + i;
//		i++;
//		sum = sum + i;
//		i++;
//		sum = sum + i;
//		i++;
//		sum = sum + i;
//		i++;
//		System.out.println(sum);
		
		Scanner sc = new Scanner(System.in);
		int mo = sc.nextInt();
		int ap = 1000;
		
		System.out.println(mo/ap);
	}
}

