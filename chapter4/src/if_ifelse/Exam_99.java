package if_ifelse;
import java.util.Scanner;
public class Exam_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int i = 0;
		
		for(i= 1; i<10; i++)
		{
			System.out.println("3단:3*"+i+"="+a*i);
			
		}
		System.out.print("출력하고자 하는 구구단의 단수를 입력하세요.:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(i=1; i<10; i++)
		{
			System.out.println(input+"*"+i+"="+input*i);
		}

	}

}
