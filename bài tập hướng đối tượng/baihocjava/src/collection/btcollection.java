package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class btcollection {

	public static void main(String[] args) {
int i=0,j=0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println("1.them");
		System.out.println("2.xem menu");
		System.out.println("mời lựa chọn ");
		int nhap = scanner.nextInt();
		scanner.nextLine();
				switch(nhap)
		{ 
				case 1:
											nhap1(scanner, list,list1);
						
			 break;
			
			
		 
			
		 case 5:
				i = -1;
				break;
		
		}
	}

	public static void nhap1(Scanner scanner, ArrayList list,ArrayList list1) {
		int i = 0,j=0;
		do {
			
			System.out.println("mời nhập món ăn " + i );
			list.add(scanner.nextLine());
			System.out.println("mời nhập giá tiền  " + j );
			list1.add(scanner.nextInt());
			i++;
			j++;
			break;
			
	
		} while (i >0);

	}
	

	public static void xuat(ArrayList list,ArrayList list1) {
		System.out.print("Danh sách: ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("\n tên món ăn thứ:[" + i + "] " +list.get(i)+"  \n giá:  "+list1.get(i));
		}
		
		
	}
}
