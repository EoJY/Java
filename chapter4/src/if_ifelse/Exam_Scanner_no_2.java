package if_ifelse;

import java.util.Scanner;

public class Exam_Scanner_no_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���߳��� �Ʒ��� ���� ������ �޾Ҵ�. ���߳��� ������ �� �հ�� ����� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		// ���̽� 60,�ڹ� 70, �ȵ���̵� 80, c��� 50, c++ 30��
//		System.out.print("���̽�, �ڹ�, �ȵ���̵�. c���, c++�� ������ ���� �Է��ϼ��� :");
		
		Scanner scr = new Scanner(System.in);
		int python = scr.nextInt();
		int java = scr.nextInt();
		int android = scr.nextInt();
		int c = scr.nextInt();
		int c_pp = scr.nextInt();
		System.out.printf("���̽�: %d, �ڹ�: %d, �ȵ���̵�: %d, c���: %d c++: %d%n" , python,java,android,c,c_pp);
		System.out.println("������ ���� :"+(python+java+android+c+c_pp));
		float ever = (python+java+android+c+c_pp);
		System.out.println("��հ��� :"+(ever / 5.0f));
//		
		
		System.out.printf("���̽�: %d%n, �ڹ�: %d%n, �ȵ���̵�: %d%n, c���: %d%n c++: %d%n" , python,java,android,c,c_pp);
		
		
		
		
	}

}