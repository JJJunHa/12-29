
public class junglul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {10,5,1,0,3,7,9,50};
//		System.out.println(x[3]);
		int i = 0;
		int j = 0;
		int temp = 0 ;
		for(i=0; i<x.length; i++) {
			for(j=0; j<x.length; j++) {
				if(x[i]<x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;	
				}
			}
		}
			for(i = 0; i<x.length; i++) {
				System.out.print(x[i]+" ");
			}
			
		}
	}


