package flotingpoint;

public class Flotingpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float y = 5.67356784f;
		
		System.out.println("y="+y);
		System.out.printf("floating-point:%.8f\n",y);	// �Ǽ���, �Ҽ��� 8�ڸ����� //�Ҽ��� 9�ڸ�°���� �ݿø�
		System.out.printf("floating-point:%020.8f\n",y); // �� 20�ڸ�, �Ҽ��� �Ʒ� 8�ڸ� ����, �������� 0���� ä����
		System.out.printf("floating-point:%20.8f\n",y); // �� 20�ڸ�, �Ҽ��� �Ʒ� 8�ڸ� ����, �������� 0���� ä����
		System.out.printf("floating-point:%.8g\n",y); 
		System.out.printf("floating-point:%.8e\n",y); // ����ǥ������
		System.out.println("����"+y+"�̴�");
		System.out.println("����"+(y+y)+"�̴�");
	}

}