import org.testng.Assert;
import org.testng.annotations.*;

public class ExampleTest {
    @BeforeSuite
    public void beforeSuite(){

        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest(){

        System.out.println("Before Test");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("Before method");
    }
    @Test
    public void testAssertEquals(){
        int expected = 10;
        int actual = 10;
        Assert.assertEquals(actual, expected,"The expected value is  equal to the actual value");
    }

//    @Test
//    public void testAssertEqualsFailure(){
//        int expected = 10;
//        int actual = 20;
//        Assert.assertEquals(actual,expected,"The expected value is not equal to the actual value");
//    }
    @Test
    public void testAssertTrue(){
        boolean  value = true;
        Assert.assertTrue(value,"The value should be true.");
    }

//    @Test
//    public void testAssertTrueFailure(){
//        boolean value = false;
//        Assert.assertTrue(value,"The value should be true.");
//    }

    @Test
    public void testAssertFalse(){
        boolean value = false;
        Assert.assertFalse(value,"The value should be false");
    }

//    @Test
//    public void testAssertFalseFailure(){
//        boolean value = true;
//        Assert.assertFalse(value,"The value should be false");
//    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }
    @AfterSuite
    public  void afterSuite(){
        System.out.println("After Suite");

 }
}
