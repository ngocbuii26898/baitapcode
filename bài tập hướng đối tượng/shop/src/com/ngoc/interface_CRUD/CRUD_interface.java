package com.ngoc.interface_CRUD;

public interface CRUD_interface {
	public abstract void ListShop();
	public abstract void InsertShop(String TenMatHang,int GiaMatHang,String LoaiHang);
	public abstract void UpdateShop(int idMatHang,int GiaMatHang);
	public abstract void DeleteShop(int idMatHang);
	public abstract void SearchShop(String LoaiHang);
}
