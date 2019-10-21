package huongdoituong;

public class hinhchunhat {
private int a;
private int b;
public hinhchunhat (int a, int b) {
	super();
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
public int dientich()
{

	return a*b;
	}
public int chuvi()
{return (a+b)*2;
	}
public String toString() {
	return "hinhchunhat [a=" + a + ", b=" + b + "]"+dientich()+chuvi();
}

}
