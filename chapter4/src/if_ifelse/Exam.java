package if_ifelse;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x=2; ���� x���� ¦������ Ȧ�� ���� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�
		Scanner abc = new Scanner(System.in);
		System.out.print("x�� ���� �Է����ּ���. : ");
		int x = abc.nextInt();
		if (x % 2 == 0)
		{
			System.out.println("¦��");
		}
		else
		{
		System.out.println("Ȧ��");
		}
	
		//������ �Է¹޾�. ���밪�� ǥ���� �ִ� ���α׷��� �ۼ��϶� (���׿����ڸ� �̿��ؿ� �ۼ��Ͻÿ�)
		int a = abc.nextInt();
		if (a >= 0 )
		{
			System.out.print("�Է¹��� ���� ���밪�� : "+a+"�̴�.");
		}
		else
		{
			System.out.print("�Է¹��� ���� ���밪�� : "+(a*-1)+"�̴�.");
		}
	}

}
