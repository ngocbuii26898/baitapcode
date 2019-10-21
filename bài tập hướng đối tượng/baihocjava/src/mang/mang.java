package mang;

import java.util.Scanner;

public class mang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(" mời bạn nhập chieu dai của mảng");
		 int nhap= scanner.nextInt();
		
		 int []myArry=new int [nhap];
		 System.out.println(" arry length"+myArry.length);
		 
		 		 for(int i=0;i<myArry.length;i++)
			 
		 {
			 System.out.println("nhap myarry["+i+"]");
			 myArry[i]=scanner.nextInt();

		 }
		 		 for(int index =0;index<myArry.length;index++)
		 			 
		 		 {
		 			System.out.println(" element"+index+"="+ myArry[index]);
		 		 }
	}

}
