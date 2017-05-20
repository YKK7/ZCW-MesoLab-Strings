package kim.christopher;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CSVParserTest {

    String csv;
    ArrayList<DriversLicense> list;

    @Before
    public void initialize() {
        csv = "LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,"
                + "CLASS\nLong,Aaron,456 Street Dr,NJ,L364856498487,06/17/1993,06/17/2014,06/30/2018,M,GRN,6'2,YES,D";
        list = new ArrayList<DriversLicense>();
        list.add(new DriversLicense("Long","Aaron", "456 Street Dr","NJ","L364856498487",
                "06/17/1993","06/17/2014","06/30/2018","M","GRN","6'2","YES","D"));
    }

    @Test
    public void deserializeFromCSVTest(){
        //Given
        int expectedSize = 1;
        ArrayList<DriversLicense> expected = list;

        //When
        ArrayList<DriversLicense> actual = CSVParser.deserializeFromCSV(csv);
        int actualSize = actual.size();

        //Then
        assertEquals("Lists should be identical", expected, actual);
        assertEquals("Size of list should be 1", expectedSize, actualSize);
    }
}
