package huongdoituong;

public class MAIN {

	public static void main(String[] args) {
		xe xe1	 =new xe("vison",45000000,"nhật","honda");
		System.out.println(xe1.toString());
		
		phanso phanso1 =new phanso(4,2,6,3);
		
		System.out.println(phanso1.tong());
		System.out.println(phanso1.hieu());
		System.out.println(phanso1.tich());
		System.out.println(phanso1.thuong());
		
		
	}

}
