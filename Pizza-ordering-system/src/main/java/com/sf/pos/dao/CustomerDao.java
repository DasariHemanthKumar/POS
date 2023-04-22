package com.sf.pos.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sf.pos.bean.CartBean;
import com.sf.pos.bean.StoreBean;

@Repository

public class CustomerDao {
	   @Autowired
	    private SessionFactory sessionFactory;
		private Session session;
		private Transaction transaction;
		private Query<CartBean> c;

		
		public String  addCart(CartBean cartBean) {
			{
				System.out.println("Under Dao "+cartBean);
				if(cartBean!=null)
				{
					session=sessionFactory.openSession();
					transaction=session.beginTransaction();
					session.save(cartBean);
					transaction.commit();
					session.close();
					return "SUCCESS";
				}
				else if(cartBean==null)
				{
					return "ERROR";
				}
				else
				{
					return "FAIL";
				}
			}
		}
	
		public String updateCart(CartBean cartBean)
		{
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			if(cartBean!=null)
			{
			session.update(cartBean);

			transaction.commit();

			session.close();
			return "SUCCESS";
			}
			else if(cartBean==null)
			{
				return "FAIL";
			}
			else
			{
				return "ERROR";
			}
		}
	

		public ArrayList<CartBean> viewCart() {
			{
				session=sessionFactory.openSession();
				transaction=session.beginTransaction();
				c=session.createQuery("from CartBean");
				return (ArrayList<CartBean>) c.list();
			}

		}

}
