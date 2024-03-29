import java.time.LocalDate;

public class House extends Building {

    private int numberOfFloors;
    private Boolean hasGarden;

    public House(int numberOfRooms, LocalDate dateOfConstruction, double costOfBuilding, int numberOfFloors, Boolean hasGarden){
        super(numberOfRooms, dateOfConstruction,costOfBuilding);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;

    }

    public void setHasGarden(Boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public String buildShed() {
        if(hasGarden){
            return "Shed built";
        }else{
            return"No garden to build shed";
        }
    }

    @Override
    public String addWifi(){
        return "House wifi connected";
    }



}
