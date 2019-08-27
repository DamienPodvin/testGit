package fr.formation.inti.beans;

import org.springframework.stereotype.Component;

@Component(value ="mess")
public class MessageBean {

	private String mess;

	public String getMess() {
		return mess;
	}

	public void setMess(String mess) {
		this.mess = mess;
	}

	public MessageBean() {
		System.out.println("creation par defaut du message");
	}

	static MessageBean createInstance(String y) {
		MessageBean messBean = new MessageBean();
		System.out.println("creation message");
		messBean.setMess(y);
		return messBean;
	}

	public void affiche() {
		System.out.println("je suis un message : " + mess);
	}
}
