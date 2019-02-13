public class NotCapital extends City {

    public NotCapital(int numberOfCitizens, double taxesPerCitizen) {
        super(numberOfCitizens, taxesPerCitizen);
    }

    public  boolean isMetropolis(){

        return getNumberOfCitizens()> 200000 && getAverageIncomeOfCityPerYear() > 720000000.0 ;

    }


}
