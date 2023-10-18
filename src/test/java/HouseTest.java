import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HouseTest {

    House house;

    @BeforeEach
    void setUp(){
        house = new House(3, LocalDate.of(2008,12,15), 120000, 3, true);
    }

    @Test
    void canBuildShed__true(){
        assertThat(house.buildShed()).isEqualTo("Shed built");
    }

    @Test
    void canBuildShed__false(){
        house.setHasGarden(false);
        assertThat(house.buildShed()).isEqualTo("No garden to build shed");
    }

    @Test
    void canAddWifi(){
        assertThat(house.addWifi()).isEqualTo("House wifi connected");
    }


}
