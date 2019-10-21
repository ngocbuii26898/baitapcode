package baitap.ngoc.com;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		int n;
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("nhập n = ");
		n = scanner.nextInt();
		
		if(n<=0)
		{
		System.out.println("nhập vào số nguyên dương");	
		}
		else {
			double S;
			S = 0;
			for(int i=1;i<=n;i++)
			{
				S =  (float) (S + 1.0 / i);
			}
			System.out.println("tổng là "+(double) Math.round(S * 1000) / 1000);
		}
		
	}

}
