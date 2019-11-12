package model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

	
	@Id  // means primary key and not null
	@GeneratedValue(strategy=GenerationType.IDENTITY)//enum je identity
	private int idCar;
	private String marka;
	private String model;
	private int godiste;
	private double cena;
	private boolean registracija;
	@Enumerated //Zato sto je u vrsti vozila definisan enum
	private VrstaVozila VrstaVozila;
	public Car() {}
	
	public Car(String marka, String model, int godiste, double cena, boolean registracija,VrstaVozila VrstaVozila ) {
		this.marka=marka;
		this.model=model;
		this.godiste=godiste;
		this.cena=cena;
		this.registracija=registracija;
		this.VrstaVozila=VrstaVozila;
	}
	
	public int getIdCar() {
		return idCar;
	}

	public VrstaVozila getVrstaVozila() {
		return VrstaVozila;
	}

	public void setVrstaVozila(VrstaVozila vrstaVozila) {
		VrstaVozila = vrstaVozila;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}
	
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) {
		this.cena = cena;
	}
	public boolean isRegistracija() {
		return registracija;
	}
	public void setRegistracija(boolean registracija) {
		this.registracija = registracija;
	}
		
}
