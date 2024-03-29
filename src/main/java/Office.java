import java.time.LocalDate;

public class Office extends Building implements ILift{

    private String companyName;
    private int buildingCode;
    private int numberOfDesks;

    public Office(int numberOfRooms, LocalDate dateOfConstruction, double costOfBuilding, int buildingCode, int numberOfDesks){
        super(numberOfRooms, dateOfConstruction, costOfBuilding);
        this.companyName = "";
        this.buildingCode = buildingCode;
        this.numberOfDesks = numberOfDesks;

    }

    public void setCompanyName(String newName) {
        this.companyName = newName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setBuildingCode(int newCode) {
        this.buildingCode = newCode;
    }

    public int getBuildingCode() {
        return this.buildingCode;
    }

    public int getNumberOfDesks() {
        return this.numberOfDesks;
    }

    public void increaseDesks(int increaseOfDesks) {
        this.numberOfDesks += increaseOfDesks;
    }

    @Override
    public String addWifi() {
        return "Office Wifi connected";
    }

    public String addWifi(int floorNumber){
        return "Wifi connected to floor " + floorNumber;
    }

    @Override
    public String installLift(int floors) {
        return "Office lift set up for " + floors + " floors";
    }
}
