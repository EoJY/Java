package if_ifelse;

import java.util.Scanner;


public class Exam_Scanner_no_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("성적을 입력해 주세요 : ");
		Scanner carot = new Scanner(System.in);
		int score = carot.nextInt();
		
		if (score >= 90)
		{
			System.out.println("수");
		}
		else if (score >= 80)
		{
			System.out.println("우");
		}
		else if (score >= 70 )
		{
			System.out.println("미");
		}
		else
		{
			System.out.println("불합격");
		}
		System.out.print("키를 입력해 주세요 : ");
		float height = carot.nextFloat();
		
	    if (height >=180)
	    {
	    	System.out.println("위너");
	    }
	    else if (height >=160)
	    {
	    	System.out.println("루저");
	    }
	    else
	    {
	    	System.out.println("제대로 입력해 주세요");
	    }
	}

}
