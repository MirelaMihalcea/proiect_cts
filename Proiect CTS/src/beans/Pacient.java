package beans;

import java.util.ArrayList;
import java.util.List;



import patterns.statepattern.State;


public class Pacient {
	
	String nume, cnp;
	State stare;
	ArrayList<Medic> listaMedici;
	SexPacient sex;
	
		
	public SexPacient getSex() {
		return sex;
	}
	public void setSex(SexPacient sex) {
		this.sex = sex;
	}
	public Pacient(String nume, String cnp, State stare,
			ArrayList<Medic> listaMedici, SexPacient sex) {
		super();
		this.nume = nume;
		this.cnp = cnp;
		this.stare = stare;
		this.listaMedici = listaMedici;
		this.sex = sex;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}
	public State getStare() {
		return stare;
	}
	public void setStare(State stare) {
		this.stare = stare;
	}
	public ArrayList<Medic> getListaMedici() {
		return listaMedici;
	}
	public void setListaMedici(ArrayList<Medic> listaMedici) {
		this.listaMedici = listaMedici;
	}
	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", cnp=" + cnp + ", stare=" + stare
				+ ", listaMedici=" + listaMedici + ", sex=" + sex + "]";
	}

	

}
