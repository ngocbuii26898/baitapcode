package huongdoituong;

import java.util.Scanner;

public class mainhinhchunhat {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	int a= scanner.nextInt();
		int b= scanner.nextInt();
		hinhchunhat hinhchunhat1 =new hinhchunhat(a,b);
		System.out.println(hinhchunhat1.dientich());
		System.out.println(hinhchunhat1.chuvi());
	}

}
