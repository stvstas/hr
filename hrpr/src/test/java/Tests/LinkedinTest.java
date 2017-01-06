package Tests;

import com.endava.pages.Employees;
import com.endava.pages.LogInPage;
import com.endava.pages.ReadData;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by andpopescu on 1/5/2017.
 */
public class LinkedinTest {
    private WebDriver driver;
    private LogInPage logInPage;
    private ReadData readData;

    @Before
    public void before(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logInPage = PageFactory.initElements(driver, LogInPage.class);
    }

    @Test
    public void test() throws IOException
    {
        //logInPage.accountLogIn("", "");

    }


}
