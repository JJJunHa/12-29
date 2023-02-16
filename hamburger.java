import java.util.ArrayList;
import java.util.Arrays;

public class hamburger {

	public static void main(String[] args) {
		int answer=0;
		int[]ingredient= {1,1,2,3,1,1,2,3,1};
		System.out.println(ingredient.length);
		int i=0;
		int check=0;
//		if(ingredient.length==4) {
//			if(ingredient[i]==1&&ingredient[i+1]==2&&ingredient[i+2]==3&&ingredient[i+3]==1) {
//				answer++;
//			}
//		}
		while(i<ingredient.length) {
			System.out.println(i);
			System.out.print(ingredient[i]);
			System.out.print(ingredient[i+1]);
			System.out.print(ingredient[i+2]);
			System.out.print(ingredient[i+3]);
			System.out.println("--------");
			if(ingredient[i]==1&&ingredient[i+1]==2&&ingredient[i+2]==3&&ingredient[i+3]==1) {
				answer++;
				if((i-1)>=0) {
					ingredient[i+3]=ingredient[i-1];
					check=1;
				}
				if((i-2)>=0) {
					check=2;
					ingredient[i+2]=ingredient[i-2];
				}
				if((i-3)>=0) {
					ingredient[i+1]=ingredient[i-3];
				}
				if((i-4)>=0) {
					check=3;
					ingredient[i]=ingredient[i-4];
				}
				if(check==1) {
					i=i+2;
				}
				else if(check==2) {
					i=i+1;
				}
				else if(check==3) {
					i=i-1;
				}
			}
			i++;
			
		}
		
		
		
		
		
		
		
		
//		int bread=0; -------------어레이 리스트 정답
//		int vegetables=0;
//		int meat=0;
//		int bread2=0;
//		int steck=0;
//		int store=0;
//		int[]ingredient= {2, 1, 1, 2, 3, 1, 2, 3, 1};
//		String sivar=Arrays.toString(ingredient);
//		System.out.println(sivar);
//		sivar.contains("1, 2, 3, 1");
//		String notthing="";
//		int i=0;
//		int j=0;
//		ArrayList<Integer> m =new ArrayList<Integer>();
//		if(sivar.contains("1, 2, 3, 1")) {
//		for(j=0; j<ingredient.length; j++) {
//			m.add(ingredient[j]);
//			notthing = m.toString();
//			if(notthing.contains("1, 2, 3, 1")) {
//				answer++;
//				if(i>=0) {
//				m.remove(i);
//				}
//				if(i-1>=0) {
//				m.remove(i-1);
//				}
//				if(i-2>=0) {
//				m.remove(i-2);
//				}
//				if(i-3>=0) {
//				m.remove(i-3);
//				i=i-4;
//				}
//			}
//			i++;
//		}
//		}
		
		
		
		
		
//		for(i=0; i<ingredient.length; i++) {
//			if(i+4<ingredient.length) {
//			if(ingredient[i]==1&&ingredient[i+1]==2&&ingredient[i+2]==3&&ingredient[i+3]==1) {
//				i=i+4;
//				answer++;
//			 }
//			}
//			m.add(ingredient[i]);
//		}
//		for(i=0; i<m.size()-3;i++) {
//			if(m.get(i)==1&&m.get(i+1)==2&&m.get(i+2)==3&&m.get(i+3)==1) {
//				answer++;
//				m.remove(i);
//				m.remove(i);
//				m.remove(i);
//				m.remove(i);
//				
//			}
//		}
//		if(ingredient.length==4) {
//			
//			if(ingredient[i]==1&&ingredient[i+1]==2&&ingredient[i+2]==3&&ingredient[i+3]==1) {
//				answer++;
//			}
//		}
//		while(i<ingredient.length-3) {
//			
//			if(ingredient[i]==1&&ingredient[i+1]==2&&ingredient[i+2]==3&&ingredient[i+3]==1) {
//				answer++;
//				if((i-1)>=0) {
//					ingredient[i+3]=ingredient[i-1];
//				}
//				if((i-2)>=0) {
//					ingredient[i+2]=ingredient[i-2];
//				}
//				if((i-3)>=0) {
//					ingredient[i+1]=ingredient[i-3];
//				}
//				if((i-4)>=0) {
//					ingredient[i]=ingredient[i-4];
//				}
//			}
//			i++;
//			
//		}
//        for(int i = 0; i < ingredient.length - 3; i++) {
//            if(ingredient[i] == 1 && ingredient[i+1] == 2 && ingredient[i+2] == 3 && ingredient[i+3] == 1) {
//                answer++;
//                i =i-i-1; 
//            }
//        }
		
//        int i=0;
//		ArrayList<Integer> m =new ArrayList<Integer>();
//		for(int x:ingredient) {
//		m.add(x);
//		if(m.size()==i) {
//		if(m.get(i)==1&&m.get(i+1)==2&&m.get(i+2)==3&&m.get(i+3)==1) {
//			answer++;
//			m.remove(i);
//			m.remove(i);
//			m.remove(i);
//			m.remove(i);
//			i=i-i-1;
//			System.out.println("hi");
//			}
//		}
//		i++;
//		}
		
//		for(i=0; i<m.size()-3;i++) {
//			if(m.get(i)==1&&m.get(i+1)==2&&m.get(i+2)==3&&m.get(i+3)==1) {
//				answer++;
//				m.remove(i);
//				m.remove(i);
//				m.remove(i);
//				m.remove(i);
//				i=i-i-1;
//			}
//		}
        
		
//		for(i=0; i<m.size()-3;i++) {
//			if(m.get(i)==1&&m.get(i+1)==2&&m.get(i+2)==3&&m.get(i+3)==1) {
//				answer++;
//				m.remove(i);
//				m.remove(i);
//				m.remove(i);
//				m.remove(i);
//				i=i-i-1;
//			}
//		}
		
		
		
		
//		for(int x:ingredient) {
//			m.add(x);
//			}
//			m.add(null);
//			for(i=0; i<m.size()-3;i++) {
//				if(m.get(i)==1&&m.get(i+1)==2&&m.get(i+2)==3&&m.get(i+3)==1) {
//					answer++;
//					m.remove(i);
//					m.remove(i);
//					m.remove(i);
//					m.remove(i);
//					i=i-i-1;
//				}
//			}
		
		
//		System.out.println(ingredient.length);
//		while(i<ingredient.length-3) {
//			if(ingredient[i]==1&&ingredient[i+1]==2&&ingredient[i+2]==3&&ingredient[i+3]==1) {
//				answer++;
//				if((i-1)>=0) {
//					ingredient[i+2]=ingredient[i-1];
//				}
//				else if((i-2)>=0) {
//					ingredient[i+1]=ingredient[i-2];
//				}
//				else if((i-3)>=0) {
//					ingredient[i]=ingredient[i-3];
//				}
//				else if((i-4)>=0) {
//					ingredient[i-1]=ingredient[i-4];
//				}
//				else{
//					System.out.println("check");
//					answer++;
//					break;
//				}
//				i--;
//			}
//			i++;
//			
//		}
		
		
		
		
//		for(int x:ingredient) {
//			notthing+=String.valueOf(x);
//			if(bread&&vegetables&&meat&&bread2) {
//				answer++;
//			}
//			i++;
//		}
		
		
		
		
//		for(j=0; j<=notthing.length()-4; j++) {
//			if(notthing.substring(j,j+4).equals("1231")) {
//				notthing=notthing.substring(0,j)+notthing.substring(j+4);
//				System.out.println(notthing);
//				answer++;
//				j=0;
//			}
//		}
//		System.out.println(answer);
//		
//		String notthing2=notthing;
//		while(notthing2.contains("1231")) {
//		notthing=notthing.replace("1231", "7");
//		System.out.println(notthing);
//		for(i=0; i<notthing.length();i++) {
//			if(notthing.substring(i,i+1).matches("7")) {
//				answer++;
//				}
//		}
//		notthing2=notthing2.replace("1231", "");
//		System.out.println(notthing2);
//		notthing=notthing2.replace("1231", "7");
//		
////		System.out.println(notthing2);
//		}
		System.out.println("ANSWER="+answer);
		
		//----------------------------------------------
//		if(notthing.contains("1231")) {
//			answer++;
//			String[]cut=notthing.split("1231");
//			while((cut[0]+cut[1]).contains("1231")){
//				
//			}
//			
//			cut=(cut[0]+cut[1]).split("1231");
//			System.out.println(cut[0]);
//		}
		
//		String test="1231";
//		String test4="1123112311231";
//		String test1[]=test4.split(test);
//		String test2=test4.substring(test4.length()-4,test4.length());
//		System.out.println(test2);
//			if(test2.equals("1231")) {
//				answer++;
//			}
//			if(test.equals(test4)) {
//				answer++;
//			}
//			System.out.println(test1.length);
//		answer=answer+test1.length;
//		answer--;
//		System.out.println(answer);
//		for(String x:test1) {
////			System.out.println(x);
//		}

	}

}
