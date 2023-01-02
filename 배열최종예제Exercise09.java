import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studenNum = 0;
		int[] scores = null;
		int i = 0;
		Scanner s = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = s.nextInt();
			
			if(selectNo == 1) {
				
				System.out.print("학생수> " );
				studenNum = s.nextInt();
				
				scores = new int[studenNum];
				
				
			}else if(selectNo == 2) {
				
				for(i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]:");
					studenNum = s.nextInt();
					scores[i]= studenNum;
					System.out.println("입력된 점수: "+scores[i]);
					
				}
				
			}else if(selectNo == 3) {
				for(i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]:"+scores[i]);
				}
			}else if(selectNo == 4) {
				int high = 0;
				int sum = 0;
				for(i=0; i<scores.length; i++) {
					if(high<scores[i]) {
						high=scores[i];
					}
					sum+=scores[i];
				}
				System.out.println("최고 점수: "+high);
				System.out.println("평균 점수: "+((double)sum)/scores.length);
				
			
				
			}else if(selectNo == 5) {
				
				run = false;
				
			}
		

		}
		
		System.out.println("프로그램 종료");

	}

}
