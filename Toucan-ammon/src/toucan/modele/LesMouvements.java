package toucan.modele;

import java.util.ArrayList;

public class LesMouvements {
	private int xinit;
	private int yinit;
	private ArrayList<Mouvement> listeMouvement;
	
	public LesMouvements(int a, int b) {
		this.xinit = a;
		this.yinit = b;
		listeMouvement = new ArrayList<Mouvement>();
	}
	
	public void gauche(int a){
		Mouvement m = new MouvementGauche(a, this.xDepart(), this.yDepart());
		m.mouvement();
		listeMouvement.add(m);
	}
	
	public void droite(int a){
		
	}

	public void haut(int a) {
		
	}

	public void bas(int a) {
		
	}
	
	private int xDepart() {
		if(listeMouvement.isEmpty()){
			return xinit;
		}
		return listeMouvement.get(listeMouvement.size()-1).getEndX();
	}

	private int yDepart() {
		if(listeMouvement.isEmpty()){
			return yinit;
		}
		return listeMouvement.get(listeMouvement.size()-1).getEndY();
	}
}
