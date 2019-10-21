package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ham {

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
               them(scanner,list,list1);
				break;

			case 2:
				sua(scanner,list1);
				break;
			case 3:
				 xoa(scanner,list,list1);
								break;
			case 4:
				xuat(list,list1);
				
				break;
			case 5:
				i = -1;
				break;
			}

		} while (i >= 0);

	}
	
	
	public static void them(Scanner scanner, ArrayList<String> list, ArrayList<Integer> list1)
	{
		System.out.println("mời nhập  món ăn :");

		list.add(scanner.nextLine());
		System.out.println("mời nhập giá:");

		list1.add(scanner.nextInt());
		
	
	}
	public static void sua (Scanner scanner, ArrayList<Integer> list1)
	{
		System.out.println("mời nhập món cần sửa giá : ");
		int sua = scanner.nextInt();
		scanner.nextLine();

		System.out.println("giá sửa lại : ");
		Integer update = scanner.nextInt();
		list1.set(sua, update);
	}
	public static void xoa(Scanner scanner, ArrayList<String> list, ArrayList<Integer> list1)
	{
		System.out.print(" xóa món ăn : ");
		int xoa = Integer.parseInt(scanner.nextLine());
		list.remove(xoa);
		list1.remove(xoa);
	}
	public static void xuat(ArrayList<String> list, ArrayList<Integer> list1)
	{
		System.out.println(" menu : ");
		for (int j = 0; j < list.size(); j++) {
			System.out.println(" tên món :"+ list.get(j)+"--" );
			System.out.println(" giá:"+ list1.get(j));
		}
	}

}
