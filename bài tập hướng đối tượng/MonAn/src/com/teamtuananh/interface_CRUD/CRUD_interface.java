package com.teamtuananh.interface_CRUD;

public interface CRUD_interface {
	public abstract void ListMonAn();
	public abstract void InsertMonAn(String TenMonAn,int GiaMonAn);
	public abstract void UpdateMonAn(int idMonAn,int GiaMonAn);
	public abstract void DeleteMonAn(int idMonAn);
	
}
