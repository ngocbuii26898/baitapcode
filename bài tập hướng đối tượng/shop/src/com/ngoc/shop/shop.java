package com.ngoc.shop;

public class shop {
private int idMatHang;
private String TenMatHang;
private int GiaMatHang;
private String LoaiHang;


public shop(String tenMatHang, int giaMatHang, String loaiHang) {
	
	this.TenMatHang = tenMatHang;
	this.GiaMatHang = giaMatHang;
	this.LoaiHang = loaiHang;
}

public shop(int idMatHang, int giaMatHang) {
	
	this.idMatHang = idMatHang;
	this.GiaMatHang = giaMatHang;
}

public shop(int idMatHang) {
	
	this.idMatHang = idMatHang;
}




public shop(String loaiHang) {
	
	this.LoaiHang = loaiHang;
}

public int getIdMatHang() {
	return idMatHang;
}
public void setIdMatHang(int idMatHang) {
	this.idMatHang = idMatHang;
}
public String getTenMatHang() {
	return TenMatHang;
}
public void setTenMatHang(String tenMatHang) {
	TenMatHang = tenMatHang;
}
public int getGiaMatHang() {
	return GiaMatHang;
}
public void setGiaMatHang(int giaMatHang) {
	GiaMatHang = giaMatHang;
}
public String getLoaiHang() {
	return LoaiHang;
}
public void setLoaiHang(String loaiHang) {
	LoaiHang = loaiHang;
}

}
