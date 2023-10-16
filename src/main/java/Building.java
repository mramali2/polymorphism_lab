import java.time.LocalDate;

public abstract class Building {

    protected int numberOfRooms;
    protected LocalDate dateOfConstruction;
    protected double costOfBuilding;

    public Building(int numberOfRooms, LocalDate dateOfConstruction, double costOfBuilding){
        this.numberOfRooms = numberOfRooms;
        this.costOfBuilding = costOfBuilding;
        this.dateOfConstruction = dateOfConstruction;

    }

    public String addWifi(){
        return "Wifi set up";
    }



}
