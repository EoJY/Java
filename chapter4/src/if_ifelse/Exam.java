package if_ifelse;
import java.util.Scanner;
public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x=2; 에서 x값이 짝수인지 홀수 인지 판단하는 프로그램을 작성하시오
		Scanner abc = new Scanner(System.in);
		System.out.print("x의 값을 입력해주세요. : ");
		int x = abc.nextInt();
		if (x % 2 == 0)
		{
			System.out.println("짝수");
		}
		else
		{
		System.out.println("홀수");
		}
	
		//정수를 입력받아. 절대값을 표시해 주는 프로그램을 작성하라 (삼항연산자를 이용해요 작성하시오)
		int a = abc.nextInt();
		if (a >= 0 )
		{
			System.out.print("입력받은 값의 절대값은 : "+a+"이다.");
		}
		else
		{
			System.out.print("입력받은 값의 절대값은 : "+(a*-1)+"이다.");
		}
	}

}
