package if_ifelse;
import java.util.Scanner;
public class Example_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�ݺ�����ϰ��� �ϴ� ������ �Է����ּ���. :");
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		int i = 0;
		for (i = 5; i >0; i--)
		{
			System.out.print(type+"\t");
		}
		
		
		for(i= 0; i<3; i++)
		{
			System.out.println("��"+i);
			for(i = 0; i < 4; i++)
			{
				System.out.println("�ƴϿ�"+i);
			}
		}

	}

}