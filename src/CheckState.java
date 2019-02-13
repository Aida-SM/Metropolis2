import java.util.Random;

public class CheckState {

    public static void main(String[] args){

        Random random = new Random();
        boolean isCapital = random.nextBoolean();
        int numberOfCitizen = random.nextInt(1000000);
        double taxesPerCitizen = random.nextDouble() * 500;

        Capital capital = new Capital(numberOfCitizen,taxesPerCitizen);
        NotCapital notCapital = new NotCapital(numberOfCitizen,taxesPerCitizen);

        if( isCapital && capital.isMetropolis()  ||  !isCapital && notCapital.isMetropolis()  )

                System.out.println("This city is Metropolis");
        else
                System.out.println("This city is not Metropolis");











    }
}
