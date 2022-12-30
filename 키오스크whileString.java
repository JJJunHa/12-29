import java.util.Scanner;

public class whileString {

	public static void main(String[] args) {
		
		
		System.out.println("명령어를 입력하시오");
		
		Scanner s = new Scanner(System.in);
		String read = s.nextLine();
		
		do {
			if(!(read.equals("x"))) {
				
				if(read.equals("m")){
				System.out.println("메뉴관리");
			   }
				if(read.equals("o")) {
				System.out.println("주문관리");
			   }
				if(read.equals("s")){
				System.out.println("매출관리");
			   }
				System.out.println("메뉴다시입력");
		    }
			else {
				break;
				}
		read = s.nextLine();
		} while(!(read.equals("x")));
		System.out.println("관리 시스템 종료");
	
	}
}
