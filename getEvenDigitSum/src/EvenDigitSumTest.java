import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitSumTest {

//    @org.junit.jupiter.api.Test
//    void getEvenDigitSum() {
//    }
    @Test
    public void negative(){
        int actual = EvenDigitSum.getEvenDigitSum(-1);
        assertEquals(-1, actual);
    }
    @Test
    public void allEven(){
        int actual = EvenDigitSum.getEvenDigitSum(224);
        assertEquals(8, actual);
        actual = EvenDigitSum.getEvenDigitSum(2);
        assertEquals(2,actual);
        actual = EvenDigitSum.getEvenDigitSum(0);
        assertEquals(0, actual);
    }

    @Test
    public void allOdd(){

    }

    @Test
    public void evenAndOdd(){

    }
}