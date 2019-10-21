package huongdoituong;

public class phanso {

	private int tu;
	private int mau;
	private int tu1;
	private int mau1;
	
	public phanso(int tu, int mau, int tu1, int mau1) {
		
		this.tu = tu;
		this.mau = mau;
		this.tu1 = tu1;
		this.mau1 = mau1;
	}
	
	public int getTu() {
		return tu;
	}
	public void setTu(int tu) {
		this.tu = tu;
	}
	public int getMau() {
		return mau;
	}
	public void setMau(int mau) {
		this.mau = mau;
	}
	
	public int getTu1() {
		return tu1;
	}

	public void setTu1(int tu1) {
		this.tu1 = tu1;
	}

	public int getMau1() {
		return mau1;
	}

	public void setMau1(int mau1) {
		this.mau1 = mau1;
	}

	public float tong() {
		int x=(tu/mau) ;
		int y=(tu1/mau1);
		int tong =(x+y);
		return tong ;
		
	}
	public float hieu() {
		int x=(tu/mau) ;
		int y=(tu1/mau1);
		int hieu =(x-y);
		return hieu;
	}
	public float tich() {
		int x=(tu/mau) ;
		int y=(tu1/mau1);
		int hieu =(x*y);
		return hieu;
	}
	public float thuong() {
		int x=(tu/mau) ;
		int y=(tu1/mau1);
		int hieu =(x/y);
		return hieu;
	}
	
	
	
}
