
public class Exercise08 {

	public static void main(String[] args) {
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double ag = 0;
		
		
		int i = 0 ;
		int j = 0;
		int div = 0;
		for(i=0; i<array.length; i++) {
			for(j=0; j<array[i].length; j++) {
				sum += array[i][j];
				System.out.println(array[i].length);
				
			}
			div += (array[i].length);
			
		}
		System.out.println("배열에 총합은 " + sum);
		System.out.println("총합에 평군은 " + ((double)sum/div));

	}

}
