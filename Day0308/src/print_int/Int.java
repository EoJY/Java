package print_int;

public class Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		//%d : 10진수의 정수를 출력 (decimal)
		System.out.printf("%d \n",10);
		//%o : 8진수의 정수를 출력
		System.out.printf("%o \n",10);
		//%x : 16진 정수를 출력
		System.out.printf("%x \n",10);
		//2진수 출력하는 서식문자는 없음
		//%b : 논리값(boolean)
		System.out.printf("%b \n",true);
		//%f : 실수 출력(float)
		//%.1f : 소수점 1자리까지 출력
		System.out.printf("%.2f \n",3.14);
		//%c : 문자 하나 출력(character)
		System.out.printf("%d \n",(int)a);		
		//%s : 문자열 출력(string)
		System.out.printf("%s \n","abc");
	}

}
