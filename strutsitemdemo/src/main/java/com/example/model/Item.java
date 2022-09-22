package com.example.model;

public class Item {
  private String itemName;
  private double price;
  private int quantity;
  private String type;
  private String quisine;
  private String hotelName;
  private long contactno;
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getQuisine() {
	return quisine;
}
public void setQuisine(String quisine) {
	this.quisine = quisine;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public long getContactno() {
	return contactno;
}
public void setContactno(long contactno) {
	this.contactno = contactno;
}
@Override
public String toString() {
	return "Item [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + ", type=" + type
			+ ", quisine=" + quisine + ", hotelName=" + hotelName + ", contactno=" + contactno + "]";
}
  
  
}
