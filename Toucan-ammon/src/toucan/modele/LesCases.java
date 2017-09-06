package toucan.modele;

public class LesCases {
	
	private Cases[] tabCases;
	
	public LesCases(int... tab){
		tabCases = new Cases[tab.length/2];
		
		for(int i = 0; i<tab.length/2; i++){
			Cases c = new Cases(i*2,i*2+1);
			tabCases[i] = c;
		}
	}
	
	void gauche(int a, int b){
		tabCases[a].gauche(b);
	}
	
	void haut(int a, int b){
		tabCases[a].haut(b);
	}
	
	void droite(int a, int b){
		tabCases[a].droite(b);
	}
	
	void bas(int a, int b){
		tabCases[a].bas(b);
	}
}
