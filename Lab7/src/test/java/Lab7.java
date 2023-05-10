import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class Lab7 {
    WebDriver driver ;

    @DataProvider(name = "loginCredentials")
    public static Object [][] loginCredentials()
    {
        return new Object[][] {
                {"Ahmed"},
                {"Mohamed"},
                {"Mahmoud"},
                {"Ashraf"}
        } ;
    }

    @BeforeTest
    @Parameters("browser") // Edge - IE
    public  void setup(String browser)
    {
        if (browser.equalsIgnoreCase("Edge"))
           driver = new EdgeDriver();
        else if (browser.equalsIgnoreCase("IE"))
            driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
    }



    @Test (groups = {"Regression"} , dataProvider = "loginCredentials")
    public void TestCase1 (String s1)
        {
            System.out.println(s1);
        }

    @Test(groups = {"Regression"})
    public void TestCase2 ()
    {
        System.out.println("");
    }

    @Test (groups = {"Smoke"})
    public void TestCase3 ()
    {
        System.out.println("");
    }


    @AfterTest
    public void quit()
    {
        driver.quit();

    }
}
