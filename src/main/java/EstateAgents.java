import java.util.ArrayList;

public class EstateAgents {
    private String name;
    private double till;
    private ArrayList<Building> buildingsForSale;
    private ArrayList<ILift> buildingsNeedingLifts;

    public EstateAgents(String name){
        this.name = name;
        this.till = 0;
        this.buildingsForSale = new ArrayList<>();
        this.buildingsNeedingLifts = new ArrayList<>();
    }

    public void addBuilding(Building newBuilding) {
        this.buildingsForSale.add(newBuilding);
    }

    public int countBuildings(){
        return this.buildingsForSale.size();
    }

    public void sellBuilding(Building soldBuilding){
        this.buildingsForSale.remove(soldBuilding);
        double profit = soldBuilding.costOfBuilding;
        this.till += profit;
    }


    public double getTill() {
        return this.till;
    }

    public int countBuildingsNeedingLifts(){
        return this.buildingsNeedingLifts.size();
    }

    public void addBuildingNeedingLift(ILift ilift){
        this.buildingsNeedingLifts.add(ilift);
    }
}

