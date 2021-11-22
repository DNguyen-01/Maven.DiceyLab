
import java.util.ArrayList;
import java.util.List;

public class Simulation {

    private int numDie, numberOfSim;
    private List<Dice> die;
    private Bins bins;

    public Simulation(int numDie, int numberOfSim){

        this.numDie = numDie;
        this.numberOfSim = numberOfSim;
        this.die = new ArrayList<>();
        for(int i = 0; i < numDie; i++){
            die.add(new Dice(6));
        }
        //this new object of bins will take in the input of starting value of numDie
        //and ending value of numDie*6(sides)
        this.bins = new Bins(numDie, numDie*6);

    }

    public void runSimulation(){

        //roll the numDie die
        for(int i = 0; i < numberOfSim; i++){
            int total = 0;
            for(Dice dice : die){
                total += dice.diceRoll();
            }
            //track the numbers in the bins
            bins.incrementBin(total);
        }

    }

    public void printResults(){

        System.out.println("***");
        System.out.println("Simulation of " + numDie + " dice tossed for " + numberOfSim + " times.");
        System.out.println("***\n");
        for(int i = bins.getStartValue();i <= bins.getEndValue(); i++){
            double percent = ((double)bins.getBin(i)/(double) numberOfSim);
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < percent*100; j++){
                sb.append("*");
            }
            System.out.println(i + " : " + bins.getBin(i) + " : " + percent + " " + sb.toString());
        }



    }

}
