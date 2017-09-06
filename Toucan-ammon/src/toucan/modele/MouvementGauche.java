package toucan.modele;

public class MouvementGauche extends Mouvement{

	public MouvementGauche(int a, int xDepart, int yDepart) {
		this.move = a;
		this.initX = xDepart;
		this.initY = yDepart;
	}
	
}
