package huongdoituong;

public class xe {
private String ten;
private int gia;
private String hang;
private String sx;


public xe(String ten, int gia, String hang, String sx) {

	this.ten = ten;
	this.gia = gia;
	this.hang = hang;
	this.sx = sx;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public int getGia() {
	return gia;
}
public void setGia(int gia) {
	this.gia = gia;
}
public String getHang() {
	return hang;
}
public void setHang(String hang) {
	this.hang = hang;
}
public String getSx() {
	return sx;
}
public void setSx(String sx) {
	this.sx = sx;
}
@Override
public String toString() {
	return "xe [ten=" + getTen()+ ", gia=" + getGia() + ", hang=" + getHang() + ", sx=" + getSx() + "]";
}


}
