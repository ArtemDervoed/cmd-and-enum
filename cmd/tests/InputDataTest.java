package commonLine;

import org.junit.Test;
import org.apache.commons.*;

import static org.junit.Assert.*;


public class InputDataTest {
    @Test
    public void testSetLeftOperand() throws Exception {
        InputData.setLeftOperand(50);
        assertEquals(InputData.leftArgs, 50);
    }

    @Test
    public void testSetRightOperand() throws Exception {
        InputData.setRightOperand(50);
        assertEquals(InputData.rightArgs, 50);
    }

    @Test
    public void testMain() throws Exception {
        String[] args = {"-l", "100", "-r", "50", "-o", "*"};
        InputData.main(args);
        assertEquals(InputData.getResult(), 150, 0.00001);
    }


}