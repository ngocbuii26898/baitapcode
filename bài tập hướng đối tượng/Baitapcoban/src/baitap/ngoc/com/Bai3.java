package baitap.ngoc.com;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Bai3 {
	
	public static void main(String[] args) {
		
		
		 double  number;
		    Random rd = new Random();
		   
		    ArrayList<Double> arrList = new ArrayList<>(100);
		         
		    for (int i = 1; i <=100; i++) {
		        number = 10+ rd.nextInt(91);
		        arrList.add(number);
		        System.out.println(i+"  "+number);
		    }
		    Double max = arrList.get(0);    
	         
		    for (int i = 1; i < arrList.size(); i++) {
		       
		        if (arrList.get(i).compareTo(max) > 0) {
		            max = arrList.get(i);
		        }
		    }
		    System.out.println("Phần tử lớn nhất trong 100 số là : " + max);
		}
		    
	
	}
	
	

