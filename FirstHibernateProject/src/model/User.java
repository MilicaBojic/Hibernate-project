package model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="korisnik")
public class User {
	
	@Id
	@GeneratedValue  (strategy = GenerationType.IDENTITY)
	private int idUser;
	//promena imena kolone SAMO u tabeli---- PAZI STA TI JE DDL ,A STA TI JE DML JER AKO JE DML ONDA IDE NA UPDATE!!!
	@Column(name="user_name")
	private String userName;
	private String password;
	private double novcanik;
	
	@Embedded // zato sto je value object
	private VisitCard visitCard; 
	@OneToOne //ovime smo povezali visit card i car
	private Car auto;
	
	public Car getAuto() {
		return auto;
	}
	public void setAuto(Car auto) {
		this.auto = auto;
	}
	
	public VisitCard getVisitCard() {
		return visitCard;
	}
	
	public void setVisitCard(VisitCard visitCard) {
		this.visitCard = visitCard;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getNovcanik() {
		return novcanik;
	}
	public void setNovcanik(double novcanik) {
		this.novcanik = novcanik;
	}
	
	
	/* da bi se povezao user sa car klasom treba instancirati oba objekta i setovati potrebne podatke i onda se 
	 * samo pozizva ono sto nam treba
	 * Cim se povezu , ono sto je bilo value object prestaje da bude to i postaje entitet
	 */
	
	
	
	
	
	
	
	
	
}
