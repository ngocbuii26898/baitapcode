package thuvien;

public class sach extends thuvien {

	
	private String tentg;
	private int sotrang;
	
	public sach(int matl, String tennsx, int sobanph, String tentg, int sotrang) {
		super(matl, tennsx, sobanph);
		this.tentg = tentg;
		this.sotrang = sotrang;
	}
	public String getTentg() {
		return tentg;
	}
	public void setTentg(String tentg) {
		this.tentg = tentg;
	}
	public int getSotrang() {
		return sotrang;
	}
	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
	@Override
	public String toString() {
		return "sach [tentg=" + getTentg()+ ", sotrang=" + getSotrang() +", matl=" + getMatl() + ", tennsx=" + getTennsx()+", sobanph=" + getSobanph()  +"]";
	}
	

}
