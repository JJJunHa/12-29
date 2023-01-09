import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	private ArrayList<String>alName; 
	private ArrayList<Integer>alCount; 
	private ArrayList<Integer>alSum;
	private ArrayList<String>alMenuNamee;
	Menu m;
	
	public Order(Menu menu) {
		this.alName = new ArrayList<String>();
		this.alCount = new ArrayList<Integer>();
		this.alSum = new ArrayList<Integer>();
		this.alMenuNamee = new ArrayList<String>();
		this.m = menu;
	}	
	void build() { //������� ���ֽŰ�
		this.m.display();
		System.out.println("�ֹ����� �Է��Ͻÿ�");
		String ordername=m.s.nextLine();
		System.out.println("�޴���ȣ�� �Է��Ͻÿ� [-1:����]:");
		int m_num = this.m.s1.nextInt();
		while(m_num!=-1) {
			System.out.println("������ �Է��Ͻÿ� [-1:����]:");
			int qty = this.m.s1.nextInt();
			int price = m.getPrice(m_num);
			String menuname = m.getMenuName(m_num);
			this.append2(ordername, qty, price,menuname);
			this.m.display();
			System.out.println("�޴���ȣ�� �Է��Ͻÿ� [-1:����]:");
			m_num = this.m.s1.nextInt();
		}
	}
	void append2(String name, int qty, int net, String menuname) {//������� ���ֽŰ�
		this.alName.add(name);
		this.alCount.add(qty);
		this.alSum.add(qty*net);
		this.alMenuNamee.add( menuname);
	}
	void display() {
		printl();
	}
	void deletelogic() {
		printl();
		System.out.println("��������"+-1+"�� �Է��Ͻÿ�");
		System.out.println("���� �ֹ��� �̸��� �Է��Ͻÿ�");
		System.out.println("-----------------------");
		String ndxname=m.s.nextLine();
		int d;
			for(d=0; d<this.alName.size(); d++) {
				if(this.alName.get(d).equals(ndxname)) {
					break;
				}
			}
			while(!ndxname.equals("-1")) {
				this.delete(d);
				if(this.alName.size()==0) {
					System.out.println("���� �ֹ��� �����ϴ�.");
					break;
				}
				printl();
				System.out.println("��������"+-1+"�� �Է��Ͻÿ�");
				System.out.println("���� �ֹ��� �̸��� �Է��Ͻÿ�");
				System.out.println("-----------------------");
				ndxname=m.s.nextLine();
				for(d=0; d<this.alName.size(); d++) {
					if(this.alName.get(d).equals(ndxname)) {
							break;
					}
				}
			}
	}
	void delete(int order_num) {
		this.alName.remove(order_num);
		this.alCount.remove(order_num);
		this.alSum.remove(order_num);
	}
	void printl() {
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println("�ֹ��̸��� "+this.alName.get(i));
			System.out.println("��Ű�Ű� : "+this.alMenuNamee.get(i));
			System.out.println("������ "+this.alCount.get(i));
			System.out.println("������ "+this.alSum.get(i));
			System.out.println("-----------------------");
		}
	}
	String getName(int i) {
		return this.alName.get(i);
	}
	int getalCount(int i) {
		return this.alCount.get(i);
	}
	int getalSum(int i) {
		return this.alSum.get(i);
	}
	int getNameSize() {
		return this.alName.size();
	}
	String getMenuName(int i) {
		return this.alMenuNamee.get(i);
	}
}
