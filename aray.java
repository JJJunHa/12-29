import java.util.Scanner;

public class aray {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int[] m = new int[5];
		int i=0;
		int sum=0;
		int pp=0;
		while(i<m.length) {
			System.out.println("�Է��Ͻÿ�");
			m[i]=s.nextInt();
			sum+=(m[i]);
			i++;
		}
		
		System.out.println("------------------");
		i=0;
		
		while(i<m.length) {
			//������ �հ踦 ����
			System.out.println(m[i]);
			
			i++;
		}
		System.out.println("���� "+sum);
		System.out.println("����� "+(sum/(m.length)));
		
		//������� ���
		System.out.println("���α׷�����.");
	}

}
