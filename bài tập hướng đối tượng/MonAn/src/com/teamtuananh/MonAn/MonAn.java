package com.teamtuananh.MonAn;

public class MonAn {
private int idMonAn;
private String TenMonAn;
private int GiaMonAn;
public MonAn(String tenMonAn, int giaMonAn) {
	
	this.TenMonAn = tenMonAn;
	this.GiaMonAn = giaMonAn;
}

public MonAn(int idMonAn) {
	
	this.idMonAn = idMonAn;
}






public MonAn(int idMonAn, int giaMonAn) {
	
	this.idMonAn = idMonAn;
	this.GiaMonAn = giaMonAn;
}

public String getTenMonAn() {
	return TenMonAn;
}
public void setTenMonAn(String tenMonAn) {
	TenMonAn = tenMonAn;
}
public int getGiaMonAn() {
	return GiaMonAn;
}
public void setGiaMonAn(int giaMonAn) {
	GiaMonAn = giaMonAn;
}

public int getIdMonAn() {
	return idMonAn;
}

public void setIdMonAn(int idMonAn) {
	this.idMonAn = idMonAn;
}


}
