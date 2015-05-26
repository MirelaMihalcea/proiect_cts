package patterns.statepattern;

public class Sanatos implements State {

	@Override
	public void afiseazaStare(StateContext stare) {
		System.out.println("Pacientul este sanatos");
		stare.schimbaStare(new Bolnav());
	}

}
