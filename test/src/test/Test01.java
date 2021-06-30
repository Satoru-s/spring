package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 泛型练习1
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(1);
		alist.add(2);
		alist.add((int) '3');
		alist.add((int) 'a');
		System.out.println(alist.toString());
		
		// 无编译器警告:
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		// 无强制转型:
		String first = list.get(0);
		String second = list.get(1);
		System.out.println(first);
		System.out.println(second);

		
	}
	
}
