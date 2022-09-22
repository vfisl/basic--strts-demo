package com.example.actions;

import com.example.model.Item;
import com.opensymphony.xwork2.ActionSupport;

public class ItemAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Item item;
	

	public Item getItem() {
		return item;
	}


	public void setItem(Item item) {
		this.item = item;
	}


	@Override
	public String execute() throws Exception {
		if(item.getPrice()==200)
			return SUCCESS;
		return ERROR;
	}
	

}
