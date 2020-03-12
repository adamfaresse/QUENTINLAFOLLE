package model;


import java.util.Random;

public class Die {
  private Random generator;
  private int facevalue;
  private boolean isblocked;

  public Die() {
    isblocked= true;

    facevalue = generator.nextInt(7);

  }

  public boolean isBlocked() {

    return isblocked;
  }

  public void unblock() {
    isblocked = true ;
  }

  public void block() {
    isblocked = false ;
  }

  public int value() {
    roll();
    return facevalue;
  }

  public void roll() {
    if (isBlocked()){
      facevalue = generator.nextInt(7);
    }
  }
}
