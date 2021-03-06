package EX;

import java.io.PrintStream;

public class P70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 10;
		System.out.println(7^5);
		System.out.println(Integer.toBinaryString(b));
		int x = 8;
		System.out.println(Integer.toBinaryString(x));	
		System.out.println((int)00001010);
		String a = "1010";
		System.out.println(Integer.parseInt(a,2));
		
		
		//예제 비트연산자를 이용한 다중 플래그 처리
		byte flag1 = 0b00000001; //1
		byte flag2 = 0b00000010; //2
		byte flag3 = 0b00000100; //4
		byte flag4 = 0b00001000; //8
		
		byte result = 0b00000000; //0
		
		//flag1,2 값을 on 한다
		result = (byte)(result|flag1);
		System.out.println(Integer.toBinaryString(result));
		result = (byte)(result|flag2);
		System.out.println(Integer.toBinaryString(result));
		
		//flag1의 값을 off한다. ~는 틸트연산자
		result = (byte)(result&~flag1);
		System.out.println(Integer.toBinaryString(result))
		;
		
	}

}
