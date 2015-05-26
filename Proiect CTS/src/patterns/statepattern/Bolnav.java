package patterns.statepattern;

public class Bolnav implements State {

	@Override
	public void afiseazaStare(StateContext stare) {
		System.out.println("Pacientul este internat");
		stare.schimbaStare(new SubTratament());
		
	}

}
