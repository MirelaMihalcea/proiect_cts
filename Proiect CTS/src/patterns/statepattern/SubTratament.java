package patterns.statepattern;

public class SubTratament implements State {

	@Override
	public void afiseazaStare(StateContext stare) {
		System.out.println("Pacientul este externat, dar se afla sub tratament");
		stare.schimbaStare(new Sanatos());
		
	}

}
