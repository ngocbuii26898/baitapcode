package thuvien;

import java.util.ArrayList;
import java.util.Scanner;

public class quanlysach {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<sach> arrsach = new ArrayList<>();
		ArrayList<tapchi> arrtapchi = new ArrayList<>();
		ArrayList<bao> arrbao = new ArrayList<>();

		int i = 0;
		do {
			System.out.println("1.them ");
			System.out.println("2.tim kiem ");
			System.out.println("3.danh sách ");
			System.out.println("4.thoat");
			System.out.print("moi ban lua chon");
			int nhap = scanner.nextInt();
			scanner.nextLine();

			switch (nhap) {
			case 1:

				
				nhapsach(scanner, arrsach);
				nhapbao(scanner, arrbao);
				nhaptapchi(scanner, arrtapchi);
				

				break;
			case 2:
				int nhaploai=scanner.nextInt();
				scanner.nextLine();
				System.out.println("1.sach ");
				System.out.println("2.bao ");
				System.out.println("3.tap chi ");
				
				System.out.print("moi ban lua chon");
				switch (nhaploai)
				{
				
				case 1:
					
					System.out.println(arrsach.toString());
				case 2:
					System.out.println(arrbao.toString());
					case 3:
						System.out.println(arrtapchi.toString());
				}
			case 3:
				for (int j = 0; j < arrsach.size(); j++) {
				System.out.println(arrsach.toString());
				
					System.out.println(arrbao.toString());
				
					System.out.println(arrtapchi.toString());}
					
				break;

			}
		} while (i >= 0);

		
		
	}

	
	public static void nhapsach(Scanner scanner ,ArrayList<sach> arrsach)
	{

		
		System.out.println("Nhập thông tin sách :");

		System.out.print("Nhập mã sách: ");
		int sotrang = scanner.nextInt();
		System.out.print("Nhập tên tác giả : ");
		String tentg = scanner.next();
		System.out.print("Nhập mã tài liệu : ");
		int matl = scanner.nextInt();
		System.out.print("Nhập số bản phát hành : ");
		int sobanph = scanner.nextInt();
		System.out.print("Nhập tên nhà xuất bản : ");
		String tennsx = scanner.next();

		sach SACH = new sach(matl, tennsx, sobanph, tentg, sotrang);
		arrsach.add(SACH);
		
		
	}
	
	public static void nhapbao(Scanner scanner ,ArrayList<bao> arrbao)
	{

		
		System.out.println("Nhập thông tin bao :");

		
		System.out.print("Nhập mã tài liệu : ");
		int matl = scanner.nextInt();
		System.out.print("Nhập số bản phát hành : ");
		int sobanph = scanner.nextInt();
		System.out.print("Nhập tên nhà xuất bản : ");
		String tennsx = scanner.next();
		
		System.out.print("Nhập ngày phát hanh  : ");
		int ngayph = scanner.nextInt();

		bao BAO = new bao( matl,  tennsx, sobanph,ngayph);
		arrbao.add(BAO);
		
		
	}
	
	public static void nhaptapchi(Scanner scanner ,ArrayList<tapchi> arrtapchi)
	{

		
		System.out.println("Nhập thông tin tap chi :");

		
		System.out.print("Nhập mã tài liệu : ");
		int matl = scanner.nextInt();
		System.out.print("Nhập số bản phát hành : ");
		int sobanph = scanner.nextInt();
		System.out.print("Nhập tên nhà xuất bản : ");
		String tennsx = scanner.next();
		
		System.out.print("Nhập số phát hành  : ");
		int soph = scanner.nextInt();

		System.out.print("Nhập tháng phát hành  : ");
		int thangph = scanner.nextInt();
		 
		tapchi TAPCHI = new tapchi(  matl,  tennsx,  sobanph,  soph,  thangph);
		arrtapchi.add(TAPCHI);
		
		
	}

}
