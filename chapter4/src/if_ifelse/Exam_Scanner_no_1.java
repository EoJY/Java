package if_ifelse;

import java.util.Scanner;


public class Exam_Scanner_no_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������ �Է��� �ּ��� : ");
		Scanner carot = new Scanner(System.in);
		int score = carot.nextInt();
		
		if (score >= 90)
		{
			System.out.println("��");
		}
		else if (score >= 80)
		{
			System.out.println("��");
		}
		else if (score >= 70 )
		{
			System.out.println("��");
		}
		else
		{
			System.out.println("���հ�");
		}
		System.out.print("Ű�� �Է��� �ּ��� : ");
		float height = carot.nextFloat();
		
	    if (height >=180)
	    {
	    	System.out.println("����");
	    }
	    else if (height >=160)
	    {
	    	System.out.println("����");
	    }
	    else
	    {
	    	System.out.println("����� �Է��� �ּ���");
	    }
	}

}