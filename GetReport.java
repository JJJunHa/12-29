import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class GetReport {

	public static void main(String[] args) {
//		String[] id_list= {"muzi", "frodo", "apeach", "neo"};
//		String[] report= {"muzi frodo","muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
//		int k=2;
		String[] id_list= {"con", "ryan"};
		String[] report= {"ryan con", "ryan con", "ryan con", "ryan con"};
		int k=3;
		
		
//		String[] id_list= {"con", "ryan"};
//		int[] answer = {0,0};
		
		//정지 당한 사람 프로도, 네오
		//우선 리포트에 중복해서 신고한게 아닌 신고당하는 사람의 이름을 찾아야한다/
		
		//HashSet으로 중복제거
		ArrayList<String> m =new ArrayList<String>();
		int[] report_list=new int[id_list.length];
		HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(report));
		String[] reportCopy=uniqueWords.toArray(new String[0]);
		for(String x:reportCopy) {
			for(int i=0; i<id_list.length; i++) {
				String str[]=x.split(" ");
				if(str[1].equals(id_list[i])) {
					report_list[i]=report_list[i]+1;
				}
			}
		}
		int i=0;
		for(int x:report_list) {
			if(x>=k) {
				m.add(id_list[i]);
			}
			i++;
		}
		String [] report_id=new String[m.size()];
		for(int j=0; j<m.size(); j++) {
			report_id[j]=m.get(j);
		}
		int[] answer = new int[id_list.length];
		
	for(int j=0; j<reportCopy.length; j++) {
		  for(int z=0; z<report_id.length; z++) {
			  if(reportCopy[j].contains(" "+report_id[z])) {
				  reportCopy[j]=reportCopy[j].replace(" "+report_id[z], "");
			  }
		  }
		  int h=0;
		  for(String x:id_list) {
			  if(x.equals(reportCopy[j])) {
				  answer[h]=answer[h]+1;
			  }
			  h++;
			  
		  }
	  }
	  
	  System.out.println(Arrays.toString(answer));
		
		
		//for문으로 중복제거
//		int reportLength=report.length;
//		for(int i=0; i<reportLength; i++) {
//			for(int j=i+1; j<reportLength; j++ ) {
//				if(report[i]==report[j]) {
//					report[j]=report[reportLength-1];
//					reportLength--;
//				}
//			}
//		}
//		String[]reportCopy=Arrays.copyOf(report, reportLength);
	//----------------------------	
		
		
//		for(String x:reportCopy) {
//			for(int i=0; i<id_list.length; i++) {
//				if(x.split(" ").equals(id_list[i])) {
//					
//				}
//			}
//		}
		
		
		
//		for(String x:report) {
//			
//		}
//		
//		
//		
//		for(String x: id_list) {
//			
//		}
//		
//		int[] arr = {1, 2, 3, 3, 4, 4, 3,};
//		int length = arr.length;
//		for (int i = 0; i < length; i++) {
//		    for (int j = i + 1; j < length; j++) {
//		    	System.out.println("index "+i+"----"+j);
//		    	System.out.println(arr[i]+"--"+ arr[j]);
//		        if (arr[i] == arr[j]) {
//		            arr[j] = arr[length-1];
//		            length--;
//		            
//		        }
//		        System.out.println(j+" length "+length);
//		    }
//		}
//		for(int x:arr) {
//			System.out.print(x);
//		}
//		System.out.println("---------------");
//		int[] result = Arrays.copyOf(arr, length);
//		for(int x:result) {
//			System.out.print(x);
//		}
		
		
		
	}

}
