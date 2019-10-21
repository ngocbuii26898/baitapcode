package HCNPackage;

public class Hinhchunhat implements HCNInterface {
private int chieudai;
private int chieurong;
	@Override
	public int DientichHCN() {
		
		return chieudai*chieurong;
	}

	@Override
	public int getChieuDai() {
		
		return chieudai;
	}

	@Override
	public int getChieuRong() {
		
		return chieurong;
	}

	@Override
	public void setDaiRong(int cd, int cr) {
		this.chieudai=cd;
		this.chieurong=cr;
		
	}

}
