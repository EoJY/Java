package if_ifelse;
import java.util.Scanner;
public class System_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sv = new Scanner(System.in);
		int gender = sv.nextInt();
		
		if(gender==2 || gender==4) 
		{
			System.out.println("����");
		}
		else if(gender == 3)
		{
			System.out.println("����");
		}	
		
		//������ 3�ΰ�� ���ڷ� ���
		//������ 4�ΰ�� ���ڷ� ���
		if (gender == 4)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�߼�");			
		}
		
	}

}
