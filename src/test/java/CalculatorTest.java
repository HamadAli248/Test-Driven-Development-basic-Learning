import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    // cleaning code to make it as simple and little as possible
    @Test
    public void testAddOperationTwoPlusThreeThenExpectsFive(){
        //test methods name explain them in as much detail as possible
        Assert.assertEquals(5, new Calculator().add(2,3));
    }

    // start out writing the test by seeing what needs to be done and then cut down as you make it work e.g ^^^^^^^^^
    @Test
    public void testAddOperationOneThousandPlusZeroThenExpectsOneThousand(){
        //test methods name explain them in as much detail as possible

        //Given the values below
        long value1=1000;
        long value2=0;

        //when i invoke the add method in the calculator
        Calculator calculator = new Calculator();
        long actual = calculator.add(value1,value2);

        //Then I expect the sum to be 5

        long expectedSum =1000;

        Assert.assertEquals(expectedSum,actual);

    }

    @Test
    public void testSubtractOperationFiveMinusThreeThenExpectsTwo(){
        //test methods name explain them in as much detail as possible

        //Given the values below
        long value1=5;
        long value2=3;

        //when i invoke the add method in the calculator
        Calculator calculator = new Calculator();
        long actual = calculator.sub(value1,value2);

        //Then I expect the sum to be 5

        long expectedSum =2;

        Assert.assertEquals(expectedSum,actual);

    }
    @Test
    public void testSubtractOperationTenMinusThreeThenExpectsSeven(){

        Assert.assertEquals(7, new Calculator().sub(10,3));

    }

}
