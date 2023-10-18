import java.time.LocalDate;

public class Apartment extends Building implements ILift {

    private int apartmentLevel;
    private int buildingCode;

    public Apartment(int numberOfRooms, LocalDate dateOfConstruction, double costOfBuilding, int apartmentLevel, int buildingCode){
        super(numberOfRooms, dateOfConstruction, costOfBuilding);
        this.apartmentLevel = apartmentLevel;
        this.buildingCode = buildingCode;
    }

    public void setBuildingCode(int newCode) {
        this.buildingCode = newCode;
    }

    public int getBuildingCode() {
        return this.buildingCode;
    }

    @Override
    public String addWifi() {
        return "models.Apartment wifi connected";
    }

    @Override
    public String installLift(int floors) {
        return "Apartment lift set up for " + floors + " floors";
    }
}
