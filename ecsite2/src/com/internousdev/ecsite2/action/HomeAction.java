package com.internousdev.ecsite2.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite2.dao.BuyItemDAO;
import com.internousdev.ecsite2.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private List<BuyItemDTO> buyItemDTOList = new ArrayList<BuyItemDTO>();
	public String execute() {
		String result = "login";
		if(session.containsKey("login_user_id")) {
			BuyItemDAO buyItemDAO = new BuyItemDAO();
			buyItemDTOList = buyItemDAO.getBuyItemInfo();
			result = SUCCESS;
		}

		return result;
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
	public Map<String, Object> getSession() {
		return this.session;
	}
}
