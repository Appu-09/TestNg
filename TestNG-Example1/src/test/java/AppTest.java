import App.App;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void helloWorld(){
        App a = new App();
        Assert.assertEquals(10, a.sum(5,5));
    }
}
