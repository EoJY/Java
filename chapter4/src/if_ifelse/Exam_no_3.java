package if_ifelse;

import java.util.Scanner;

public class Exam_no_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수를 각각 성적에 맡게 매기세요
		int grade = 81;
		
		if (grade >= 90)
		{
			System.out.println("A");
		}
		else if (grade >= 89 || grade >= 80)
		{
			System.out.println("B");
		}
		else if (grade >= 79 || grade >= 70)
		{
			System.out.println("C");
		}
		else 
		{
			System.out.println("낙제");
		}
		
		
		//score 가 68이다 60 이상이면 합격으로 출력하고
		//그렇지 않으면 불합격으로 출력하시오
		int score = 78;
		
		if (score >= 70)
		{
			System.out.print("합격 :");
		}
		else
		{
			System.out.print("불합격 :");
		}
		if (score >= 90)
		{
			System.out.print(" 성적우수자");
		}
		else if (score >= 80)
		{
			System.out.print(" 평균");
		}
		else if (score >= 70)
		{
			System.out.println(" 턱걸이");
		}
		else 
		{
			System.out.println(" 주제파악하시길");
		}
		
		
		
		
		}
	

}