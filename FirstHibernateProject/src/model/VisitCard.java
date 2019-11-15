package model;

import javax.persistence.Embeddable;//slozeni tip podatka

@Embeddable    // za value object - nosi podatke ali nije entitet, cim ne treba da pravimo tabelu u bazi koristi se ovo i ono nije za entitete realnog sveta
//ako se ne stavi nece moci da ga mapira
//cim imas slozeni tip moras da stavis anotaciju da bi on znao sta gde da mapira
//ako nije entitet onda je embedded
public class VisitCard {
	
	//value object 
	
	
	private String ime;
	private String brojTelefona;
	private String email;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getBrojTelefona() {
		return brojTelefona;
	}
	public void setBrojTelefona(String brojTelefona) {
		this.brojTelefona = brojTelefona;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	

}
