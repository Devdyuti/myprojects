package org.dev.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Product {  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
}
class MyComprator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		Integer id1=o1.id;
		Integer id2=o2.id;
		return id1.compareTo(id2);
	}
	
}
public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		
        list.add(new Product(1,"HP Laptop",25000f));  
        list.add(new Product(3,"Keyboard",300f));  
        list.add(new Product(2,"Dell Mouse",150f));
        
        
//        Collections.sort(list, new MyComprator());
//        
//        for (Product product : list) {
//        	System.out.println(product.id);
//		}
        
        Collections.sort(list, (p1,p2)->{
        	return p1.name.compareTo(p2.name);
        });
        for (Product product : list) {
			System.out.println(product.id+" "+product.name+" "+product.price);
		}
        
       // System.out.println(list);
		
	}
	
}
