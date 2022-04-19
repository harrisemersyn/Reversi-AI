public class Board{

    enum Color{
        WHITE,
        BLACK
    }

    public Color[][] board;

    public Board(){
        this.board = new Color[8][8];
        //Sets pieces in the middle of the board
        this.board[3][3] = WHITE;
        this.board[4][4] = WHITE;
        this.board[3][4] = BLACK;
        this.board[4][3]= BLACK;
    }

    //Checks to see if a move would be legal
    public boolean CheckLegality(int row, int column){

        //in progress

    }

}