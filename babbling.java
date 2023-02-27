
public class babbling {

	public static void main(String[] args) {
		String[] babbling= {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		String[] pronunciation= {"aya", "ye", "woo", "ma"};
		int answer = 0;
		int flag=0;
		
		int i=0;
		while(i<babbling.length) {

				while(true) {
				if(babbling[i].matches("^aya.*")) {
						babbling[i]=babbling[i].substring(3);
						flag=0;
					}
				
				else if(babbling[i].matches("^ye.*")) {

						babbling[i]=babbling[i].substring(2);
						flag=0;
					}
				else if(babbling[i].matches("^woo.*")) {
					
						babbling[i]=babbling[i].substring(3);
						flag=0;
					
				}else if(babbling[i].matches("^ma.*")) {
					
						babbling[i]=babbling[i].substring(2);
						flag=0;
					}
				
				}

		}
			
		
		for(String x:babbling) {
			System.out.println(x);
		}

		
		
				

	}

}
