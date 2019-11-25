package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import model.Car;
import model.User;

public class HibernateDAO {
	
	
	//OVDE SE PISU SVE METODE 
	
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
	//metod za ubacivanje automobila u bazu 
	//boolean zbog kontrole da li je stavio ili nije auto u bazu
	
	public boolean snimiAutoUBazu (Car car) {
	
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		
		try {
			sesija.save(car);
			sesija.getTransaction().commit();  
			return true;
		}catch (Exception e) {
			sesija.getTransaction().rollback();
			return false;
		}
			
	finally {
	
			sesija.close();
	}}
			//select
			
			public Car vratiAuto (int id) {
									
					Session sesija = factory.openSession();
					sesija.beginTransaction();
					Car car= null;
					try {
						
				car=sesija.get(Car.class, id);
				sesija.getTransaction().commit();  
				return car; //ako nema car=sesija itd onda ce stalno da vraca null
				
					}catch (Exception e) {
						sesija.getTransaction().rollback();
						return null;
					}
						
				finally {
				
						sesija.close();
				}}
			
			
			//update
			
			
			public void updateCarPrice (int id, double novaCena) {
				//prvo se kupi objekat iz baze pa se radi onda update
				
				Session sesija = factory.openSession();
				sesija.beginTransaction();
				Car car= null;
				
				try {
					
			car=sesija.get(Car.class, id);
			car.setCena(novaCena);
			sesija.update(car); //mooglo je i save or update i tada ako nema tog ida on pamti kao novo,a ako ima onda samo radi update
			sesija.getTransaction().commit();  
						
				}catch (Exception e) {
					sesija.getTransaction().rollback();
				 
				}
					
			finally {
			
					sesija.close();}}
			
	public boolean deleteCar (int id) {
				
				Session sesija = factory.openSession();
				sesija.beginTransaction();
				Car car= null;
				//na osnovu objekta tacno zna sta treba da obrise; brise citav objekat
				try {
					
			car=sesija.get(Car.class, id);
			
			sesija.delete(car); 
			sesija.getTransaction().commit();  
						return true;
				}catch (Exception e) {
					sesija.getTransaction().rollback();
				 return false;
				}
					
			finally {
			
					sesija.close();
			}}
	public boolean snimiUseraUBazu (User user) {
		
		Session sesija = factory.openSession();
		sesija.beginTransaction();
		
		try {
			sesija.save(user);
			sesija.getTransaction().commit();  
			return true;
		}catch (Exception e) {
			sesija.getTransaction().rollback();
			return false;
		}
			
	finally {
	
			sesija.close();
	}}
			
		public  void linkujUseraIAuto (int IDCar, int IDUser) {
		
			
		Session sesija = factory.openSession();
		sesija.beginTransaction();
			Car car;
  		        User user;
		
		try {
			//izvuci
			Car car=sesija.get(Car.class, IDCar);
			User user=sesija.get(User.class, IDUser);
			//linkuj
			car.setKorisnik(user);
			user.setAuto(car);
			//apdejtuj
			sesija.update(user);
			sesija.update(car);
			
			sesija.getTransaction().commit();  
			
		}catch (Exception e) {
			sesija.getTransaction().rollback();
		}
			
	finally {
	
			sesija.close();
	}}
			
		}
			 
			
			
	
