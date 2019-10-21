package com.teamtuananh.FuctionMAIN;

import java.util.ArrayList;
import java.util.Scanner;

import com.teamtuananh.CRUD.CRUD;


public class MAIN {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CRUD c= new CRUD();
		int i = 0;
		do {
			System.out.println("1.list");
			System.out.println("2.insert ");
			System.out.println("3.delete ");
			System.out.println("4.update");
			
			System.out.print("moi ban lua chon");
			int nhap = scanner.nextInt();
			scanner.nextLine();

			switch (nhap) {
			case 1:
			c.ListMonAn();
				break;
			case 2:
				c.InsertMonAn( scanner.next(),scanner.nextInt() );
				break;
				
			case 3:
				c.DeleteMonAn(scanner.nextInt());
				break;
			case 4:
				c.UpdateMonAn( scanner.nextInt(),scanner.nextInt() );
				break;
				
		}} while (i >= 0);

		
		

	

		}}

	
		

