package advancedConcepts.projects.tictactoe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;
    private int dimension;

    /*
        Dimension = 3
        [
            [c1, c2, c3]
            [c4, c5, c6]
            [c7, c8, c9]
        ]
     */

    public Board(int dimension){
        this.dimension = dimension;
        board = new ArrayList<List<Cell>>();
        for(int i=0;i<dimension;i++){
            board.add(new ArrayList<>());
            for(int j=0;j<dimension;j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
