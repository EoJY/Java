package if_ifelse;

public class Exam_no_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 만약 젠더값이 2 라면 여자라고 출력되도록 해주세요
		int gender = 4;
		
		//젠더가 2 이거나 4일때 여자로 출력해 주세요
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
