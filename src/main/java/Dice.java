import java.util.Random;

public class Dice {

    private int sides;
    private Random diceRoller;


    public Dice(int sides){

        this.diceRoller = new Random();
        this.sides = sides;

    }


    public int diceRoll(){

        return diceRoller.nextInt(sides)+1;
    }



}
