package com.store.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.store.model.Category;
import com.store.model.Product;

public class ProductUtil {

	// method for sending the pre-loaded list
	public static List<Product> loadExistingProductList() throws ParseException {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("1111", "ASUS", 100000, 135000,
				Category.LAPTOP, 28, 5));
		productList.add(new Product("1112", "Dell", 70000, 85000,
				Category.LAPTOP, 28, 15));
		productList.add(new Product("1113", "OnePlus", 800, 1800,
				Category.WATCH, 28, 50));
		productList.add(new Product("1114", "Canon", 50000, 65000,
				Category.CAMERA, 28, 25));
		productList.add(new Product("1115", "Nikkon", 55000, 70000,
				Category.CAMERA, 28, 20));

		return productList;
	}

	public static void displayProductDetails(Product product) {
		System.out.println(String.format("%-18s%-30s%-20s%10s%20s%20s%20s",
				product.getItemCode(), product.getItemName(),
				product.getBuyingPrice(), product.getSellingPrice(),
				product.getTax() + "%", product.getCategory(),
				product.getQuantity()));
	}
}
