package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		
		int i = 0;
		do {
			System.out.println("1.them ");
			System.out.println("2.sua");
			System.out.println("3.xoa");
			System.out.println("4.menu");
			System.out.println("5.thoat");
			System.out.print("moi ban lua chon");
			int nhap = scanner.nextInt();
			scanner.nextLine();

			switch (nhap) {
			case 1:

				System.out.println("mời nhập  món ăn [" + i + "]");

				list.add(scanner.nextLine());
				System.out.println("mời nhập giá[" + i + "]");

				list1.add(scanner.nextInt());
				i++;
				break;

			case 2:
				System.out.println("mời nhập món cần sửa giá : ");
				int sua = scanner.nextInt();
				scanner.nextLine();

				System.out.println("giá sửa lại : ");
				Integer update = scanner.nextInt();
				list1.set(sua, update);
				break;
			case 3:

				System.out.print(" xóa món ăn : ");
				int xoa = Integer.parseInt(scanner.nextLine());
				list.remove(xoa);
				list1.remove(xoa);
				break;
			case 4:
				System.out.println("menu : ");
				for (int j = 0; j < list.size(); j++) {
					System.out.println(" món :" +j+"."+ list.get(j)+"--" +" giá:"+ list1.get(j));
				
				}
				
				break;
			case 5:
				i = -1;
				break;
			}

		}
		while (i > 0);

		
	}
	}

