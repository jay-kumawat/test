import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.*;

public class leapYearTest{
    leapYear leapYear = new leapYear();
    @Test
    public void checkLeapYearDivisibleBy4(){
        assertTrue(leapYear.isLeapYear(2024));
    }
    @Test
    public void checkCommonYearNotDivisibleBy4(){
        assertFalse(leapYear.isLeapYear(2013));
    }
    @Test
    public void checkCommonYearDivisibleBy100(){
        assertFalse(leapYear.isLeapYear(1900));
    }
    @Test
    public void checkDivisibleBy400(){
        assertTrue(leapYear.isLeapYear(2000));
    }
    @Test
    public void checkNot(){
        assertTrue(leapYear.isLeapYear(2024));
    }

}