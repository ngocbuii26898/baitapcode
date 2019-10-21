package map;

import java.util.Map;

public class map {

	
		public static void main(String[] args) {
			// khai báo
			Map<Integer, String> hm = new java.util.HashMap<Integer, String>();
			//java.util.HashMap<K, V> hn = new java.util.HashMap<K, V>();

			// thêm
			hm.put(100, "Amit");
			hm.put(101, "Vijay");
			hm.put(102, "Rahul");

			// sửa giống thêm
			hm.put(101, "mta");

			// xóa
			hm.remove(100);

			// list danh sách
			for (Map.Entry<Integer, String> m : hm.entrySet()) {
				System.out.println(m.getKey() + " " + m.getValue());
			}
		}

	
	}

