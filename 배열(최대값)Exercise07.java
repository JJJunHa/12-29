
public class Exercise07 {

	public static void main(String[] args) {
		int max =0;
		int[] array = { 1, 9, 3, 8,};
		
		for(int i = 0; i<array.length; i++) {
			
			if(max<array[i]) {
				max = array[i]; 
			}
		}
		
		System.out.println("ÃÖ´ë°ªÀº " + max);
		

	}

}
