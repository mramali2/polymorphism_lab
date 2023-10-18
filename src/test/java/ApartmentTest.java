
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ApartmentTest {

    Apartment apartment;

    @BeforeEach
    void setUp(){
        apartment = new Apartment(2, LocalDate.of(2012,05,25), 100000, 4, 1234);
    }

    @Test
    void canSetBuildingCode(){
        apartment.setBuildingCode(6789);
        assertThat(apartment.getBuildingCode()).isEqualTo(6789);
    }

    @Test
    void canGetBuildingCode(){
        assertThat(apartment.getBuildingCode()).isEqualTo(1234);
    }

    @Test
    void canAddWifi(){
        assertThat(apartment.addWifi()).isEqualTo("models.Apartment wifi connected");
    }

    @Test
    void canInstallLift(){
        String result = apartment.installLift(5);
        assertThat(result).isEqualTo("Apartment lift set up for 5 floors");
    }
}

