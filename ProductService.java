package com.jse.swing;

public class ProductService {
	private ProductBean [] products;
	public ProductService() {
		products = new ProductBean[10];
	}
	public void setProducts(ProductBean[]name) {
		this.products = products;
	}
	public ProductBean[] getProduct() {
		return products;
	}
}