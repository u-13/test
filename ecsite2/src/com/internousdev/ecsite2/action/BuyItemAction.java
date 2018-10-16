package com.internousdev.ecsite2.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private Collection<String> checkList;
	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();
	private List<String> checkListErrorMessageList = new ArrayList<String>();
	private String count;
	private String pay;

	public String execute() {
		String result = SUCCESS;

		System.out.println("COUNT:" + count);
		System.out.println("PAY:" + pay);
		System.out.println(checkList);
		if(checkList == null) {
			checkListErrorMessageList.add("チェックされていません");
			buyItemDTOList = buyItemDAO.getBuyItemInfo();
			result = ERROR;
			return result;
		}

		String payment;
		if(pay.equals("1")) {
			payment = "現金払い";
			session.put("pay", payment);
		} else {
			payment = "クレジットカード払い";
			session.put("pay", payment);
		}

		return result;
	}

	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}

	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Collection<String> getCheckList() {
		return checkList;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

	public List<String> getCheckListErrorMessageList() {
		return checkListErrorMessageList;
	}

	public void setCheckListErrorMessageList(List<String> checkListErrorMessageList) {
		this.checkListErrorMessageList = checkListErrorMessageList;
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
