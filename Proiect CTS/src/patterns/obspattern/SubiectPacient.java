package patterns.obspattern;

import java.util.ArrayList;

public interface SubiectPacient {
	//lista ascultatori
	ArrayList<PacientListener> observerPacient = new ArrayList<>();
	public void addPacientListener(PacientListener p);
	//parcurge lista de observatori si va notifica in cazul in care se fac eo modificare
	public void notificaSchimbareStarePacient();
}
