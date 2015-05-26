package patterns.singletonpattern;

import java.util.ArrayList;
import java.util.List;

import beans.Medic;
import beans.Pacient;
import patterns.obspattern.MedicListener;
import patterns.obspattern.PacientListener;
import patterns.obspattern.SubiectMedic;
import patterns.obspattern.SubiectPacient;

public class Controller implements SubiectMedic, SubiectPacient {
	
	private static Controller singleton = null;
	
	private Controller(){}
	
	public static Controller getInstance(){
		if(singleton == null){
			singleton = new Controller();
		}
		return singleton;
		
	}
	
	public void adaugaPacient(ArrayList<Pacient> listaPacienti, Pacient pacient){
		listaPacienti.add(pacient);
	}
	
	public void adaugaMedic(ArrayList<Medic> listaMedici, Medic medic){
		listaMedici.add(medic);
	}
	
	public void getAllMedici(ArrayList<Medic> medici){
		for(Medic medic: medici)
			System.out.println(medic.getNume() + medic.getSpecializare());
	}
	
	public void getAllPacienti(ArrayList<Pacient> pacienti){
		for(Pacient pacient : pacienti)
			System.out.println(pacient.getNume() + pacient.getStare());
		
	}

	@Override
	public void addPacientListener(PacientListener p) {
		observerPacient.add(p);
		
	}

	@Override
	public void notificaSchimbareStarePacient() {
		for(PacientListener p: observerPacient){
			p.pacientModificat();
		}
		
	}

	@Override
	public void addMedicListener(MedicListener ml) {
		observerMedic.add(ml);
		
	}

	@Override
	public void notificaModificareMedic() {
		for(MedicListener ml : observerMedic){
			ml.medicModificat();
		}
		
	}
	
}
