package EX;

public class P51 {
	public static void main(String[] args) {
	    char c1 ='A';
	    char c2 = (char)(c1+1);
	    char c3 = ++c1;
	    int i = 'B'-'A';
	    int j = '2'-'0';
	    System.out.println(c1);
	    System.out.println(c2);
	    System.out.println(c3);
	    System.out.println(i);
	    System.out.println(j);	
	    System.out.printf("%d %n",i);
	    
	    char a = 'A';
	    System.out.println(a); 
	    int b = 10<<1;
	    System.out.println(b);
	    System.out.printf("%d %n",b);	
	    int c = 10>>1;
	    System.out.print(c);
	    int d = 10>>>10;
	    System.out.println(d);
	    byte e = 255>>1;
	    System.out.println(e);
	    char x = 'z';
	    System.out.printf("%d%n",(int)x);
	    
	    char A = 'j';
	    System.out.println(A>='a'&&A<='z');
	    System.out.println((A>='a'&&A<='z')||(A>='A'&&A<='Z'));
	}
	
}

