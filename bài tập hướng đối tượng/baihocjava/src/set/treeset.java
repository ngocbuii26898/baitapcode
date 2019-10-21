package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {

			// khai báo
			Set<String> TreeSet = new TreeSet<String>();

			// cách thêm giá trị
			TreeSet.add("Java");
			TreeSet.add("C++");
			TreeSet.add("Java");
			TreeSet.add("PHP");

			// cách xóa phần tử
			TreeSet.remove("java");

			// List danh sách
			Iterator<String> ds = TreeSet.iterator();
			while (ds.hasNext()) {
				System.out.println(ds.next());
			}

		}
	}


