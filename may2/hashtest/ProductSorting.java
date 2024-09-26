package com.may2.hashtest;



import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product> {
    private Integer productNumber;
    private String productName;
    private Double productPrice;

    public Product(Integer productNumber, String productName, Double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    @Override
    public int compareTo(Product otherProduct) {
        return this.productName.compareTo(otherProduct.getProductName());
    }

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
    
    
    
    
    
}

public class ProductSorting {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product(101, "Keyboard", 25.0));
        productList.add(new Product(102, "Mouse", 15.0));
        productList.add(new Product(103, "Monitor", 150.0));
        productList.add(new Product(104, "CPU", 300.0));
        
        
          Collections.sort(productList);
          System.out.println(productList);

    }}
















