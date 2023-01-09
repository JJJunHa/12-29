import java.util.ArrayList;

public class Sales {
	ArrayList<String> alMobile;
	ArrayList<String> alName;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alSum;
	Order ored;
	
	public Sales(Order order) {
		this.alMobile=new ArrayList<String>();
		this.alName=new ArrayList<String>();
		this.alCount=new ArrayList<Integer>();
		this.alSum=new ArrayList<Integer>();
		this.ored=order;
	}
	public void build(String mobile) {
		for(int i=0; i<ored.getNameSize(); i++) {
			this.alName.add(ored.getName(i));
			this.alCount.add(ored.getalCount(i));
			this.alSum.add(ored.getalSum(i));
			this.alMobile.add(mobile);
			System.out.println("�ֹ��̸��� "+this.alName.get(i));
			System.out.println("��Ű�Ű� : "+ored.getMenuName(i));
			System.out.println("������ "+this.alCount.get(i));
			System.out.println("������ "+this.alSum.get(i));
			System.out.println("������ȣ "+this.alMobile.get(i));
			System.out.println("-----------------------");
		}
	}
	public void getTotal() {
		int total=0;
		for(int sum : this.alSum) {
			total=total+sum;
		}
		System.out.println("�Ѹ����:"+total+"��");
		
	}

}
