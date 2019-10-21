package baihocjava;

import java.util.Scanner;

public class tinhtuoi {

	public static void main(String[] args) {
		
	        double toan, li, hoa, dtb;
	       
	        Scanner scanner = new Scanner(System.in);
	                
	        System.out.println("nhap diem toan:");
	        toan = scanner.nextDouble();
	        System.out.println("nhap diem li: ");
	        li= scanner.nextDouble();
	        System.out.println("nhap diem hoa: ");
	        hoa = scanner.nextDouble();
	   
	         dtb = ((toan + li + hoa )/ 3) ;
	          
	            System.out.println("diem trung binh la: "+ dtb );
	            int a=0;
	            if(dtb<5) {
	            	System.out.println("ban yeu ");
	            	a=1;
	            }
	            else if((dtb>=5)&&(dtb<6.5))
	            {
	            	System.out.println("ban tb");
	            	a=2;
	            }
	            else if((dtb>=6.5)&&(dtb<8.5))
	            {
	            	System.out.println("ban kha");	
	            	a=3;
	            }
	            else 
	            {
	            	System.out.println("ban gỏi");	
	            	a=4;
	            }
	            
	            	         
	            switch (a){
	            	case 1:
	            		System.out.println("ban co qua loai 1  ");
	            		break;
	            	case 2:
	            		System.out.println("ban co qua loai 2 ");
	            		break;
	            	case 3:
	            		System.out.println("ban can co gang  ");
	            		break;
	            	case 4:
	            		System.out.println("ban phai hoc lai  ");
	            		break;
	            }
	        
	}

}
