import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


class DiceTest {

    private int testSides;
    private Dice testDice;

    @Before
    public void setUp(){
        //we are getting a dice of six size
        this.testSides = 6;
        //create the dice w/ six sides
        this.testDice = new Dice(testSides);

    }

    @Test
    public void testDiceRoll(){
        // given
        // when
        int expected = testDice.diceRoll();
        // then
        Assert.assertTrue(expected >= 1 && expected <= 6);
    }


}