package com.ngoc.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ngoc.connect.connect;
import com.ngoc.interface_CRUD.CRUD_interface;
import com.ngoc.shop.shop;



public class  CRUD implements CRUD_interface{
	public Connection connectSQL =connect.getJDBCConnection();

	@Override
	public void ListShop() {
		try {
			String sql ="SELECT * FROM shop.shop";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			
			//de sql hiu dong try van 
			ResultSet rs = pre.executeQuery();
			
			while (rs.next())
			{int id=rs.getInt("idMatHang");
			String ten=rs.getString("TenMatHang");
			int gia=rs.getInt("GiaMatHang");
			String loai=rs.getString("LoaiHang");
			
			System.out.println("--idMatHang:"+id+"--TenMatHang:"+ten+"--GiaMatHang:"+gia+"--LoaiHang:"+loai);
				
				
			}
			
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
			
		
		
	}

	@Override
	public void InsertShop(String TenMatHang, int GiaMatHang, String LoaiHang) {
		try {
			String sql ="INSERT INTO shop.shop (TenMatHang,GiaMatHang,LoaiHang) VALUES(?,?,?) ";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			
	        
	       
		        shop gmh = new shop (TenMatHang,GiaMatHang,LoaiHang);
				
				pre.setString(1, gmh.getTenMatHang());
				pre.setInt(2, gmh.getGiaMatHang());
				pre.setString(3, gmh.getLoaiHang());
				
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
	public void UpdateShop(int idMatHang, int GiaMatHang) {
		try {
			String sql ="UPDATE shop.shop SET GiaMatHang=? WHERE idMatHang= ?;";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			
			
			 shop gmh = new shop(idMatHang,GiaMatHang);
			 pre.setInt(1, gmh.getGiaMatHang());
				pre.setInt(2, gmh.getIdMatHang());
				
				
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
	public void DeleteShop(int idMatHang) {
		try {
			String sql ="DELETE FROM shop.shop  WHERE idMatHang = ?;";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			
			
			 shop gmh = new shop( idMatHang);
				
				pre.setInt(1, gmh.getIdMatHang());
				
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
		
			
	

	}

	@Override
	public void SearchShop(String LoaiHang) {
		try {
			String sql ="SELECT * FROM shop.shop  WHERE LoaiHang  LIKE' ?';";
			PreparedStatement pre = connectSQL.prepareStatement(sql);
			
			shop gmh = new shop( LoaiHang);
			
			pre.setString(1, gmh.getLoaiHang());
			
			ResultSet rs = pre.executeQuery();
			while (rs.next())
			{int id=rs.getInt("idMatHang");
			String ten=rs.getString("TenMatHang");
			int gia=rs.getInt("GiaMatHang");
			String loai=rs.getString("LoaiHang");
			
			System.out.println("--idMatHang:"+id+"--TenMatHang:"+ten+"--GiaMatHang:"+gia+"--LoaiHang:"+loai);
				
				
			}
			
			
			}
			catch(SQLException e) {
				
				e.printStackTrace();
			}
			
		
		
		
	}}
	


