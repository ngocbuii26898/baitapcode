package thuvien;

public class bao extends thuvien {

	
private int ngayph;


public bao(int matl, String tennsx, int sobanph, int ngayph) {
	super(matl, tennsx, sobanph);
	this.ngayph = ngayph;
}
public int getNgayph() {
	return ngayph;
}
public void setNgayph(int ngayph) {
	this.ngayph = ngayph;
}
@Override
public String toString() {
	return "bao [ngayph=" + ngayph +", matl=" + getMatl() + ", tennsx=" + getTennsx()+", sobanph=" + getSobanph()  +"]";
}

}
