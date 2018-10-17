package com.internousdev.ecsite2.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemCompleteDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemCompleteAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private String errorMessage;

	@SuppressWarnings("unchecked")
	public String execute() throws SQLException {
		System.out.println("BuyItemCompleteAction");
		String result = ERROR;
		String loginUserId = session.get("login_user_id").toString();
		System.out.println("loginUserId:" + loginUserId);

		int insertCount = 0;
		List<BuyItemDTO> buyItemDTOList = (List<BuyItemDTO>) session.get("buyItemDTOList");
		for(int i = 0; i < buyItemDTOList.size(); i++) {
			String id = buyItemDTOList.get(i).getId();
			int count = Integer.parseInt(buyItemDTOList.get(i).getCount());
			int price = Integer.parseInt(buyItemDTOList.get(i).getItemPrice());
			int totalPrice = count * price;
			String userMasterId = loginUserId;
			String pay = buyItemDTOList.get(i).getPay();

			BuyItemCompleteDAO dao = new BuyItemCompleteDAO();

			System.out.println("--- ["+i+"] ---");
			System.out.println("          ID:" +id);
			System.out.println("   ITEMPRICE:" +totalPrice);
			System.out.println("       COUNT:" +count);
			System.out.println("USERMASTERID:" +loginUserId);
			System.out.println("         PAY:" +pay);
			System.out.println("------");

			insertCount += dao.buyItemInfo(id, userMasterId, totalPrice, count, pay);
		}

		if(insertCount == buyItemDTOList.size()){
			System.out.println("DBへ登録成功");
			result = SUCCESS;
		} else {
			System.out.println("DBへ登録失敗");
			result = ERROR;
		}

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
