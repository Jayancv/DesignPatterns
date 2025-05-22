package creational.prototype;

public class BoardBasis implements Cloneable {

    private String boardBasisName;
    private String boardBasisCode;

    public String getBoardBasisName() {
        return boardBasisName;
    }

    public void setBoardBasisName(String boardBasisName) {
        this.boardBasisName = boardBasisName;
    }

    public String getBoardBasisCode() {
        return boardBasisCode;
    }

    public void setBoardBasisCode(String boardBasisCode) {
        this.boardBasisCode = boardBasisCode;
    }

    @Override
    public BoardBasis clone() {
        try {
//            BoardBasis clone = (BoardBasis) super.clone();
            BoardBasis clone = new BoardBasis();
            clone.setBoardBasisCode(this.getBoardBasisCode());
            clone.setBoardBasisName(this.getBoardBasisName());
            return clone;
        } catch (Exception e) {
            throw new AssertionError();
        }
    }
}
