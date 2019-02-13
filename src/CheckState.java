import java.util.Random;

public class CheckState {

    public static void main(String args){

        Random random = new Random();
        boolean isCapital = random.nextBoolean();
        int numberOfCitizen = random.nextInt(1000000);
        double taxesPerCitizen = random.nextDouble() * 500;

        City city = new City(numberOfCitizen,taxesPerCitizen);
        Capital capital = new Capital();
        Metropolis metropolis = new Metropolis();







    }
}
