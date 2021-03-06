package com.internousdev.ecsite.dto;

public class BuyItemDTO {
	public String id;	// 商品ID
	public String itemName;	//商品名
	public String itemPrice;	// 商品価格
	private String count;	// 購入個数
	private String pay;	//	支払い方法

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}



}
