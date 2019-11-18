package com.falcon.user;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.falcon.user.User;
import com.falcon.user.HibernateUtil;


public class UserDao {

    public boolean saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.get(User.class, user.getUsername());
			if(session.get(User.class, user.getUsername()) != null) {
				return false;
			}
            session.save(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return true;
    }
    public boolean getUser(String username, String password) {

		Transaction transaction = null;
		User user = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			user = session.get(User.class, username);
			if(password.equals(user.getPassword())) {
				return true;
			}
			// commit transaction
			transaction.commit();
			
		} catch (Exception e) {
			System.out.println("Exception occred while reading user data: "
				      + e.getMessage());
		}
		return false;
	}
}