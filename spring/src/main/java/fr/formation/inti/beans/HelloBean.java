package fr.formation.inti.beans;



public class HelloBean {
	
	MessageBean m;
	
	
	public MessageBean getM() {
		return m;
	}

	public void setM(MessageBean m) {
		this.m = m;
	}

	public HelloBean() {
		System.out.println("par default");
	}
	
	public HelloBean(int x ) {
		System.out.println("le chiffre est" +x);
	}
	
	public void hello() {
		
		System.out.println("bonjour");
		m.affiche();
	}

}
