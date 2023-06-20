package Annotations;

import org.testng.annotations.*;

public class AllAnnotationsTest {

    @Test
    public void hello() {
        System.out.println("@Test annotation");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod annotation");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod annotation");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass annotation");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass annotation");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest annotation");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest annotation");
    }
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite annotation");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite annotation");

    }

}
