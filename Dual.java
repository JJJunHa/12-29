//별 찍기
import java.util.Scanner;

public class Dual {

	public static void main(String[] args) {
		//Scanner s2 = new Scanner(System.in);
		//int a = s2.nextInt();
//		int a=1;
//		while(a<10) {
//			System.out.println(a);
//			int b=1;
//			
//			while(b<10) {
//				b++;
//			}
//			
//			a++;
//			
//		}
		// 정수값을 읽어들인다.
		// "*"를 정수값 갯수만큼 출력한다.(syso)
		
		Scanner s = new Scanner(System.in);
//		int z = s.nextInt();
//
//		int x = 1;
//		while(x<=z) {
//			
//			int y = 1;
//			while(y<=x){
//				
//			System.out.print("*");
//			y++;
//		}
//		System.out.println("");
//		x++;
//		}
//
//	}
//}

int inc = 1;
int  asnum2 = s.nextInt();

while(inc<=asnum2) {
   
   int dec = inc;
   
   while(dec>0) {
      System.out.print("*");
      dec--;
   }
   
   inc++;
   System.out.println("");
   
}
	}
}

