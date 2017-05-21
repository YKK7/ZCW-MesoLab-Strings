package kim.christopher;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CSVParserTest {

    String csv;
    String csv2;
    ArrayList<DriversLicense> list;

    @Before
    public void initialize() {
        csv = "LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,"
                + "CLASS\nLong,Aaron,456 Street Dr,NJ,L364856498487,06/17/1993,06/17/2014,06/30/2018,M,GRN,6'2,YES,D";

        csv2 = "LAST_NAME,FIRST_NAME,ADDR,STATE,LICENSE_NUMBER,D.O.B.,ISS_D,EXP_D,SEX,EYES,HGT,ORGANDONOR,CLASS\n" +
                "Long,Aaron,456 Street Dr,NJ,L364856498487,06/17/1993,06/17/2014,06/30/2018,M,GRN,6'2,YES,D\n" +
                "Kim,Chris,820 District Dr,DE,L364856423452,12/11/1980,08/12/2013,12/11/2018,M,BRO,6'5,NO,D\n" +
                "Stamatelos,Jarryd,123 Main St ,NJ,L363345398489,03/17/1988,03/17/2016,03/20/2020,M,BRO,7'0,YES,D\n" +
                "Cage,Nick,362 Fancy St,CA,L809239899490,02/02/1970,02/02/2000,02/02/2006,M,BRO,6'0,YES,D\n" +
                "Reeves,Keanu,876 Zion Dr,NY,L234252352391,06/06/1955,06/09/2005,06/09/2010,M,GRN,5'11,YES,D\n" +
                "Anderson,Neo,2959 57th St,NY,L364235898492,08/06/1980,07/07/1999,07/07/2009,M,BRO,5'11,NO,D\n" +
                "Traven,Jack,25 Speed Ln,CA,L323523423193,02/20/1994,02/20/2017,02/20/2027,M,BRO,5'11,YES,D\n" +
                "Lomax,Kevin,9234 High St,MI,L098886498494,09/03/1940,08/08/2008,08/08/2018,M,BRO,6'0,YES,D\n" +
                "Wick,John,2190 Badass Alley,NY ,L234234598495,06/06/1977,03/03/2000,01/01/2010,M,GRN,6'0,YES,D\n" +
                "Wyler,Alex,234 Lake House St,NY,L234235236253,07/08/2000,04/08/2017,04/08/2027,M,BRO,5'11,YES,D\n" +
                "Utah,Johnny,932 PointBreak Rd,CA,L223523438497,02/05/1988,04/04/2000,04/04/2010,M,BRO,5'11,NO,D\n" +
                "Starr,Patrick,101 UnderTheSea Ct,HI,L101234101010,10/07/1987,02/30/2010,02/30/2010,M,BRO,6'1,NO,D\n" +
                "Zach,Leon,1234 BadAtSmash Ln,DE,L101234107890,01/02/2000,03/03/2000,05/19/2107,M,BRO,4'3,NO,D";
        list = new ArrayList<DriversLicense>();
        list.add(new DriversLicense("Long","Aaron", "456 Street Dr","NJ","L364856498487",
                "06/17/1993","06/17/2014","06/30/2018","M","GRN","6'2","YES","D"));
    }


    @Test
    public void deserializeFromCSVTest1(){
        //Given
        String expectedLastName1 = "Kim";
        String expectedFirstName1 = "Nick";
        String expectedAddress1 = "876 Zion Dr";
        String expectedEyes = "BRO";
        int expectedSize = 13;

        //When
        ArrayList<DriversLicense> result = CSVParser.deserializeFromCSV(csv2);
        int actualSize = result.size();
        String actualLastName1 = result.get(1).getLastName();
        String actualFirstName1 = result.get(3).getFirstName();
        String actualAddress1 = result.get(4).getStreetAddress();
        String actualEyes = result.get(12).getEyeColor();

        //Then
        assertEquals("Last name of 2nd entry is Kim", expectedLastName1, actualLastName1);
        assertEquals("First name of 4th entry is Nick", expectedFirstName1, actualFirstName1);
        assertEquals("Address of 5th entry is 876 Zion Dr", expectedAddress1, actualAddress1);
        assertEquals("Eye color of 12th entry is BRO", expectedEyes, actualEyes);
        assertEquals("Size of list should be 13", expectedSize, actualSize);
    }

    @Test
    public void serializeToCSVTest(){
        //Given
        String expected = csv2;

        //When
        String actual = DriversLicense.serializeToCSV(CSVParser.deserializeFromCSV(csv2));

        //Then
        assertEquals("Result of serializing the deserialization of csv2 should result in csv2", expected, actual);
    }
}
