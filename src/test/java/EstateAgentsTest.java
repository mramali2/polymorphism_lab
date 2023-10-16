import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class EstateAgentsTest {

    EstateAgents estateAgents;

    @BeforeEach
    void setUp(){
        estateAgents = new EstateAgents("Housing Ltd");
        Building house = new House(3, LocalDate.of(2008,01,23), 200000, 2, false);
        Building apartment = new Apartment(2, LocalDate.of(2019,04,25), 120000, 2, 1234);
        Building office = new Office(5, LocalDate.of(2011,10,02), 300000, 1234, 15);

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

        estateAgents.sellBuilding(Building house);
        assertThat(estateAgents.countBuildings()).isEqualTo(2);
        assertThat(estateAgents.getTill()).isEqualTo(200000);


    }
}
