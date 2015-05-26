package beans;

import java.util.List;

public class Medic {
	String nume, serie, specializare;
	List<Pacient> pacienti;
	
	public Medic(String nume, String serie, String specializare,
			List<Pacient> pacienti) {
		
		super();
		this.nume = nume;
		this.serie = serie;
		this.specializare = specializare;
		this.pacienti = pacienti;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getSpecializare() {
		return specializare;
	}

	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}

	public List<Pacient> getPacienti() {
		return pacienti;
	}

	public void setPacienti(List<Pacient> pacienti) {
		this.pacienti = pacienti;
	}

	@Override
	public String toString() {
		return "Medic [nume=" + nume + ", serie=" + serie + ", specializare="
				+ specializare + ", pacienti=" + pacienti + "]";
	}
	
	
	
	
	
}
