import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestConfig {

    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("BeforeSuiteTest()");
    }
    @AfterSuite
    public void testAfterSuite(){
        System.out.println("AfterSuiteTest()");
    }
    @BeforeTest
    public void testBeforeTest(){
        System.out.println("testBeforeTest()");
    }
    @AfterTest
    public void testAfterTest(){
        System.out.println("testAfterTest()");
    }
}
