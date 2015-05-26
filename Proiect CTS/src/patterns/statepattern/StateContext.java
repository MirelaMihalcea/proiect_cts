package patterns.statepattern;

public class StateContext {
	private State stareCurenta;
	
	public StateContext(){
		stareCurenta = new Bolnav();
	}
	
	public void schimbaStare(State stareNoua){
		this.stareCurenta = stareNoua;
	}
	
	public void afiseazaStare(){
		this.stareCurenta.afiseazaStare(this);
	}
}
