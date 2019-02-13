public class Metropolis extends City {

    public Metropolis() {

    }

    public  boolean isMetropolic(){

        return getNumberOfCitizens()> 200000 && getAverageIncomeOfCityPerYear() > 720000000.0 ;

    }


}
