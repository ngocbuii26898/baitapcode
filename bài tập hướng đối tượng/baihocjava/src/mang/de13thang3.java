package mang;

import java.util.Scanner;

public class de13thang3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào độ dài của mảng: ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		nhapmang(a, scanner);
		tongphantuduong(a);
		trungbinhcong(a);
		sapxep(a);
		demphantu(a, scanner);
	}

	public static void nhapmang(int a[], Scanner scanner) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("phần thử thứ " + i + "=");
			a[i] = scanner.nextInt();
		}
	}

	public static void tongphantuduong(int a[]) {
		int tong = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				tong = tong + a[i];

			}

		}
		System.out.println("tổng các phần tử dương trong mảng là : " + tong);

	}

	public static float trungbinhcong(int a[]) {
		int tong = 0, dem = 0, tb = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 5 == 0)

			{

				tong = (tong + a[i]);

				dem++;
				tb = tong / dem;
			}

		}
		System.out.println("trung bình cộng các phần tử chia hết cho 5 là : " + tb);
		return dem;
	}

	public static void sapxep(int a[]) {

		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		System.out.print("mảng tăng dần là : ");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}
		System.out.println("");
	}

	public static void demphantu(int a[], Scanner scanner) {
		System.out.print("nhập c: ");
		int c = scanner.nextInt();
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == c)
				dem++;
		}
		System.out.println("số lần " + c + " xuất hiện là : " + dem);

		for (int i = 0; i < a.length; i++) {

			if (a[i] == c) {

				System.out.println(" phan tu o vi tri thu " + i + " trong mảng");

			}
		}

	}
}
