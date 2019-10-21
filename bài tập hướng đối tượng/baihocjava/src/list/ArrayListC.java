package list;



import java.util.ArrayList;
import java.util.List;

public class ArrayListC {

	public static void main(String[] args) {
		// khai báo
		List<String> arraylist = new ArrayList<String>();
		
		// thêm giá trị vào arraylist
		arraylist.add("giá trị");
		arraylist.add("giá trị 1");
		
		// sửa giá trị trong arraylist
		// gồm 2 thuộc tính cần điền vào
		// 1. vị trí cần thay đổi
		// 2. giá trị cần thây đổi
		arraylist.set(0, "giá trị cần thây đổi");
		
		// xóa giá trị trong arraylist
		// nhập vị trí cần xóa trong arraylist
		arraylist.remove(0);
		
		// xuất arraylist ra màn hình
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		
		// kiểm tra arraylist này có phần từ hay không (true/ false)
		boolean check = arraylist.contains("giá trị 1");
		if(check == true) {
			// đúng trả về true
			System.out.println(check);
		} else {
			// sai trả về false
			System.out.println(check);
		}
	}

}
