package Point2D;

import java.util.Scanner;

import huongdoituong.xe;

public class MAIN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x= scanner.nextDouble();
		double y= scanner.nextDouble();
		Point2D Point2D1 = new Point2D(x,y);
		System.out.println(Point2D1.imgOx());
		System.out.println(Point2D1.imgOy());
		
		
	}

}
