package com.diardon.DemoBeanFactory;

public class Product
{
	private String name;
	private int code;
	private double price;

	public Product()
	{
		this("", 0, 0);
	}
	public Product(String name, int code, double price)
	{
		this.name = name;
		this.code = code;
		this.price = price;
	}
	@Override
	public String toString()
	{
		return "MyProduct [name=" + name + ", code=" + code + ", price=" + price + "]";
	}
}
