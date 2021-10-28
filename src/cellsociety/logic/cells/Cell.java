package cellsociety.logic.cells;

/**
 * An abstract implementation of a cell in a grid. This class keeps track of a
 * cell's row, column, current and next state, and current and next alternate state.
 *
 * @author William Convertino
 *
 * @since 0.0.3
 */
public abstract class Cell {

  //The row coordinate of the current cell.
  private int row;

  //The column coordinate of the current cell.
  private int column;

  //The current state of the cell.
  private int currentState;

  //The next state of the cell.
  private int nextState;

  //The current alternate state of the cell, useful for a variety of abstract implementations.
  private int currentAltState;

  //The next alternate state of the cell, useful for a variety of abstract implementations.
  private int nextAltState;

  /**
   * Constructs a new Cell at the specified coordinates with the given
   * state and alternate state.
   *
   * @param r the row of the cell.
   * @param c the column of the cell.
   * @param state the current state of the cell.
   * @param altstate the current alternate state of the cell.
   */
  public Cell(int r, int c, int state, int altstate) {
    this.row = row;
    this.column = column;
    this.currentState = state;
    this.currentAltState = altstate;
    this.nextState = 0;
    this.nextAltState = 0;
  }

  /**
   * Constructs a new Cell at the specified coordinates with the given
   * state. The alternate state is initialized to 0.
   *
   * @param r the row of the cell.
   * @param c the column of the cell.
   * @param state the current state of the cell
   */
  public Cell(int r, int c, int state) {
    this(r,c,state,0);
  }

  /**
   * Returns the current state of the cell.
   *
   * @return the current state of the cell.
   */
  public int getCurrentState() {
    return this.currentState;
  }

  /**
   * Sets the value of this cell's state to the specified state.
   *
   * @param state the new state of this cell.
   */
  public void setCurrentState(int state) {
    this.currentState = state;
  }

  /**
   * Returns the next state of the cell.
   *
   * @return the next state of the cell.
   */
  public int getNextState() {
    return this.nextState;
  }

}