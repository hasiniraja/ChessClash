package piece;

import main.GamePanel;
import main.Type;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Queen extends Piece{
    public Queen(int col, int row, int color) throws IOException {
        super(col, row, color);

        type = Type.QUEEN;

        if (color == GamePanel.WHITE) {
            image = ImageIO.read(getClass().getResourceAsStream("/res/piece/w-queen.png"));
        }else {
            image = ImageIO.read(getClass().getResourceAsStream("/res/piece/b-queen.png"));
        }
    }

    public boolean canMove(int targetCol, int targetRow){

        if (isWithThinBoard(targetCol, targetRow) && !isSameSquare(targetCol, targetRow)){
            //Vertical & Horizontal
            if (targetCol == preCol || targetRow == preRow){
                if (isValidSquare(targetCol,targetRow) && !pieceIsOnStraightLine(targetCol, targetRow)){
                    return true;
                }
            }

            //Diagonal
            if (Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)){
                if (isValidSquare(targetCol, targetRow) && !pieceIsOnDiagonalLine(targetCol, targetRow)){
                    return true;
                }
            }
        }
        return false;
    }
}
