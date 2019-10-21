package com.teamtuananh.CRUD;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Month;

import com.teamtuananh.MonAn.MonAn;
import com.teamtuananh.connect.connect;
import com.teamtuananh.interface_CRUD.CRUD_interface;

public class CRUD implements CRUD_interface {
	public Connection connectSQL =connect.getJDBCConnection();

	@Override
	public void ListMonAn() {
		try {
			String sql ="SELECT * FROM monanviahe.monanviahe";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			
			//de sql hiu dong try van 
			ResultSet rs = pre.executeQuery();
			
			while (rs.next())
			{int id=rs.getInt("idMonAn");
			String ten=rs.getString("TenMonAn");
			int gia=rs.getInt("GiaMonAn");
			
			System.out.println("--idMonAn:"+id+"--TenMonAN---"+ten+"--GiaMonAn"+gia);
				
				
			}
			
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
			
		
		
	}

	@Override
	public void InsertMonAn(String TenMonAn,int GiaMonAn) {
		
		try {
			String sql ="INSERT INTO  monanviahe.monanviahe (TenMonAn,GiaMonAn) VALUES(?,?) ";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			
	        
	       
		        MonAn gma = new MonAn (TenMonAn,GiaMonAn);
				
				pre.setString(1, gma.getTenMonAn());
				pre.setInt(2, gma.getGiaMonAn());
				int check_insert =pre.executeUpdate();
				if(check_insert==1)
				{
					System.out.println("insert thanh cong ");
					
				}
				else 
				{
					System.out.println("insert khong thanh cong ");
					
				}
				
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		
			
	}

	@Override
	public void UpdateMonAn(   int idMonAn,int GiaMonAn) {
		try {
			String sql ="UPDATE monanviahe.monanviahe SET GiaMonAn=? WHERE idMonAn= ?;";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			
			
			 MonAn gma = new MonAn(idMonAn,GiaMonAn);
			 pre.setInt(1, gma.getGiaMonAn());
				pre.setInt(2, gma.getIdMonAn());
				
				
				int check_insert =pre.executeUpdate();
				if(check_insert==1)
				{
					System.out.println("update thanh cong ");
					
				}
				else 
				{
					System.out.println("update khong thanh cong ");
					
				}
				
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		
			
	

	}	
	

	@Override
	public void DeleteMonAn(int idMonAn) {
		
		
		try {
			String sql ="DELETE FROM monanviahe.monanviahe WHERE idMonAn = ?;";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			
			
			 MonAn gma = new MonAn( idMonAn);
				
				pre.setInt(1, gma.getIdMonAn());
				
				int check_insert =pre.executeUpdate();
				if(check_insert==1)
				{
					System.out.println("delete thanh cong ");
					
				}
				else 
				{
					System.out.println("delete  khong thanh cong ");
					
				}
				
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
		
			
	

	}}
