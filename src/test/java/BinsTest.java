import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinsTest extends TestCase {

    private Bins testBins;

    @Before
    public void setUp(){

        this.testBins = new Bins(3,5);

    }

    @Test
    public void testGetBin() {
        //  given
        //  when
        int actual = testBins.getBin(3);
        //  then
        Assert.assertEquals(0,actual);
    }

    @Test
    public void testIncrementBin() {
        //  given
        //  when
        testBins.incrementBin(3);
        //  then
        Assert.assertEquals(1, testBins.getBin(3).intValue());

    }
}