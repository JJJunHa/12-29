import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	private ArrayList<String> alMenu;
	private ArrayList<Integer> alPrice;
	Scanner s, s1;
	
	public Menu() {
		this.alMenu = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		this.s = new Scanner(System.in);
		this.s1 = new Scanner(System.in);
		
		try {////���� ����
			Scanner fs=new Scanner(new File("d:\\cafe\\menu.txt"));
			while(fs.hasNext()) {
				String str=fs.next();
				
				String[] menuitem=str.split(",");
				this.alMenu.add(menuitem[0]);
				this.alPrice.add(Integer.parseInt(menuitem[1]));
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}////���� ����
	}
	void build() {
		menunameprint();
		String name = this.s.nextLine();
			while(!name.equals("-1")) {
				menupriceprint();
				int price = this.s1.nextInt();
				if(price==-1)break;
				this.append(name, price);
				menunameprint();
				name = this.s.nextLine();
				}
	}
	void modify() {
		mmm();
		menurevicenum();
		int ndx = s1.nextInt();
			while(ndx!=-1) {
			menunameprint();
			String name = this.s.nextLine();
			if(name.equals("-1"))break;
			menupriceprint();
			int price = this.s1.nextInt();
			if(price==-1)break;
			this.update(name, price, ndx);
			mmm();
			menurevicenum();
			ndx = this.s1.nextInt();
			}
	}
	void remove() {
		mmm();
		removenum();
		int ndx = this.s1.nextInt();
			while(ndx!=-1) {
			this.deleteupdate(ndx);
			mmm();
			removenum();
			ndx = this.s1.nextInt();
			}
	}
	void append(String name, int price) {
		//System.out.println("�޴��߰�");
		this.alMenu.add(name);
		//System.out.println("�����߰�");
		this.alPrice.add(price);
		System.out.println(name+"�� "+price+"�� �Դϴ�. ");	
	}
	void display() {
		mmm();
	}
	int getMenuSize() {
		return this.alMenu.size();
	}
	String getMenuName(int i) {
		return this.alMenu.get(i);
	}
	int getPrice(int i) {
		return this.alPrice.get(i);
	}
	void save() {
		try {
			FileWriter fw = new FileWriter(new File("d:\\cafe\\menu.txt"));
			for(int i=0; i<this.alMenu.size();i++) {
				String str = this.alMenu.get(i)+","+this.alPrice.get(i)+"\n";
				fw.write(str);
			}
			fw.close();
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	void update(String newName, int newPrice, int indexNum) {
		this.alMenu.set(indexNum, newName);
		this.alPrice.set(indexNum, newPrice);
	}
	void deleteupdate(int indexNum) {
		this.alMenu.remove(indexNum);
		this.alPrice.remove(indexNum);
	}
	void menunameprint() {
		System.out.println("�ڷ�: -1");
		System.out.println("�޴����� �Է��Ͻÿ�: ");
		System.out.println("----------------");
	}
	void menupriceprint() {
		System.out.println("�ڷ�: -1");
		System.out.println("������ �Է��Ͻÿ�: ");
		System.out.println("---------------");
	}
	void menurevicenum() {
		System.out.println("�ڷ�: -1");
		System.out.println("������ �޴���ȣ�� �Է��Ͻÿ�:");
		System.out.println("----------------------");
	}
	void removenum() {
		System.out.println("�ڷ�: -1");
		System.out.println("������ �޴���ȣ�� �Է��Ͻÿ�:");
		System.out.println("---------------------");
	}
	void mmm() {
		for(int i=0; i<this.alMenu.size(); i++) {
			System.out.println((i)+" �� �޴� "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
			}
	}
}
