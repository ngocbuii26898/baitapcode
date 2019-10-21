package thuvien;

public class tapchi extends thuvien {

	
	private int soph;
	private int thangph;
	
	
	public tapchi(int matl, String tennsx, int sobanph, int soph, int thangph) {
		super(matl, tennsx, sobanph);
		this.soph = soph;
		this.thangph = thangph;
	}
	public int getSoph() {
		return soph;
	}
	public void setSoph(int soph) {
		this.soph = soph;
	}
	public int getThangph() {
		return thangph;
	}
	public void setThangph(int thangph) {
		this.thangph = thangph;
	}
	@Override
	public String toString() {
		return "tamchi [soph=" + soph + ", thangph=" + thangph + ", matl=" + getMatl() + ", tennsx=" + getTennsx()+", sobanph=" + getSobanph()  +"]";
	}
	

}
