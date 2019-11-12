package model;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum  //nije embeddable jer je ENUM!!!!!!!
public enum VrstaVozila {

	//sve se pise velikim slovom
	//enum se koristi samo tamo gde su konstante- unapred se sve podesava i nista sa strane ne moze da se menja
	//krece od NULE!!!!!!!!!!!!!!
	TERETNO, //0
	PUTNICKO,//1
	SUV,
	KARAVAN,
	TERENAC;	
	
	
	
	
}
