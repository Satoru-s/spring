package test;

import java.lang.reflect.Field;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws Exception {
        Object p = new Person("Xiao Ming");
        Class c = p.getClass();
        Field[] f1 = c.getDeclaredFields();
        for (int i = 0; i < f1.length; i++) {
			System.out.println(f1[i]);
		}
        Object value1 = f1[1].get(p);
        System.out.println("value1:"+value1);
        Field f = c.getDeclaredField("name");
        f.setAccessible(true); 
        Object value = f.get(p);
        System.out.println(value); // "Xiao Ming"
        
    }
}

class Person {
    private String name;
    public String gentle;
    public int age = 10;
    public Person(String name) {
        this.name = name;
    }
}
