
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EstateAgentsTest {

    EstateAgents estateAgents;
    Building house;
    Building apartment;
    Building office;


    @BeforeEach
    void setUp(){
        estateAgents = new EstateAgents("Housing Ltd");
        house = new House(3, LocalDate.of(2008,01,23), 200000, 2, false);
        apartment = new Apartment(2, LocalDate.of(2019,04,25), 120000, 2, 1234);
        office = new Office(5, LocalDate.of(2011,10,02), 300000, 1234, 15);

        estateAgents.addBuilding(house);
        estateAgents.addBuilding(apartment);
        estateAgents.addBuilding(office);

    }

    @Test
    void canAddBuilding(){
        Building big_house = new House(5, LocalDate.of(2020,05,23), 400000, 3, true);
        estateAgents.addBuilding(big_house);
        assertThat(estateAgents.countBuildings()).isEqualTo(4);

    }
    @Test
    void canCountBuildings(){
        assertThat(estateAgents.countBuildings()).isEqualTo(3);
    }

    @Test
    void canSellBuilding(){
        estateAgents.sellBuilding(house);
        assertThat(estateAgents.countBuildings()).isEqualTo(2);
        assertThat(estateAgents.getTill()).isEqualTo(200000);
    }

    @Test
    void canAddWifi(){
        assertThat(house.addWifi()).isEqualTo("House wifi connected");
    }

    @Test
    void canAddOfficeNeedingLift(){
        Office bigOffice = new Office(10,LocalDate.of(2020,02,23),500000,4444,30);
        estateAgents.addBuildingNeedingLift(bigOffice);
        assertThat(estateAgents.countBuildingsNeedingLifts()).isEqualTo(1);
    }

    @Test
    void canAddApartmentNeedingLift(){
        Apartment bigApartment = new Apartment(4,LocalDate.of(2020,02,23),400000,6,3333);
        estateAgents.addBuildingNeedingLift(bigApartment);
        assertThat(estateAgents.countBuildingsNeedingLifts()).isEqualTo(1);
    }

    @Test
    void canAddOfficeAndApartmentNeedingLifts(){
        Apartment bigApartment = new Apartment(4,LocalDate.of(2020,02,23),400000,6,3333);
        Office bigOffice = new Office(10,LocalDate.of(2020,02,23),500000,4444,30);
        estateAgents.addBuildingNeedingLift(bigApartment);
        estateAgents.addBuildingNeedingLift(bigOffice);
        assertThat(estateAgents.countBuildingsNeedingLifts()).isEqualTo(2);
    }
}
