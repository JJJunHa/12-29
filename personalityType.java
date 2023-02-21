
public class personalityType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] survey= {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices= {5, 3, 2, 7, 5};
		String answer = "RTCFJMAN";
		int r=0;
		int t=0;
		int c=0;
		int f=0;
		int j=0;
		int m=0;
		int a=0;
		int n=0;
		//"RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA"
		int i=0;
		

		for(String x:survey) {
			if(x.equals("RT")) {
				if(choices[i]-4>0) {
					t=t+choices[i]-4;
				}
				if(choices[i]-4<0) {
					r=r+(choices[i]-4)/-1;
				}
			}if(x.equals("TR")) {
				if(choices[i]-4>0) {
					r=r+choices[i]-4;
				}
				if(choices[i]-4<0) {
					t=t+(choices[i]-4)/-1;
				}
				
			}if(x.equals("FC")) {
				if(choices[i]-4>0) {
					c=c+choices[i]-4;
				}
				if(choices[i]-4<0) {
					f=f+(choices[i]-4)/-1;
				}
			}if(x.equals("CF")) {
				if(choices[i]-4>0) {
					f=f+choices[i]-4;
				}
				if(choices[i]-4<0) {
					c=c+(choices[i]-4)/-1;
				}
			}if(x.equals("MJ")) {
				if(choices[i]-4>0) {
					j=j+choices[i]-4;
				}
				if(choices[i]-4<0) {
					m=m+(choices[i]-4)/-1;
				}
			}if(x.equals("JM")) {
				if(choices[i]-4>0) {
					m=m+choices[i]-4;
				}
				if(choices[i]-4<0) {
					j=j+(choices[i]-4)/-1;
				}
			}if(x.equals("AN")) {
				if(choices[i]-4>0) {
					n=n+choices[i]-4;
				}
				if(choices[i]-4<0) {
					a=a+(choices[i]-4)/-1;
				}
			}if(x.equals("NA")) {
				if(choices[i]-4>0) {
					a=a+choices[i]-4;
				}
				if(choices[i]-4<0) {
					n=n+(choices[i]-4)/-1;
				}
			}
//			System.out.println("a==="+a);
			
			i++;
		}
//		RTCFJMAN
//		System.out.println(r);
//		System.out.println(t);
//		System.out.println(c);
//		System.out.println(f);
//		System.out.println(j);
//		System.out.println(m);
//		System.out.println(a);
//		System.out.println(n);
		String rR=r+"r";
		String tT=t+"t";
		String cC=c+"c";
		String fF=f+"f";
		String jJ=j+"j";
		String mM=m+"m";
		String aA=a+"a";
		String nN=n+"n";
		
		
		
		System.out.println(aA);
		System.out.println(nN);
		System.out.println("a".compareTo("n"));
//		System.out.println("c0".compareTo("f0"));
//		System.out.println("j0".compareTo("m0"));
//		System.out.println("a0".compareTo("n0"));
		
		if(rR.compareTo(tT)<0) {
			answer=answer.replace("T","");
		}else {
			answer=answer.replace("R","");
		}
		if(cC.compareTo(fF)<0) {
			answer=answer.replace("F","");
		}else {
			answer=answer.replace("C","");
		}
		if(jJ.compareTo(mM)<0) {
			answer=answer.replace("M","");
		}else {
			answer=answer.replace("J","");
		}
		if(aA.compareTo(nN)<0) {
			answer=answer.replace("N","");
		}else {
			answer=answer.replace("A","");
		}
		System.out.println(answer);
		
		
		//5-4
		
		
	}

}
