package trutuong;

import java.util.Scanner;

public class mainso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b= scanner.nextInt();
		kethuso tong =new kethuso(a,b);
		kethuso hieu=new kethuso(a,b);
		kethuso tich =new kethuso(a,b);
		kethuso thuong =new kethuso(a,b);
		System.out.println(tong.cong());
		System.out.println(hieu.tru());
		System.out.println(tich.nhan());
		System.out.println(thuong.chia());
	}

}
