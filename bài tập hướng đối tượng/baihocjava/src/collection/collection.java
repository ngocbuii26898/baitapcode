package collection;

import java.awt.List;
import java.util.ArrayList;

public class collection {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("nguyễn văn a");
		list.add("nguyễn văn b");
		
		System.out.println("xuat mang");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("sua mang");
		list.set (0,"nhu ngoc");
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("xoa mang");
		list.remove(1);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
