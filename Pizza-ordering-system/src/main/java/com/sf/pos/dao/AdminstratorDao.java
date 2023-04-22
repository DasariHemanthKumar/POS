package com.sf.pos.dao;


	import java.util.ArrayList;
	
	
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

import com.sf.pos.bean.OrderBean;
import com.sf.pos.bean.CredentialBean;
import com.sf.pos.bean.FoodBean;
	import com.sf.pos.bean.StoreBean;


	@Repository
		public class AdminstratorDao {
		    @Autowired
		    private SessionFactory sessionFactory;
			private Session session;
			private Transaction transaction;
			private Query<StoreBean> q;
			private Query<FoodBean> q1;
            private Query<OrderBean> o;
			private Query<CredentialBean>q3;
            
            
			public boolean authenticate(CredentialBean user) 
			{
				System.out.println("Under Dao "+user.getUserID()+" "+user.getPassword());
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				Query q3=session.createQuery("from CredentialBean where userID=:uid and Password=:pss");
				q3.setParameter("uid", user.getUserID());
				q3.setParameter("pss", user.getPassword());
				ArrayList<CredentialBean> al=(ArrayList<CredentialBean>) q3.getResultList();
				int count=0;
				for(CredentialBean cb:al)
				{
					
					if((cb.getUserID().equals(user.getUserID()))&&(cb.getPassword().equals(user.getPassword())))
					{
						System.out.println("Record is  present"+cb.getUserID()+" "+cb.getPassword());
						count++;
						if(count>0)
						{
				return true;
						}
						else
						{
							return false;
						}
					}
				}
				return false;
				
			}
            
            
			public String  addStore(StoreBean storebean) {
				{
					System.out.println("Under Dao "+storebean);
					if(storebean!=null)
					{
						session=sessionFactory.openSession();
						transaction=session.beginTransaction();
						session.save(storebean);
						transaction.commit();
						session.close();
						return "SUCCESS";
					}
					else if(storebean==null)
					{
						return "ERROR";
					}
					else
					{
						return "FAIL";
					}
				}
			}
			
			public String updateStore(StoreBean storeBean)
			{
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				if(storeBean!=null)
				{
				session.update(storeBean);

				transaction.commit();

				session.close();
				return "SUCCESS";
				}
				else if(storeBean==null)
				{
					return "FAIL";
				}
				else
				{
					return "ERROR";
				}
			}
			public String removeStore(int storeId)
			{
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				if(storeId>=0)
				{
				Query q1=session.createQuery("delete from storeBean where storeID=:eid");
				q1.setParameter("eid", storeId);
				q1.executeUpdate();
		transaction.commit();
		session.close();
				return "SUCCESS";
				}
				else
				{
					return "FAIL";
				}
			}

			

			public ArrayList<StoreBean> viewStore() {
				{
					session=sessionFactory.openSession();
					transaction=session.beginTransaction();
					q=session.createQuery("from StoreBean");
					return (ArrayList<StoreBean>) q.list();
				}

			}

			public StoreBean viewStoreById(int storeId) {
				return  null;

			}
			
			
			
			public String  addFood(FoodBean foodbean) {
				{
					System.out.println("Under Dao "+foodbean);
					if(foodbean!=null)
					{
						session=sessionFactory.openSession();
						transaction=session.beginTransaction();
						session.save(foodbean);
						transaction.commit();
						session.close();
						return "SUCCESS";
					}
					else if(foodbean==null)
					{
						return "ERROR";
					}
					else
					{
						return "FAIL";
					}
				}
			}
			public ArrayList<FoodBean> viewFood() {
				{
					session=sessionFactory.openSession();
					transaction=session.beginTransaction();
					q1=session.createQuery("from FoodBean");
					return (ArrayList<FoodBean>) q1.list();
				}

			}
			public String updateFood(FoodBean FoodBean)
			{
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				if(FoodBean!=null)
				{
				session.update(FoodBean);

				transaction.commit();

				session.close();
				return "SUCCESS";
				}
				else if(FoodBean==null)
				{
					return "FAIL";
				}
				else
				{
					return "ERROR";
				}
			}
			public String removeFood(int foodId)
			{
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				if(foodId>=0)
				{
				Query q1=session.createQuery("delete from FoodBean where foodID=:fid");
				q1.setParameter("fid", foodId);
				q1.executeUpdate();
		transaction.commit();
		session.close();
				return "SUCCESS";
				}
				else
				{
					return "FAIL";
				}
			}
			
			
//			public String  addOrder(OrderBean orderbean) {
//				{
//					System.out.println("Under Dao "+orderbean);
//					if(orderbean!=null)
//					{
//						session=sessionFactory.openSession();
//						transaction=session.beginTransaction();
//						session.save(orderbean);
//						transaction.commit();
//						session.close();
//						return "SUCCESS";
//					}
//					else
//					{
//						return "FAIL";
//					}
//				}
//			}

			public String ChangeOrderStatus(int orderID) {
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				if(orderID>=0)
				{
				Query o=session.createQuery("delete from OrderBean where orderID=:oid");
				o.setParameter("oid", orderID);
				o.executeUpdate();
		transaction.commit();
		session.close();
				return "SUCCESS";
				}
				else
				{
					return "FAIL";
				}
			}
			
			
			
	}
			

