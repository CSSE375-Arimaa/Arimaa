package game;
import java.awt.Image;

public class Piece {
	private PieceType type;
	private Image img;
	
	public enum PieceType{
		Elephant, Camel, Horse, Dog, Cat, Rabbit
	}
	
	public Piece(PieceType t, Image i){
		this.type = t;
		this.img = i;
	}

	public PieceType getType() {
		return this.type;
	}

	public void setType(PieceType type) {
		this.type = type;
	}

	public Image getImg() {
		return this.img;
	}

	public void setImg(Image img) {
		
	}
}
