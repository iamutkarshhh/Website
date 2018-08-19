package com.telusko.tusk.Dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.telusko.tusk.entity.Feedback;

@Component
public class FeedbackDao 
{
	@Autowired
	private SessionFactory sessionfactory;
	//We are nowhere creating sessionfactory object and we directly using its reference from its instance this is possible because Of Spring Framework it create sthe object for us  
	
	@Transactional
	public void addFeedback(Feedback fb) 
	{
		System.out.println("In add Feedback"+fb);
	    
		Session session =sessionfactory.getCurrentSession();
		session.save(fb);
	
	}
}
