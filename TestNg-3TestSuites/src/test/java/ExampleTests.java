import org.testng.TestNGException;
import org.testng.annotations.*;

@Listeners(TestListener.class)
public class ExampleTests {

    @Test
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @Test
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @Test
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @Test
    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @Test
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }


    @Test
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @Test
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @Test(groups = {"smoke"})
    public void smokeTest(){
        System.out.println("Smoke Test");
    }

    @Test(groups = {"regression"})
    public void regressionTest(){
        System.out.println("Regression Test");
    }

    @Test(groups = {"acceptance"})
    public void acceptanceTest(){
        System.out.println("Acceptance Test");
    }

    @DataProvider(name = "data")
    public Object[][] provideData(){
        return new Object[][]{{"value1"},{"value2"},{"value3"}};
    }

    @Test(enabled = false)
    public void ignoreTest(){
        System.out.println("Ignored Test");
    }

    @Parameters("param")
    @Test
    public void   parameterizedTest(@Optional("default Value ") String param){
        System.out.println("Parameterized test with parameter: " + param);
    }

    @Factory
    public Object[] createInstances(){
        Object[] result = new Object[1];
        for(int i = 0; i< result.length; i++){
            result[i] = new ExampleTests();
        }
        return result;
    }
    @Test(expectedExceptions = TestNGException.class)
    public void exceptionTest(){
        throw  new TestNGException("Exception Test");
    }

    @Test(dependsOnMethods= {"smokeTest","regressionTest"})
    public void dependentTest() {
        System.out.println("Dependent Test");
    }

}