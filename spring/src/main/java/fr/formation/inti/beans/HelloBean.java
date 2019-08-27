package fr.formation.inti.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	
	
	@Autowired
	@Qualifier("mess")
	MessageBean m;
	
	
	public MessageBean getM() {
		return m;
	}

	public void setM(MessageBean m) {
		this.m = m;
	}

	public HelloBean() {
		System.out.println("hellobean par default");
	}
	
	public HelloBean(int x ) {
		System.out.println("creation hellobean" +x);
	}
	
	
	
	public void hello() {
		
		System.out.println("bonjour");
		m.affiche();
	}

}
