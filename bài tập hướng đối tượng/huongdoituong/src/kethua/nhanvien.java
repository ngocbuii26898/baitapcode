package kethua;

public class nhanvien extends canbo {

	
private String bac;
public nhanvien(String ho, int namsinh, String gioitinh, String diachi, String bac) {
	super(ho, namsinh, gioitinh, diachi);
	this.bac = bac;
}
public String getBac() {
	return bac;
}
public void setBac(String bac) {
	this.bac = bac;
}
@Override
public String toString() {
	return "ho"+getHo()+"nam sinh " +getNamsinh()+" gioi tinh  "+getGioitinh()+"dia chi "+getDiachi()+"nhanvien [bac=" + bac + "]";
}

		
	
	
}
