import org.junit.Assert;
import org.junit.Test;

public class CoffeeServiceTest {
    /**
     * Let's test the most common scenario - we have a normal amount of coffee servings, and we want to purchase, then,
     * verify that the correct servings/revenue is present
     */
    @Test
    public void coffeeServiceTest1(){
//        ARRANGE - 'set up' the testing scenario, initial values, etc
        int startingServings = 10;
        CoffeeService service = new CoffeeService(startingServings);
//        ACT - run the code that you're intending to test
        int expectedServings = 9;
        service.purchase();
//        ASSERT - verify that the results of the code were as expected
        int actualServings = service.getServings();
        Assert.assertEquals(expectedServings, actualServings);
    }
    /**
     * Let's test an edge case - is a 'risky' scenario, where developers often make mistakes
     * (such as dealing with values of 1, 0, -1, or max value of a variable)
     */
    @Test
    public void coffeeServiceTest2() {
//        ARRANGE - 'set up' the testing scenario, initial values, etc
        int startingServings = 1;
        CoffeeService service = new CoffeeService(startingServings);
//        ACT - run the code that you're intending to test
        int expectedServings = 0;
        service.purchase();
//        ASSERT - verify that the results of the code were as expected
        int actualServings = service.getServings();
        Assert.assertEquals(expectedServings, actualServings);
    }
    @Test
    public void coffeeServiceTest3() {
//        ARRANGE - 'set up' the testing scenario, initial values, etc
        int startingServings = 0;
        CoffeeService service = new CoffeeService(startingServings);
//        ACT - run the code that you're intending to test
        int expectedServings = 0;
        service.purchase();
//        ASSERT - verify that the results of the code were as expected
        int actualServings = service.getServings();
        Assert.assertEquals(expectedServings, actualServings);
    }
}
