package com.sf.pos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.pos.bean.CartBean;
import com.sf.pos.bean.StoreBean;
import com.sf.pos.service.CustomerService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/Customer")
public class CustomerController {
	@Autowired
	private CustomerService cuser;
@PostMapping("/addcart")
public String meth1(@RequestBody CartBean cb)
{
	cuser.addCart(cb);
	return "<h1>Cart Added Successfully</h1>";
}
@GetMapping("/viewall")
public ArrayList<CartBean> meth2()
{
	return cuser.viewCart();
}
@PutMapping("/updatecart")
public String meth3(@RequestBody CartBean cb)
{
	cuser.updateCart(cb);
	return "<h1> Cart  Updated successfully</h1>";
}
	
	
	
	
	
	
	
	
}
