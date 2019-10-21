package phone;

import java.util.ArrayList;
import java.util.Scanner;

import thuvien.sach;

public class phonebook extends phone{
	
	ArrayList<oppphone> phonelist = new ArrayList<oppphone>();
	private oppphone opp;
	
	
	public void insertphone(String name, String phone) {
		opp = new oppphone (name,phone);
		phonelist.add(opp);

		
		
	}

	@Override
	public void removephone(String name) {
		
		
		for (int i1 = 0; i1 < phonelist.size(); i1++) {
    opp = phonelist.get(i1);
			if (name.equals(opp.getName())) {

				phonelist.remove(i1);}}
	}

	@Override
	public void updatephone(String name, String newphone) {
		for(int i1=0;i1<phonelist.size();i1++)
		{
			opp=phonelist.get(i1);
			if(name.equals(opp.getName()))
			{
				phonelist.set(i1, opp=new oppphone(name,newphone));
			}
		}
		
	}

	@Override
	public void searchphone(String name) {
		for(int i=0;i<phonelist.size();i++)
		{
			opp=phonelist.get(i);
			if(name.equals(opp.getName()))
			{
				System.out.println(opp.toString());
			}
		}
		
	}

	

	@Override
	public void listphone() {
		for(int i=0;i<phonelist.size();i++)
		{
			opp=phonelist.get(i);
			System.out.println(opp.toString());
			
		}
		
	}





}
