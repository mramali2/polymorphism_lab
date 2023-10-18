import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OfficeTest {

    Office office;

    @BeforeEach
    void setUp(){
        office = new Office(8, LocalDate.of(2019,10,13),300000,2345, 20);

    }

    @Test
    public void canSetCompanyName(){
        office.setCompanyName("BNTA");
        assertThat(office.getCompanyName()).isEqualTo("BNTA");
    }

    @Test
    public void canGetCompanyName(){
        assertThat(office.getCompanyName()).isEqualTo("");
    }

    @Test
    void canSetBuildingCode(){
        office.setBuildingCode(6789);
        assertThat(office.getBuildingCode()).isEqualTo(6789);
    }

    @Test
    void canGetBuildingCode(){
        assertThat(office.getBuildingCode()).isEqualTo(2345);
    }

    @Test
    void canIncreaseDesks(){
        office.increaseDesks(5);
        assertThat(office.getNumberOfDesks()).isEqualTo(25);
    }

    @Test
    void canaddWifi(){
        assertThat(office.addWifi()).isEqualTo("Office Wifi connected");
    }

    @Test
    void canAddWifiWithArgument(){
        assertThat(office.addWifi(3)).isEqualTo(String.format("Wifi connected to floor %d",3));
    }

    @Test
    void canInstallLift(){
        String result = office.installLift(10);
        assertThat(result).isEqualTo("Office lift set up for 10 floors");
    }


}
