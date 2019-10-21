package mang;

import java.util.Scanner;

public class xuatnhapmang1chieu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
	    System.out.println("Nhập vào độ dài của mảng: ");
	    int size= scanner.nextInt();
		int []a=new int [size];
		 		for(int i=0;i< size ;i++)
		{
			System.out.println(" nhap vao phan tu thu"+ i);
			a[i] = scanner.nextInt();
		}
		 		 for (int i = 0; i < size; i++) {
		 	        System.out.println("Phần tử thứ " + i + ": " + a[i]);
		 	    }
	}

}
