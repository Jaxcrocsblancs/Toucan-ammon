package toucan.modele;

public abstract class Mouvement {
	protected int initX;
	protected int initY;
	protected int move;
	protected int endX;
	protected int endY;
	
	
	public int getInitX() {
		return initX;
	}
	
	public void setInitX(int initX) {
		this.initX = initX;
	}
	
	public int getInitY() {
		return initY;
	}
	
	public void setInitY(int initY) {
		this.initY = initY;
	}
	
	public int getMove() {
		return move;
	}
	
	public void setMove(int move) {
		this.move = move;
	}
	
	public int getEndX() {
		return endX;
	}
	
	public void setEndX(int endX) {
		this.endX = endX;
	}
	
	public int getEndY() {
		return endY;
	}
	
	public void setEndY(int endY) {
		this.endY = endY;
	}

	public void mouvement() {
		
	}	
	
}
