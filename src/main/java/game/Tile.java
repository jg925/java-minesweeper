package game;

public class Tile {
  /**
   * An enum representing the different type of tiles that may appear during a
   * minesweeper game.
   * 
   * 
   * @author jg925
   */
  public enum Type {
    MINE, BLANK, NUM {
    };

  }

  /** The row and column position of the game tile. */
  private final int row;
  private final int col;

  /** The number of mines bordering the tile. */
  // private final int mineVal;

  private Type type;
  private boolean isMine;

  public Tile(int r, int c, Type t) {
    row = r;
    col = c;
    type = t;
  }

}
