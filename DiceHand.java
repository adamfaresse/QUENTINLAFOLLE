package model;

import java.util.List;

public class DiceHand {

    private List<Integer> faces;

    public DiceHand(List<Die> dice){
        for (int i = 0; i < 4; i++) {
            faces.add(dice.get(i).value())  ;
        }

    }

    public int get(int die){
        return faces.get(die);
    }

    public int sum(){
        int sum= 0;
        for (int i = 0; i < 4 ; i++) {
            sum = sum + get(i);
        }
        return sum;
    }

    public int count(int facevalue){
        int count = 0;
        for (int i = 0; i < 4 ; i++) {
            if(get(i)== facevalue){
                count = count + 1;
            }
        }
        return count ;
    }

}
