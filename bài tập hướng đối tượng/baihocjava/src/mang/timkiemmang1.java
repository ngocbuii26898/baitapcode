package mang;

import java.util.Scanner;

public class timkiemmang1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào độ dài của mảng: ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println(" nhap vao phan tu thu" + i);
			a[i] = scanner.nextInt();

		}
		System.out.println(" phan tu can tim kiếm là");
		int b = scanner.nextInt();
		for (int i = 0; i < size; i++) {

			if (a[i] == b) {

				System.out.println(" phan tu o vi tri thu " + i + "trong mảng");
				System.out.println(" phan tu o vi tri thu " + (i + 1) + "trong " + size + "so nhap vao");

			}
		}
	}

}
