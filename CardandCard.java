
public class CardandCard {

	public static void main(String[] args) {
		
String[] cards1= {"i","ble"};
////	
String[] cards2= {"want"};
////	
String[] goal={"i", "want","ble"};
String answer = "No";



int cardsNum = 0;
int cards2Num = 0;
int i=0;
        for(i=0; i<goal.length;i++) {
        	
        	

        		if(cardsNum<cards1.length) {
        		if(goal[i].equals(cards1[cardsNum])) {
        			cardsNum++;
        		}
        		}
        		if(cards2Num<cards2.length) {
        		if(goal[i].equals(cards2[cards2Num])) {
        			cards2Num++;
        		}
        	}
        	
        		
        }
		if(cardsNum==cards1.length&&cards2Num==cards2.length) {
			answer = "Yes";
		}
		
		
        
        
        
        
        
        
//        for(int i = 0; i < cards1.length; i++) {
//            cards11 += cards1[i] + "?";
//        }
//        for(int i = 0; i < cards2.length; i++) {
//            cards22 += cards2[i] + "?";
//        }
//
//        for(int i = 0; i < goal.length; i++) {
//            goal[i] = goal[i] + "?";
//
//            cards11 = cards11.replace(goal[i], " " + (i + 1));
//            cards22 = cards22.replace(goal[i], " " + (i + 1));
//        }
//        cards11 = cards11.replace(" ", "");
//        cards22 = cards22.replace(" ", "");
//
//        int length = cards11.length();
//        int length2 = cards22.length();
//        int check1 = 0;
//        int check2 = 0;
//        int first = 0;
//        int seconed = 0;
//
//        try {
//            check1 = Integer.parseInt(cards11);
//            check2 = Integer.parseInt(cards22);
//        } catch(NumberFormatException e) {
//            // 문자열을 정수로 변환할 수 없는 경우
//            answer = "No";
//           
//        }
//
//        int num = check1;
//        int num2 = check2;
//        int steck = 25;
//        int steck2 = 25;
//        int[] digits = new int[length];
//        int[] digits2 = new int[length2];
//        for(int i = 0; i < length; i++) {
//            digits[i] = num % 10;
//            num /= 10;
//
//            if(digits[i] - steck < 0) {
//                first++;
//            }
//            steck = digits[i];
//        }
//
//        for(int i = 0; i < length2; i++) {
//            digits2[i] = num2 % 10;
//            num2 /= 10;
//
//            if(digits2[i] - steck2 < 0) {
//                seconed++;
//            }
//            steck2 = digits2[i];
//        }
//
//        if(first == length && seconed == length2) {
//            answer = "Yes";
//        }
		
		
		
		
//		String answer = "No";
////		String[] cards1= {"i", "water", "drink"};
////		
////		String[] cards2= {"want", "to"};
//		
//		String[] cards1= { "want" ,"drink", "to"};
//		
//		String[] cards2= { "i"};
//		
//		String[] goal={"drink","i","want", "to"};
////		String[] cards1= {"i", "drink", "water"};
////		
////		String[] cards2= {"want", "to"};
////		
////		String[] goal={"i", "want", "to", "drink", "water"};
//		              //1     2       3     4         5
//		String cards11="";
//		String cards22="";
//		for(int i=0; i<cards1.length; i++) {
//			cards11+=cards1[i]+"?";
//		}
//		for(int i=0; i<cards2.length; i++) {
//			cards22+=cards2[i]+"?";
//		}
////		System.out.println(cards11);
////		System.out.println(cards22);
//		for(int i=0; i<goal.length; i++) {
//			goal[i]=goal[i]+"?";
////			System.out.println(goal[i]);
//			cards11=cards11.replace(goal[i]," "+(i+1));
//			cards22=cards22.replace(goal[i]," "+(i+1));
//			
////			System.out.print(goal[i]);
//		}
//		cards11=cards11.replace(" ","");
//		cards22=cards22.replace(" ","");
//		
//		
//		int length=cards11.length();
//		int length2=cards11.length();
//        int check1=Integer.parseInt(cards11);
//        
//        int check2=Integer.parseInt(cards22);
//        int first=0;
//        int seconed=0;
//		System.out.println("--------------");
//		System.out.println(check1);
////		System.out.println(check2);
//		int num=check1;
//		int num2=check2;
//		int steck=25;
//		int steck2=25;
//		int[] digits = new int[length];
//		int[] digits2 = new int[length];
//		for(int i = 0; i < length; i++) {
//			System.out.println("num   "+num);
//		    digits[i] = num % 10;
//		    num /= 10;
//		    System.out.println(steck+" steck");
//		    System.out.println(digits[i]+" first");
//		    System.out.println("---------");
//		    if(digits[i]-steck<0) {
//		    	first++;
//		    	System.out.println(first+" first ++ num");
//		    	System.out.println(length+" first ++ length");
//		    }
//		    steck=digits[i];
//		}
//		System.out.println("-----------------------------------------------------");
//		for(int i = 0; i < length2; i++) {
//		    digits2[i] = num2 % 10;
//		    num2 /= 10;
//		    System.out.println(steck2+" steck2");
//		    System.out.println(digits2[i]+" seconed");
//		    System.out.println("---------");
//		    if(digits2[i]-steck2<0) {
//		    	seconed++;
//		    	System.out.println(seconed+" seconed ++ num");
//		    	System.out.println(length2+" seconed ++ length");
//		    }
//		    steck2=digits2[i];
//		}
////		System.out.println(first);
//		if(first==length&&seconed==length2) {
//			answer="yes";
//		}
//		System.out.println("answer is  "+answer);
//		
////		for(int i=0;i<length;i++) {
////			
////		}
//		
		
		
        

	}

}
