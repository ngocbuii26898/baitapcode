package kethua;

import java.util.Scanner;

public class maincanbo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a= scanner.nextLine();
			int b= scanner.nextInt();
			String c= scanner.nextLine();
			String d= scanner.nextLine();
			String e= scanner.nextLine();
			
	canbo NHANVIEN =new nhanvien(a,b,c,d,e);
	
	System.out.println(NHANVIEN.toString());
	
	}
}
