package EX;

public class P80 {

	public static void main(String[] args) {
	int x = -10;
	int absX = x >= 0 ? x:-x;
	System.out.println(absX);
	
	int score = 70;
	char grade = score >= 90 ? 'A':(score >= 80? 'B':score >= 70? 'C':'D');
	System.out.println(grade);
	
	int i = 10;
	System.out.println(i+=3);
	System.out.println(i-=3);
	System.out.println(i*=3);
	System.out.println(i/=3);
	System.out.println(i%=3);
	System.out.println(i<<=1);
	System.out.println(!((float)3/2==1));
	System.out.println(3/2|1);
	
	
	
	
	
	}
	
}
