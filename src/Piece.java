/*
Data Structure for a Reversi Piece.

Probably going to scratch this file entirely in favor of a matrix data structure.
*/
public class Piece{

    enum Color{
        WHITE,
        BLACK
    }

    public Color color;
    //Determines if a piece is on the edge of the board or not
    int position;
    //Keeps track of all the surrounding pieces
	public Piece right = null;
	public Piece left = null;
	public Piece above = null;
	public Piece below = null;
	public Piece DiagTopRight = null;
	public Piece DiagTopLeft = null;
	public Piece DiagBottomRight = null;
	public Piece DiagBottomLeft = null;

    public Piece(Color color, Position position){
        this.color = color;
        this.position = position;
    }

    //Setters and Getters

    public Color getColor(){
        return this.data;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public int getPosition(){
        return this.position;
    }

    public void setPosition(int position){
        this.position = position;
    }

    public Piece getRight(){
        return this.right;
    }

    public void setRight(Piece right){
        this.right = right;
    }

    public Piece getLeft(){
        return this.left;
    }

    public void setLeft(Piece left){
        this.left = left;
    }

    public Piece getTop(){
        return this.top;
    }

    public void setTop(Piece top){
        this.top = top;
    }

    public Piece getBottom(){
        this.bottom = bottom;
    }

    public void setBottom(Piece bottom){
        this.bottom = bottom;
    }

    public Piece getDiagTopLeft(){
        return this.DiagTopLeft;
    }

    public void setDiagTopLeft(Piece diagTopLeft){
        this.DiagTopLeft = diagTopLeft;
    }

    public Piece getDiagTopRight(){
        return this.DiagTopRight;
    }

    public void setDiagTopRight(Piece diagTopRight){
        this.DiagTopRight = diagTopRight;
    }

    public Piece getDiagBottomLeft(){
        return this.DiagBottomLeft;
    }

    public void setDiagBottomLeft(Piece diagBottomLeft){
        this.DiagBottomLeft = diagBottomLeft;
    }

    public Piece getDiagBottomRight(){
        return this.DiagBottomRight;
    }

    public void setDiagBottomRight(Piece diagBottomRight){
        this.DiagBottomRight = diagBottomRight;
    }

}