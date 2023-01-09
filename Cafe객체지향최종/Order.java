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
	void build() { //강사님이 해주신거
		this.m.display();
		System.out.println("주문명을 입력하시오");
		String ordername=m.s.nextLine();
		System.out.println("메뉴번호를 입력하시오 [-1:종료]:");
		int m_num = this.m.s1.nextInt();
		while(m_num!=-1) {
			System.out.println("수량을 입력하시오 [-1:종료]:");
			int qty = this.m.s1.nextInt();
			int price = m.getPrice(m_num);
			String menuname = m.getMenuName(m_num);
			this.append2(ordername, qty, price,menuname);
			this.m.display();
			System.out.println("메뉴번호를 입력하시오 [-1:종료]:");
			m_num = this.m.s1.nextInt();
		}
	}
	void append2(String name, int qty, int net, String menuname) {//강사님이 해주신거
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
		System.out.println("나갈려면"+-1+"을 입력하시오");
		System.out.println("지울 주문의 이를을 입력하시오");
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
					System.out.println("지울 주문이 없습니다.");
					break;
				}
				printl();
				System.out.println("나갈려면"+-1+"을 입력하시오");
				System.out.println("지울 주문의 이를을 입력하시오");
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
			System.out.println("주문이름은 "+this.alName.get(i));
			System.out.println("시키신것 : "+this.alMenuNamee.get(i));
			System.out.println("수량은 "+this.alCount.get(i));
			System.out.println("총합은 "+this.alSum.get(i));
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
