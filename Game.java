package model;

import java.util.List;

public class Game {
  private List<Die> dice;
  private int nbReRolls;

  public Game(){
    for (int i = 0; i < 4 ; i++) {
      dice.add(new Die());
    }
    initialRoll();

  }

  public List<Die> getDice() {

    return dice;
  }

  public List<ScoreRow> getRows() {
    // TODO
    return List.of();
  }

  public boolean choose(ScoreRow scoreRow) {
    // TODO
    return false;
  }

  public void reRoll() {
    if (nbReRolls >= 1){
      for (int i = 0; i < 4 ; i++) {
        getDice().get(i).roll();
        nbReRolls--;
      }
    }
  }

  public void initialRoll() {
    for (int i = 0; i < 4; i++) {
      unBlockDice();
      nbReRolls = 3;
      reRoll();
    }
  }

  public int getTotalScore() {
    // TODO
    return 0;
  }

  private void unBlockDice(){
    for (int i = 0; i < 4 ; i++) {
      getDice().get(i).unblock();

    }
  }
}
