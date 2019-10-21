package baitap.ngoc.com;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		int n;
		int s;
		s = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhập n = ");
		n = scanner.nextInt();

		if (n % 2 == 0) {
			for (int i = 1; i <= n; i++)

			{
				if (i % 2 != 0) {

					s = s + (i);
				}

			}
			System.out.println("tổng là " + s);
		} else {
			for (int i = 1; i <= n; i++)

			{
				if (i % 2 == 0) {

					s = s + (i);
				}

			}
			System.out.println("tổng là " + s);
		}
	}

}
