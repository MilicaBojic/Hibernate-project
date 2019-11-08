package automobili;

import controller.HibernateDAO;
import model.Car;

public class GlavnaHibernateKlassa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HibernateDAO dao= new HibernateDAO();
			
	 //  Car car= new Car("jaguar", "x-type", 2015, 0.1, true);	
	//dao.snimiAutoUBazu(car);
		
		
	/*	Car car= dao.vratiAuto(2);
		//dao.updateCarPrice(car.getIdCar(),180000);
		System.out.println ("Uzeo si auto "+ car.getMarka()+ " "+ car.getModel());
		System.out.println (" NOVA CENA je" +car.getCena());
		
		*/
		
		if (dao.deleteCar(2)) {
			System.out.println ("OBRISAN");
		}
			else {
				System.out.println ("Nije OBRISAN");
			}
		
//<!-- Echo all executed SQL to stdout -->
//<property name="show_sql">true</property> zato ispisuje u konzoli onaj crni upit; ako nije potrebno,stavi se false u xml

				
	}}
