package baihocjava;

import java.util.Scanner;

public class nhapsnd {

	public static void main(String[] args) {
		
   
       
        Scanner scanner = new Scanner(System.in);              
        System.out.println("moi ban nhap thang: ");

   	
        
        int nhap=scanner.nextInt();
        switch(nhap)
        {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	
        	 System.out.println("thang co 31 ngay");
        	 break;
        case 2:
       	 System.out.println("thang co 29 ngay");
       	 break;
       	 
       
        case 4:
        case 6:
        case 9:
        case 11:
       	 System.out.println("thang co 30 ngay");
       	 break;
        
                }
        System.out.println("so ngay thang  tiep theo la:");
        int a=scanner.nextInt();
        a=nhap;
        
        
        
	}

}
