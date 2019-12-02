package com.test.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client1 {

	public static void main(String args[]) {
		List<Product> productsList = new ArrayList<>();
		
		productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));
        
        productsList.stream()
        			.filter(e -> e.getPrice() < 30000f)
        			.map(Product :: getPrice)
        			.collect(Collectors.toList())
        			.forEach(e-> System.out.println(e));;
        			
       System.out.println("********************************************************"); 			
       productsList.stream()
           			.filter(e -> e.getPrice() > 30000f)
           			.map(Product :: getPrice)
           			.collect(Collectors.toList())
           			.forEach(e-> System.out.println(e));;			
	
      System.out.println("********************************************************");
      
      List<Float> priceList = productsList.stream()
      			  .filter(e -> e.getPrice() > 20000f)
      			  .map(Product :: getPrice)
      			  .collect(Collectors.toList());
      
      System.out.println(priceList);
      
      System.out.println("********************************************************");
      
      
      
	}

}
