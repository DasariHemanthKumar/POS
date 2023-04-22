package com.sf.pos.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sf.pos.bean.CartBean;
import com.sf.pos.bean.StoreBean;
import com.sf.pos.dao.CustomerDao;


	@Service
public class CustomerService {

	@Autowired
	private CustomerDao cdao;
	public String addCart(CartBean CartBean) 
	{
		return cdao.addCart(CartBean);
	}
	public ArrayList<CartBean> viewCart()
	{
		return cdao.viewCart();
	}
	public String updateCart(CartBean CartBean)
	{
		return cdao.updateCart(CartBean);
	}
	
	
	
	
	
}
