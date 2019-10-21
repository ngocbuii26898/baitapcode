package baitap.ngoc.com;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		double n, number;
		  double  max, min;
		  
		    Random rd = new Random();
		    Scanner scanner = new Scanner(System.in);
		     
		    System.out.println("Nhập số phần tử của arrList: ");
		    n = scanner.nextInt();
		    ArrayList<Integer> arrList = new ArrayList<>(n);
		         
		    for (int i = 0; i < n; i++) {
		        number = 10 + rd.nextInt(91);
		        arrList.add(number);
		    }
	
  
         
    System.out.println("Ba số vừa được sinh ra là " +number);
         
    // tìm số lớn nhất
    max = firstNumber;
    if (max < secondNumber) {
        max = secondNumber;
    } 
    if (max < thirdNumber) {
        max = thirdNumber;
    }
    System.out.println("Số lớn nhất trong 3 số là " + max);
         
    // tìm số nhỏ nhất
    min = firstNumber;
    if (min > secondNumber) {
        min = secondNumber;
    } 
    if (min > thirdNumber) {
        min = thirdNumber;
    }
    System.out.println("Số nhỏ nhất trong 3 số là "+ min);
}
}