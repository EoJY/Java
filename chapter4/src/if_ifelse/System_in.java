package if_ifelse;
import java.util.Scanner;
public class System_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sv = new Scanner(System.in);
		int gender = sv.nextInt();
		
		if(gender==2 || gender==4) 
		{
			System.out.println("여자");
		}
		else if(gender == 3)
		{
			System.out.println("남자");
		}	
		
		//젠더가 3인경우 남자로 출력
		//젠더가 4인경우 여자로 출력
		if (gender == 4)
		{
			System.out.println("여자");
		}
		else
		{
			System.out.println("중성");			
		}
		
	}

}
