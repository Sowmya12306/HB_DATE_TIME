package in.ineuron.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import in.ineuron.model.PersonDetails;
import in.ineuron.util.HibernateUtil;

public class SaveOperation {
	public static void main(String[] args) {
		Session session=null;
		boolean flag=false;
		SessionFactory sessionFactory = null;
		Transaction transaction = null;
		
		try {
			session = HibernateUtil.getSession();
			
			if(session!=null) {
				transaction = session.beginTransaction();
			}
			if(transaction!=null)
			{
				PersonDetails person = new PersonDetails();
				person.setName("Lokith");
				person.setAddress("Delhi");
				person.setDob(LocalDate.of(1985, 6, 10));
				person.setDom(LocalDateTime.of(2034, 4, 17, 3, 19));
				person.setDoj(LocalTime.of(8, 45));
				session.save(person);
				
			flag = true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			if(flag ==true) {
				transaction.commit(); // stored in DB through ORM
			}
			else transaction.rollback();
			HibernateUtil.closeSession(session);
		}
		
	}

}
