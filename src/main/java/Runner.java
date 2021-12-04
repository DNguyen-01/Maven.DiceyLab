public class Runner {


    public static void main(String[] args) {

        //locally scoped - no need for private class
        //created an object of the simulation
         Simulation simulation = new Simulation(2,1000000);
         //run simulation
         simulation.runSimulation();
        // print results
         simulation.printResults();

    }
}
