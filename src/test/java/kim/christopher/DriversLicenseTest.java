package kim.christopher;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DriversLicenseTest {

    DriversLicense license;
    String csvHeader;
    String serialized;

    @Before
    public void initialize() {
        license = new DriversLicense("Kim", "Chris", "820 District Drive", "DE", "L364856423452",
                "12/11/1980","08/12/2013","12/11/2018","M","BRO","6'5", "NO","D");
        csvHeader = "LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,CLASS\n";
        serialized = "Kim,Chris,820 District Dr,DE,L364856423452,12/11/1980,08/12/2013,12/11/2018,M,BRO,6'5,NO,D\n";
    }






    @Test
    public void getCSVHeaderTest(){
        //Given
        String expected = csvHeader;

        //When
        String actual = DriversLicense.getCSVHeader();

        //Then
        assertEquals("Should output the first line of CSV", expected, actual);
    }

    @Test
    public void serializeToCSVTest(){
        //Given

        //When

        //Then
    }
}
