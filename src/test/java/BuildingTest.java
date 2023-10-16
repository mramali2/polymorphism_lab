import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BuildingTest {

    Building building;

    @BeforeEach
    void setUp(){
        building = new House(3, LocalDate.of(2005,12,13),120000, 3, true);
    }

    @Test
    void canAddWifi(){
        assertThat(building.addWifi()).isEqualTo("Wifi set up");
    }


}
