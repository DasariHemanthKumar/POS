package com.sf.pos.service;


	import java.util.ArrayList;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.sf.pos.bean.CredentialBean;
import com.sf.pos.bean.FoodBean;
import com.sf.pos.bean.StoreBean;
import com.sf.pos.dao.AdminstratorDao;
	import com.sf.pos.bean.OrderBean;


		@Service
		public class AdminstratorService {
		@Autowired
		private AdminstratorDao adao;
		public boolean authenticate(CredentialBean user) 
		{
		return  adao.authenticate(user);
		}
		public String addStore(StoreBean StoreBean) 
		{
			return adao.addStore(StoreBean);
		}
		public ArrayList<StoreBean> viewStore()
		{
			return adao.viewStore();
		}
		public String updateStore(StoreBean storeBean)
		{
			return adao.updateStore(storeBean);
		}
		public String removeStore(int storeId)
		{
			return adao.removeStore(storeId);
		}
		public StoreBean viewStoreById(int storeId)
		{
			return adao.viewStoreById(storeId);
		}
		
	
		public String addFood(FoodBean FoodBean) 
		{
		   return adao.addFood(FoodBean);
		}
		public ArrayList<FoodBean> viewFood()
		{
			return adao.viewFood();
		}
		public String updateFood(FoodBean FoodBean)
		{
			return adao.updateFood(FoodBean);
		}
		public String removeFood(int foodId)
		{
			return adao.removeFood(foodId);
		}
		
//		public String addOrder(OrderBean OrderBean) 
//		{
//		   return adao.addOrder(OrderBean);
//		}
		public String ChangeOrderStatus (int orderID)
		{
			return adao.ChangeOrderStatus(orderID);
		}
		
		
		}