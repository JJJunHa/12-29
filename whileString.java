import java.util.Scanner;

public class whileString {

	public static void main(String[] args) {
		
		
		System.out.println("��ɾ �Է��Ͻÿ�");
		
		Scanner s = new Scanner(System.in);
		String read = s.nextLine();
		
		do {
			if(!(read.equals("x"))) {
				
				if(read.equals("m")){
				System.out.println("�޴�����");
			   }
				if(read.equals("o")) {
				System.out.println("�ֹ�����");
			   }
				if(read.equals("s")){
				System.out.println("�������");
			   }
				System.out.println("�޴��ٽ��Է�");
		    }
			else {
				break;
				}
		read = s.nextLine();
		} while(!(read.equals("x")));
		System.out.println("���� �ý��� ����");
	
	}
}
