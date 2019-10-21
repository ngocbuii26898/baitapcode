package com.ngoc.MAIN;

import java.util.Scanner;

import com.ngoc.CRUD.CRUD;


public class MAIN {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		CRUD c= new CRUD();
		int i = 0;
		do {
			System.out.println("1.list");
			System.out.println("2.insert ");
			System.out.println("3.update");
			System.out.println("4.delete");
			System.out.println("5.search");
			System.out.print("moi ban lua chon");
			int nhap = scanner.nextInt();
			scanner.nextLine();

			switch (nhap) {
			case 1:
			c.ListShop();
				break;
			case 2:
				c.InsertShop(scanner.next(), scanner.nextInt(), scanner.next());;
				break;
			case 3:
				c.UpdateShop(scanner.nextInt(), scanner.nextInt());
				break;
			case 4:
				c.DeleteShop(scanner.nextInt());
			case 5:
				c.SearchShop(scanner.toString());
				
		}} while (i >= 0);


		
	}

}
