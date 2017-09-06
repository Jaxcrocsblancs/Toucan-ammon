package toucan.modele;

public class Cases {
	private LesMouvements mouvement;
	
	public Cases(int a, int b){
		mouvement = new LesMouvements(a, b);
	}

	public void gauche(int b) {
		mouvement.gauche(b);
	}

	public void haut(int b) {
		mouvement.haut(b);
	}

	public void droite(int b) {
		mouvement.droite(b);
	}

	public void bas(int b) {
		mouvement.bas(b);
	}

}
