package com.sf.pos.controller;

	import java.util.ArrayList;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sf.pos.bean.CredentialBean;
import com.sf.pos.bean.FoodBean;
import com.sf.pos.bean.StoreBean;
import com.sf.pos.bean.OrderBean;
import com.sf.pos.service.AdminstratorService;

    @RestController
		@CrossOrigin(origins = "*")
			@RequestMapping("/admin")
			public class AdminstratorController {
				@Autowired
				private AdminstratorService adserv;
				@GetMapping("/selectUser/{userID}/{Password}")
				@ResponseBody
				public boolean auth(@PathVariable String userID,@PathVariable String Password)
			{
					System.out.println(userID+" "+Password);
				
					CredentialBean cb=new CredentialBean();
					cb.setUserID(userID);
					cb.setPassword(Password);
					System.out.println(adserv.authenticate(cb));;
					return adserv.authenticate(cb);
				}
			@PostMapping("/addstore")
			public String meth1(@RequestBody StoreBean sb)
			{
				adserv.addStore(sb);
				return "<h1>Store Added Successfully</h1>";
			}
			@GetMapping("/selectall")
			public ArrayList<StoreBean> meth2()
			{
				return adserv.viewStore();
			}
			@PutMapping("/updatestore")
			public String meth3(@RequestBody StoreBean sb)
			{
				adserv.updateStore(sb);
				return "<h1> Store  Updated successfully</h1>";
			}
			@GetMapping("/stored/{id}")
			public StoreBean meth4(@PathVariable(value = "id") int storeId)
			{
				return adserv.viewStoreById(storeId);
				
			}
			@DeleteMapping("/deletestore/{id}")
			public String meth5(@PathVariable(value="id") int storeId)
			{
				return "<h1>"+adserv.removeStore(storeId)+" record deleted successfully</h1>";
			}
			
			@PostMapping("/addfood")
			public String meth6(@RequestBody FoodBean fb)
			{
				adserv.addFood(fb);
				return "<h1>Food Added Successfully</h1>";
			}
			@GetMapping("/viewall")
			public ArrayList<FoodBean> meth7()
			{
				return adserv.viewFood();
			}
			@PutMapping("/updatefood")
			public String meth8(@RequestBody FoodBean fb)
			{
				adserv.updateFood(fb);
				return "<h1> Food  Updated successfully</h1>";
			}
			@DeleteMapping("/deletefood/{id}")
			public String meth9(@PathVariable(value="id") int foodId)
			{
				return "<h1>"+adserv.removeFood(foodId)+" record deleted successfully</h1>";
			}
			//@PostMapping("/addorder")
//			public String meth10(@RequestBody OrderBean ob)
//			{
//				adserv.addOrder(ob);
//				return "<h1>Order Added Successfully</h1>";
//			}
			
			
			@PutMapping("/updatestatus/{id}")
				public String meth10(@PathVariable(value="id") int orderID)
				{
					return "<h1>"+adserv.ChangeOrderStatus(orderID)+" record Stastus successfully</h1>";
				}
			}
			
			


