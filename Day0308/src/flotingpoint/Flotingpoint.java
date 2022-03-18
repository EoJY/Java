package flotingpoint;

public class Flotingpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float y = 5.67356784f;
		
		System.out.println("y="+y);
		System.out.printf("floating-point:%.8f\n",y);	// 실수형, 소수점 8자리까지 //소수점 9자리째에서 반올림
		System.out.printf("floating-point:%020.8f\n",y); // 총 20자리, 소수점 아래 8자리 포함, 나머지는 0으로 채워줌
		System.out.printf("floating-point:%20.8f\n",y); // 총 20자리, 소수점 아래 8자리 포함, 나머지는 0으로 채워줌
		System.out.printf("floating-point:%.8g\n",y); 
		System.out.printf("floating-point:%.8e\n",y); // 지수표현으로
		System.out.println("값은"+y+"이다");
		System.out.println("값은"+(y+y)+"이다");
	}

}
