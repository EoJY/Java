package if_ifelse;

import java.util.Scanner;

public class Exam_no_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ���� ������ �ð� �ű⼼��
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
			System.out.println("����");
		}
		
		
		//score �� 68�̴� 60 �̻��̸� �հ����� ����ϰ�
		//�׷��� ������ ���հ����� ����Ͻÿ�
		int score = 78;
		
		if (score >= 70)
		{
			System.out.print("�հ� :");
		}
		else
		{
			System.out.print("���հ� :");
		}
		if (score >= 90)
		{
			System.out.print(" ���������");
		}
		else if (score >= 80)
		{
			System.out.print(" ���");
		}
		else if (score >= 70)
		{
			System.out.println(" �ΰ���");
		}
		else 
		{
			System.out.println(" �����ľ��Ͻñ�");
		}
		
		
		
		
		}
	

}