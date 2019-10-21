package baihocjava;

import java.util.Scanner;

public class congsnd {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);              
	        System.out.println("moi ban nhap : ");
	        int tong=0;
	        int a =scanner.nextInt();
	        for(int i=0;i<=a;i++)
	        {
	        	tong=tong+i;
	        	
	        }
	        System.out.println("tong la :"+ tong);

	}

}
