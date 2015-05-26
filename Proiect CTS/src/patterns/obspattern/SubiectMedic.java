package patterns.obspattern;

import java.util.ArrayList;

public interface SubiectMedic {
	
	//Are o lista de ascultatori
	ArrayList<MedicListener> observerMedic = new ArrayList<MedicListener>();
	public void addMedicListener(MedicListener ml);
	//parcurge o lista de observatori si va notifica in cazul in care se face o schimbare;
	public void notificaModificareMedic();

}
