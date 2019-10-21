package trutuong;

public class kethuso extends so{
	private int a;
	private int b;
	public kethuso(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public int cong() {
		int tong=a+b;
		return tong;
	}
	@Override
	public int  tru() {
		int hieu=a-b;
		return hieu;
	}
	@Override
	public int nhan() {
		int tich =a*b;
		return tich;
	}
	@Override
	public int chia() {
		int thuong =a/b;
		return thuong;
	}

}
