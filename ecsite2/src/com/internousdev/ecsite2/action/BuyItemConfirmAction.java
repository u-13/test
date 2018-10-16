package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private Collection<String> checkList;
	private String id;
	private String itemName;
	private String itemPrice;
	private String count;
	private String pay;

	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();

	public String execute() throws SQLException {
		System.out.println(checkList);
		System.out.println(id);
		System.out.println(itemName);
		System.out.println(itemPrice);
		System.out.println(count);
		System.out.println(pay);
		String[] idList = id.split(", ", 0);
		String[] itemNameList = itemName.split(", ", 0);
		String[] itemPriceList = itemPrice.split(", ", 0);
		String[] countList = count.split(", ", 0);
		for(String check:checkList) {
			System.out.println("CHECK ID>" + check);
			int c = Integer.parseInt(check)-1;
			System.out.println(idList[c]);
			System.out.println(itemNameList[c]);
			System.out.println(itemPriceList[c]);
			System.out.println(countList[c]);
			BuyItemDTO dto = new BuyItemDTO();
			dto.setId(idList[c].toString());
			dto.setItemName(itemNameList[c].toString());
			dto.setItemPrice(itemPriceList[c].toString());
			dto.setCount(countList[c].toString());

			if(pay.equals("1")) {
				pay = "現金払い";
			} else {
				pay = "クレジットカード払い";
			}

			dto.setPay(pay);
			buyItemDTOList.add(dto);
		}

		session.put("buyItemDTOList", buyItemDTOList);

		String result = SUCCESS;
		return result;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
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

	public Map<String, Object> getSession() {
		return session;
	}

	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
