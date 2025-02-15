package First.Junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    public void addTest(){

        calculator calculator = new calculator ();
        int actualResult = calculator.add(10,20);

       assertEquals(30,actualResult);

    }


}