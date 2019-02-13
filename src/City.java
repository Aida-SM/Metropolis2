public class City {

    int numberOfCitizens;
    private static final int MONTH_IN_A_YEAR = 12 ;
    double taxesPerCitizen;
    double averageIncomeOfCityPerYear;

    public City(){

    }

    public City(int numberOfCitizens, double taxesPerCitizen) {
        this.numberOfCitizens = numberOfCitizens;
        this.taxesPerCitizen = taxesPerCitizen;
    }

    public int getNumberOfCitizens() {
        return numberOfCitizens;
    }

    public double getAverageIncomeOfCityPerYear(){

        return numberOfCitizens * taxesPerCitizen * MONTH_IN_A_YEAR ;
    }
}

