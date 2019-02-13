public class Capital extends City {

    public Capital(int numberOfCitizens, double taxesPerCitizen) {
        super(numberOfCitizens, taxesPerCitizen);
    }

    public boolean isMeropolis(){
        return getNumberOfCitizens() > 100000 && getNumberOfCitizens() > 720000000.0 ;
    }


}
