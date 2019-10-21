package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {

	
			// khai báo
			Set<String> Hashset = new HashSet<String>();

			// cách thêm giá trị
			Hashset.add("Java");
			Hashset.add("C++");
			Hashset.add("Java");
			Hashset.add("PHP");

			// cách xóa phần tử
			Hashset.remove("java");

			// List danh sách
			Iterator<String> ds = Hashset.iterator();
			while (ds.hasNext()) {
				System.out.println(ds.next());
			}
		}

	}



