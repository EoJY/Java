package if_ifelse;
import java.util.Scanner;
public class Example_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("반복출력하고자 하는 문구를 입력해주세요. :");
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		int i = 0;
		for (i = 5; i >0; i--)
		{
			System.out.print(type+"\t");
		}
		
		
		for(i= 0; i<3; i++)
		{
			System.out.println("예"+i);
			for(i = 0; i < 4; i++)
			{
				System.out.println("아니오"+i);
			}
		}

	}

}
