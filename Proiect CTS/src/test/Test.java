package test;

import java.util.ArrayList;

import patterns.singletonpattern.Controller;
import patterns.statepattern.Bolnav;
import patterns.statepattern.Sanatos;
import patterns.statepattern.State;
import beans.Medic;
import beans.Pacient;
import beans.SexPacient;

public class Test {
	
	public static void main (String args[]){
		
		Controller con = Controller.getInstance(); 
		
		Medic medic1 = new Medic ("Anghel Claudia", "789547", "cardiologie", null);
		Medic medic2 = new Medic("Borzan Iulia", "078651", "pediatrie", null);
		Medic medic3 = new Medic("Stan Cristian", "456858","medInterna", null);
		Medic medic4 = new Medic ("Stanca Robert", "5432", "ortopedie", null);
		
		
		State starePacient1 = new Bolnav();
		ArrayList<Medic> listaPacient1 = new ArrayList<>();
		listaPacient1.add(medic3);
		State starePacient2 = new Sanatos();
		ArrayList<Pacient> listaMedic3 = new ArrayList<>();
		
		Pacient pacient1 = new Pacient ("Chivu Alexandru", "1680021325789", starePacient1, listaPacient1, SexPacient.M);
		//pt Unit Test succes:
		//Pacient pacient1 = new Pacient ("Chivu Alexandru", "16800213257891", starePacient1, listaPacient1, SexPacient.M);
		Pacient pacient2 = new Pacient("Chirita Alin", "21457951247856", starePacient2, null, SexPacient.M);
		//pt Unit Test succes
		//Pacient pacient2 = new Pacient("Chirita Alin", "11457951247856", starePacient2, null, SexPacient.M);
		listaMedic3.add(pacient1);
		
		System.out.println("Medicii pacientului Chivu Alexandru sunt:");
		con.getAllMedici(listaPacient1);
		
		
		
	
		
		
	}
}
