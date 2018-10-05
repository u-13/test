package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemCompleteAction extends ActionSupport implements SessionAware{
	private String itemName;
	private String itemPrice;
	private String count;
	private String pay;


	public Map<String,Object> session;
	private int id;
	private int totalCount;
	private int totalPrice;
	private String itemStock;
	private Collection<String> checkList;
	private String loginUserId;
	private String errorMessage;
	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();




//	商品購入情報登録完了メソッド
	@SuppressWarnings("unchecked")
	public String execute(){
		String result = ERROR;
		String loginUserId = session.get("login_user_id").toString();

		System.out.println(loginUserId);

		buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");
		for(int i=0; i < buyItemDTOList.size(); i++){
			id=buyItemDTOList.get(i).getId();
			int count = Integer.parseInt(buyItemDTOList.get(i).getCount());
			int price = Integer.parseInt(buyItemDTOList.get(i).getItemPrice());
			totalPrice = count * price;
			totalCount = count;
			String userMasterId = loginUserId;
			String pay = buyItemDTOList.get(i).getPay();

			BuyItemCompleteDAO dao = new BuyItemCompleteDAO();
			dao.buyItemInfo(id, price, userMasterId, totalPrice, totalCount, pay);
		}



//		id int not null primary key auto_increment,
//		item_transaction_id int,
//		total_price int,
//		total_count int,
//		user_master_id varchar(16),
//		pay varchar(30),
//		insert_date datetime,
//		delete_date datetime

		BuyItemCompleteDAO dao = new BuyItemCompleteDAO();

		System.out.println(itemName);
		System.out.println(itemPrice);
		System.out.println(count);
		System.out.println(pay);
		System.out.println(loginUserId);

		String[] itemNameList=itemName.split(", ", 0);
		String[] itemPriceList=itemPrice.split(", ", 0);
		String[] countList=count.split(", ", 0);

		int c=0;
		for(String check:checkList){
			for(int i=0; i<itemNameList.length;i++){
				BuyItemDTO dto = new BuyItemDTO();

				dto.setItemName(String.valueOf(itemNameList[i]));
				int price=Integer.parseInt(itemPriceList[i]);
			}
		}

		return result;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
