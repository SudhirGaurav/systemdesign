package com.example.subject;

import java.util.ArrayList;
import java.util.List;

import com.example.observer.Obserevr;

public class Publisher implements Subject{

	List<Obserevr> observersUser = new ArrayList<>();
	@Override
	public void regster(Obserevr user) {
		if (user == null) {
			return;
		}
		
		observersUser.add(user);
		System.out.println("User is subscribed .. ");
		
	}

	@Override
	public void unRegister(Obserevr user) {
		if (user == null) {
			return;
		}
		observersUser.remove(user);
		System.out.println("User is Unsubscribed .. ");
	}

	@Override
	public String notification(String publishedMessage) {
		if(observersUser==null || observersUser.isEmpty()) return null;
		for(Obserevr user : observersUser) {
			user.publishedMessage(publishedMessage);
		}
		
		return null;
	}
	
	

}
