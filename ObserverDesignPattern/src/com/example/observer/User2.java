package com.example.observer;

public class User2 implements Obserevr {


	@Override
	public void publishedMessage(String notificationToSendToUser) {
		System.out.println("notification for "+this.getClass() + " is :"+notificationToSendToUser);
		
	}

}
