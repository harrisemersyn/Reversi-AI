public class Board{

    enum Piece{
        WHITE,
        BLACK,
        EMPTY
    }

    public Piece[][] board;

    public Board(){
        this.board = new Piece[8][8];
        //Sets pieces in the middle of the board
        this.board[3][3] = Piece.WHITE;
        this.board[4][4] = Piece.WHITE;
        this.board[3][4] = Piece.BLACK;
        this.board[4][3]= Piece.BLACK;
    }

    /*
    Checks for the piece color (or empty if no piece present) at a specific direction around a given piece
    */

    public Piece checkLeft(int row, int column){
        if(column - 1 < 0){
            return null;
        }
        return(this.board[row][column-1]);
    }

    public Piece checkRight(int row, int column){
        if(column + 1 > 7){
            return null;
        }
        return(this.board[row][column+1]);
    }

    public Piece checkTop(int row, int column){
        if(row - 1 < 0){
            return null;
        }
        return(this.board[row-1][column]);
    }

    public Piece checkBottom(int row, int column){
        if(row + 1 > 7){
            return null;
        }
        return(this.board[row+1][column]);
    }

    public Piece checkDiagTopLeft(int row, int column){
        if(row - 1 < 0 || column - 1 < 0){
            return null;
        }
        return(this.board[row-1][column-1]);
    }

    public Piece checkDiagTopRight(int row, int column){
        if(row - 1 < 0 || column + 1 > 7){
            return null;
        }
        return(this.board[row-1][column+1]);
    }

    public Piece checkDiagBottomLeft(int row, int column){
        if(row + 1 > 7 || column - 1 < 0){
            return null;
        }
        return(this.board[row+1][column-1]);
    }

    public Piece checkDiagBottomRight(int row, int column){
        if(row + 1 > 7 || column + 1 > 7){
            return null;
        }
        return(this.board[row+1][column+1]);
    }
}