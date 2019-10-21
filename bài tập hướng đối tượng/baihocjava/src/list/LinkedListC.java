package list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListC {

	public static void main(String[] args) {
		// cách khai báo linkedlist
		List<String> linkedList = new LinkedList<String>();

		// thêm giá trị vào linkedlist
		linkedList.add("mai tuấn anh");
		linkedList.add("mai tuấn thanh");

		// chèn giá trị vào linkedlist
		linkedList.set(0, "gái trị cần thay đổi");

		// xóa giá trị vào linkedlist
		linkedList.remove(0);

		// xuất arraylist ra màn hình
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
	}

}