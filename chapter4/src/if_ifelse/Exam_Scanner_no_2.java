package if_ifelse;

import java.util.Scanner;

public class Exam_Scanner_no_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나잘난은 아래와 같이 성적을 받았다. 나잘난의 성적의 총 합계와 평균을 구해서 출력하는 프로그램을 작성하시오
		// 파이썬 60,자바 70, 안드로이드 80, c언어 50, c++ 30점
//		System.out.print("파이썬, 자바, 안드로이드. c언어, c++의 성적을 각각 입력하세요 :");
		
		Scanner scr = new Scanner(System.in);
		int python = scr.nextInt();
		int java = scr.nextInt();
		int android = scr.nextInt();
		int c = scr.nextInt();
		int c_pp = scr.nextInt();
		System.out.printf("파이썬: %d, 자바: %d, 안드로이드: %d, c언어: %d c++: %d%n" , python,java,android,c,c_pp);
		System.out.println("합쳐진 값은 :"+(python+java+android+c+c_pp));
		float ever = (python+java+android+c+c_pp);
		System.out.println("평균값은 :"+(ever / 5.0f));
//		
		
		System.out.printf("파이썬: %d%n, 자바: %d%n, 안드로이드: %d%n, c언어: %d%n c++: %d%n" , python,java,android,c,c_pp);
		
		
		
		
	}

}
