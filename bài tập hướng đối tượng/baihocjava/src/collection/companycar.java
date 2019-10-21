package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class companycar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int i = 0;
		do {
			System.out.println("1.them ");
			System.out.println("2.sua");
			System.out.println("3.xoa");
			System.out.println("4.menu");
			System.out.println("5.tim kiem ");
			System.out.println("6.thoat");
			System.out.print("moi ban lua chon");
			int nhap = scanner.nextInt();
			scanner.nextLine();

			switch (nhap) {
			case 1:

				them(scanner, list, list1, list2);
				break;

			case 2:
				sua(scanner, list2);
				break;
			case 3:
				xoa(scanner, list, list1, list2);

				break;
			case 4:

				xuat(list, list1, list2);

				break;
			case 5:
				tim(scanner, list, list1, list2);
				break;
			case 6:
				i = -1;
				break;
			}

		} while (i >= 0);

	}

	public static void them(Scanner scanner, ArrayList<String> list, ArrayList<String> list1,
			ArrayList<Integer> list2) {
		System.out.println("mời nhập  tên car:");

		list.add(scanner.nextLine());
		System.out.println("mời nhập  hãng car :");

		list1.add(scanner.next());
		System.out.println("mời nhập giá car:");

		list2.add(scanner.nextInt());

	}

	public static void sua(Scanner scanner, ArrayList<Integer> list2) {
		System.out.println("mời nhập car cần sửa giá : ");
		int sua = scanner.nextInt();
		scanner.nextLine();

		System.out.println("giá sửa lại : ");
		Integer update = scanner.nextInt();
		list2.set(sua, update);

	}

	public static void xoa(Scanner scanner, ArrayList<String> list, ArrayList<String> list1, ArrayList<Integer> list2) {
		System.out.print(" xóa car : ");
		int xoa = Integer.parseInt(scanner.nextLine());
		list.remove(xoa);
		list1.remove(xoa);
		list2.remove(xoa);
	}

	public static void xuat(ArrayList<String> list, ArrayList<String> list1, ArrayList<Integer> list2) {
		for (int j = 0; j < list.size(); j++) {
			System.out.println(j + "." + " tên car:" + list.get(j) + "--" + " hãng" + list1.get(j) + "--" + " giá:"
					+ list2.get(j));

		}
	}

	public static void tim(Scanner scanner, ArrayList<String> list, ArrayList<String> list1, ArrayList<Integer> list2) {
		System.out.println(" tim kiếm car :");
		String tim = scanner.nextLine();
		for (int i1 = 0; i1 < list.size(); i1++) {

			if (tim.equals(list.get(i1).trim())) {

				System.out.println(i1 + "." + " tên car:" + list.get(i1) + "--" + " hãng" + list1.get(i1) + "--"
						+ " giá:" + list2.get(i1));

			}
		}
	}

}
