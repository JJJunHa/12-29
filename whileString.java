import java.util.ArrayList;
import java.util.Scanner;

public class whileString {

	public static void main(String[] args) {
		
		
		System.out.println("��ɾ �Է��Ͻÿ�");
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		
		String read = "";
		String madd = "";
		String maddr = "";
		int maddp = 0;
		int maddrp = 0;
		int maddn = 0;
		int maddd = 0;
		int i = 0;
		int ndx = 0;
		int sum = 0;
		ArrayList<String> alMenu = new ArrayList<String>();
		ArrayList<Integer>alPrice = new ArrayList<Integer>();
		ArrayList<String>alName = new ArrayList<String>();
		ArrayList<Integer>alCount = new ArrayList<Integer>();
		ArrayList<Integer>alSum = new ArrayList<Integer>();

		
		do {
			System.out.println("---------------------------------------------");
			System.out.println("m.�޴����� | o.�ֹ����� | s.������� | x.����");
			System.out.println("---------------------------------------------");
			read = s.nextLine();
			if(!(read.equals("x"))) {
				
				if(read.equals("m")){
					String mread = "";
					
					do {
						System.out.println("----------------------------------------------------");
						System.out.println("C.�޴��߰� | R.�޴���� ǥ�� | U.�޴����� | D.�޴����� | B.�ڷ�");
						System.out.println("----------------------------------------------------");
						
						mread=s.nextLine();
						
						if(mread.equals("C")) {
							System.out.println("�޴��߰�");
							System.out.println("B.�ڷ�");
							madd = s.nextLine();
								if(madd.equals("B")) {
									continue;
									}
							
								else {
									alMenu.add(madd);
									System.out.println("�����߰�");
									maddp = s1.nextInt();
									alPrice.add(maddp);
									System.out.println(madd+"�� "+maddp+"�� �Դϴ�. ");
								}
							
							
						}else if(mread.equals("R")) {
							
							if(alMenu.size()==0) {
								System.out.println("�޴� ����� �����ϴ�.");
								continue;
							}
							
							System.out.println("�޴���� ǥ��");
							
							for(i=0; i<alMenu.size(); i++) {
								System.out.println((i+1)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
							}
							
						}else if(mread.equals("U")) {
							
							if(alMenu.size()==0) {
								System.out.println("������ �޴��� �����ϴ�.");
								continue;
							}
							
							System.out.println("�޴� ����");
							
							for(i=0; i<alMenu.size(); i++) {
								System.out.println((i+1)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
							}
							
							System.out.println("���� �� �޴��� ��ȣ�� �Է��Ͻÿ�");
							maddn = s1.nextInt();
							System.out.println("������ �޴� ��ȣ "+maddn+"���� ���ο� �޴��� �Է��Ͻÿ�");
							maddr = s.nextLine();
							System.out.println(maddn+"��"+maddr);
							System.out.println(maddn+"���� ���ο� �޴��� "+maddr+"�� ������ �Է��Ͻÿ�");
							maddrp = s1.nextInt();
							alMenu.set(maddn-1, maddr);
							alPrice.set(maddn-1, maddrp);
							
								
						}else if(mread.equals("D")) {
							
							if(alMenu.size()==0) {
								System.out.println("������ �޴��� �����ϴ�.");
								continue;
							}
							
							System.out.println("�޴�����");
							
							for(i=0; i<alMenu.size(); i++) {
								System.out.println((i+1)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
							}
							
							System.out.println("������ �޴��� ��ȣ�� �Է��Ͻÿ�");
							maddd=s1.nextInt();
							alMenu.remove(maddd-1);
							alPrice.remove(maddd-1);
							
							
						}
					
					} while(!mread.equals("B"));
			   }
				
					if(read.equals("o")) {
						String read1="";
						do {
							System.out.println("�ֹ�����");
							System.out.println("----------------------------------");
							System.out.println("C.�ֹ��߰� | R.�ֹ�����ǥ�� | D.�ֹ�����| B.�ڷ�");
							System.out.println("----------------------------------");
							read1 = s.nextLine();
							
							if(read1.equals("C")) {
								for(i=0; i<alMenu.size(); i++) {
									System.out.println((i)+" �� �޴� "+alMenu.get(i)+" : "+alPrice.get(i));
								}
									ndx=0;
									String ordername="";
									String test = "";
									
									do {
										System.out.println("��������"+-1+"�� �Է��Ͻÿ�");
										System.out.println("�ֹ����� �Է��Ͻÿ�");
										ordername=s.nextLine();
										if(ordername.equals("-1"))break;
										System.out.println("�޴���ȣ�� �Է��Ͻÿ�");
										ndx=s1.nextInt();
										System.out.println("������ �Է��Ͻÿ�");
										int count = s1.nextInt();
										sum=count*alPrice.get(ndx);
										alName.add(ordername);
										alCount.add(count);
										alSum.add(sum);
										System.out.println("");
									}while(true);
								
							}else if(read1.equals("R")){
								for(i=0; i<alName.size(); i++) {
									System.out.println("�ֹ��̸��� "+alName.get(i));
									System.out.println("������ "+alCount.get(i));
									System.out.println("������ "+alSum.get(i));
									System.out.println("");
									
								}
								
								
							}else if(read1.equals("D")) {
								for(i=0; i<alName.size(); i++) {
									System.out.println("�ֹ��̸��� "+alName.get(i));
									System.out.println("������ "+alCount.get(i));
									System.out.println("������ "+alSum.get(i));
									System.out.println("");
									
								}
								System.out.println("���� �޴��� ��ȣ�� �Է��Ͻÿ�");
									ndx=s1.nextInt();
									while(ndx!=-1) {
									alName.remove(ndx);
									alCount.remove(ndx);
									alSum.remove(ndx);
									for(i=0; i<alName.size(); i++) {
										System.out.println("�ֹ���ȣ�� "+alName.get(i));
										System.out.println("������ "+alCount.get(i));
										System.out.println("������ "+alSum.get(i)+" ��");
										System.out.println("");
										}
									
									System.out.println("���� �޴��� ��ȣ�� �Է��Ͻÿ�");
									ndx=s1.nextInt();
									
								}
								
								
	
							}
								
							}while(!read1.equals("B"));
						
						}
			  
				
				if(read.equals("s")){
				System.out.println("�������");
			   }
				System.out.println("�޴��ٽ��Է�");
		    }
			else {
				break;
				}
		} while(!(read.equals("x")));
		System.out.println("���� �ý��� ����");
	
	}
}
