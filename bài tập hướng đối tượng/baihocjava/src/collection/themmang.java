package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class themmang {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("them mang");
		int i = 0;
		do {
			System.out.println("1.them");
			System.out.println("2.sua");
			System.out.println("3.xoa");
			System.out.println("5.thoat");	
			System.out.println("4.danh sach");
			System.out.print("moi ban lua chon");
			int nhap = scanner.nextInt();
			scanner.nextLine();

			switch (nhap) {
			case 1:
				
				System.out.println("moi nhap phan tu[" + i + "]");
				scanner.nextLine();
				list.add(scanner.nextLine());
				i++;
				break;

			case 2:
				System.out.println("moi nhap phan tu can sua ");
				int sua = Integer.parseInt(scanner.nextLine());

				System.out.println("noi dung can sua la: ");
				String update = scanner.nextLine();
				list.set(sua, update);

				for (int i1 = 0; i1 < list.size(); i1++) {
					System.out.println(list.get(i1));
				}

				break;
			case 3:
				System.out.println("moi nhap phan tu can xoa ");

				list.remove(scanner.nextInt());
				for (int i2 = 0; i2 < list.size(); i2++) {
					System.out.println(list.get(i2));
				}
			case 4: 
				System.out.print("Danh sách: ");
				for (int j = 0; j < list.size(); j++) {
				System.out.println("\n" + j + " -- " + list.get(j));
				}
			case 5:
				i = -1;
				break;
			}

		} while (i > 0);

	}
	// tạo 1 menu món ăn gồm cá tính năng thêm sửa xóa 
	//yêu cầu là cho khách chọn từng tính năng 
	//menu gồm có tên món ăn và giá tiền bên cạnh (sửa giá tiền )( xóa món ăn là xóa luôn tiền )

//(thêm là thêm cả tên và tiền )
	//list toàn bộ 
	}
