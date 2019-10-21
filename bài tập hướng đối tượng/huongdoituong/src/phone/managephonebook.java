package phone;

import java.util.ArrayList;
import java.util.Scanner;

public class managephonebook {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		phonebook pp =new phonebook();

		
		
		int i = 0;
		do {
			System.out.println("1.them ");
			System.out.println("2.xoa ");
			System.out.println("3.sua ");
			System.out.println("4.tim"
					+ "\n5.list");
			
			System.out.print("moi ban lua chon");
			int nhap = scanner.nextInt();
			scanner.nextLine();

			switch (nhap) {
			case 1:
				System.out.println("nhap phone");
				pp.insertphone(scanner.next(), scanner.next());
				
				
				break;
			case 2:
				System.out.print("moi nhap phone");
				pp.removephone(scanner.next());
				
break;
					
				
			case 3:
				
				System.out.println("moi nhap ten ");
				pp.updatephone(scanner.next(), scanner.next());
				break;
			case 4:
			System.out.println("moi nhap ten");
			pp.searchphone(scanner.next());
			
			break;
			case 5:
				pp.listphone();
				break;
		}} while (i >= 0);

		
		

	

		}}
