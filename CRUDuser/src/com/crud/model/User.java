package com.crud.model;

public class User {
private int id;
private String ten;
private String tuoi;
private String diachi;
private String gioitinh;
private String anh;
private int checkbox;
private String congviec;
private String thongtin;

public String getThongtin() {
	return thongtin;
}
public void setThongtin(String thongtin) {
	this.thongtin = thongtin;
}
public String getCongviec() {
	return congviec;
}
public void setCongviec(String congviec) {
	this.congviec = congviec;
}
public int getCheckbox() {
	return checkbox;
}
public void setCheckbox(int checkbox) {
	this.checkbox = checkbox;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public String getTuoi() {
	return tuoi;
}
public void setTuoi(String tuoi) {
	this.tuoi = tuoi;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
}
public String getGioitinh() {
	return gioitinh;
}
public void setGioitinh(String gioitinh) {
	this.gioitinh = gioitinh;
}
public String getAnh() {
	return anh;
}
public void setAnh(String anh) {
	this.anh = anh;
}
}