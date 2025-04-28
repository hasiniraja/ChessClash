package piece;

import main.GamePanel;
import main.Type;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Bishop extends Piece{
    public Bishop(int col, int row, int color) throws IOException {
        super(col, row, color);

        type = Type.BISHOP;

        if (color == GamePanel.WHITE) {
            image = ImageIO.read(getClass().getResourceAsStream("/res/piece/w-bishop.png"));;
        }else {
            image = ImageIO.read(getClass().getResourceAsStream("/res/piece/b-bishop.png"));
        }
    }

    public boolean canMove(int targetCol, int targetRow){

        if (isWithThinBoard(targetCol, targetRow) && isSameSquare(targetCol, targetRow) == false){

            if (Math.abs(targetCol - preCol) == Math.abs(targetRow - preRow)) {
                if (isValidSquare(targetCol,targetRow) && pieceIsOnDiagonalLine(targetCol,targetRow) == false) {
                    return true;
                }
            }
        }

        return false;
    }
}
