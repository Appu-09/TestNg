import org.testng.annotations.Test;

public class SampleTest {

    @Test(groups = {"smoke"})
    public void testLogin(){
        System.out.println("Executing smoke test:Login functionality");
    }

    @Test(groups = {"regression"})
    public void testAddition(){
        System.out.println("Executing regression test: Addition functionality");
    }

    @Test(groups = {"smoke", "regression"})
    public void testSearch() {
        System.out.println("Executing both smoke and regression test: Search functionality");

    }
}
