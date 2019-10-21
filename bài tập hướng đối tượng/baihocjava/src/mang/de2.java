package mang;

import java.util.Scanner;

public class de2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào độ dài của mảng: ");
		int size = scanner.nextInt();
		String[] a = new String[size];
		nhapmang1(a, scanner);
		String[] b = new String[size];
		nhapmang2(b, scanner);
		int[] c = new int[size];
		nhapmang3(c, scanner);
		xuatmang1( a);
		xuatmang2(b);
		xuatmang3(c);

	}

	public static void nhapmang1(String[] a, Scanner scanner) {
scanner.nextLine();
		for (int i = 0; i < a.length; i++) {
			System.out.println(" nhập tên các hãng máy tính " + i);
			a[i] = scanner.nextLine();
		}
	}

	public static void nhapmang2(String[] b, Scanner scanner) {

		for (int i = 0; i < b.length; i++) {
			System.out.println(" nhập tên loại máy tính " + i);
			b[i] = scanner.nextLine();
		}
	}

	public static void nhapmang3(int[] c, Scanner scanner) {

		for (int i = 0; i < c.length; i++) {
			System.out.println(" nhập tiền máy tính " + i);
			c[i] = scanner.nextInt();
		}
	}
public static void xuatmang1(String a[])
{
	System.out.println(" các hãng  máy tính có là :");
	for(int i=0;i<a.length;i++)
{System.out.println(a[i]);
	}
	}
	
public static void xuatmang2(String b[])
{
	System.out.println(" các loại máy tính có là :");
	for(int i=0;i<b.length;i++)
{System.out.println(b[i]);
	}
	}
public static void xuatmang3(int c[])
{
	System.out.println(" giá tiền là ");
	for(int i=0;i<c.length;i++)
{System.out.println(c[i]);
	}
	}
public static void giacao(int c[])
{for(int i=0;i<c.length;i++)
	
{System.out.println(" giá tiền bé hơn 1500 ");
	if(c[i]<1500)
	{
		System.out.println(c[i]);
	}
	}
	}
public static void giathap(int c[])
{for(int i=0;i<c.length;i++)
	
{System.out.println(" giá tiền lớn hơn 1500 ");
	if(c[i]>1500)
	{
		System.out.println(c[i]);
	}
	}
	}
}
