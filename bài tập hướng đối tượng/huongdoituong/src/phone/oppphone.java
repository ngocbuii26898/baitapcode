package phone;

public class oppphone {
private String phone;
private String name;
public oppphone(String name, String phone) {
	super();
	this.name = name;
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "oppphone [phone=" + phone + ", name=" + name + "]";
}


}
