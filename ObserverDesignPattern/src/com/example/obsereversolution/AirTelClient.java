package com.example.obsereversolution;

import com.example.observer.User1;
import com.example.subject.Publisher;
import com.example.subject.Subject;

public class AirTelClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 user1 = new User1(); // u can add one user class and make more instance 
		
		Subject subject = new Publisher();
		subject.regster(user1);
		subject.notification("U got new message... ");

	}

}
