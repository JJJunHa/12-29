
public class Study13 {

	public static void main(String[] args) {
		String str = "Good Morning Vietnam";
		String str1 = "Good Morning Vietnam";
		String newStr = "";
		String sum = "";
		String []total = new String[str.length()];
		int i=0;
		int j=0;
		
		
//		String str1 = str.substring(5,8);
//		System.out.println(str1);
//		System.out.println(str1.length());
		System.out.println(str.length());
		for(i = str.length()-1, j =str.length(); j>0; i--,j--) {
			sum +=str.substring(i,j);
			total[i]=str.substring(i,j);
//			System.out.print(str.substring(i,j));
			System.out.print(total[j-1]);
		}
		
		for(i=0; i<str.length(); i++) {
			str1=str.substring(i,i+1)+str1;
		}
        
//        for(int i1=0; i1<str.length(); i1++) {
//           newStr = str1.substring(i1,i1+1) + newStr;
//           
//           System.out.println(newStr);
//        }
//		System.out.println("----------------------------------------------");
//		String[] arWord = str.split(" "); // ["Good", "Morning", "Vietnam"]
//		
//		System.out.println(arWord.length);
//		for(int i = 0; i<arWord.length; i++) {
//			System.out.println(arWord[i]);
//			
//		}
		
//		System.out.println("---------------------------------------------");
//		String str7 = "John,Jane,James,Jason,Jacob,Johanson,Jefferson";
//		String[] name = str7.split(",");
//		System.out.println(name.length);
//		for(int i = 0; i<name.length; i++) {
//			System.out.println(name[i]);
			
		}

	}


