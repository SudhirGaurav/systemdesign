package com.example.subject;

import com.example.observer.Obserevr;

public interface Subject {

	public void regster(Obserevr user);
	public void unRegister(Obserevr user);
	public String notification(String publishedMessage);
}
