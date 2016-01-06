import static org.junit.Assert.*;

import org.junit.Test;

public class testEnum {

   
    @Test
    public void testMonthNextOne() throws Exception {
        Month now = Month.AUGUST;
        Month after = Month.SEPTEMBER;
        assertTrue(now.next() == after);
    }

    @Test
    public void testMonthNextTwo() throws Exception {
        Month now = Month.MAY;
        Month after = Month.JUNE;
        assertTrue(now.next() == after);
    }
    @Test
    public void testCountOfDay() throws Exception {
        Month now = Month.MAY;
        Month after = Month.JUNE;
        assertTrue(now.ordinal() == 30);
    }
  
}
