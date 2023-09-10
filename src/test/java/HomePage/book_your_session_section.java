package HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class book_your_session_section {
    WebElement mainTitle;
    WebDriver driver;

    @BeforeClass
    public void setup(){
        //Initialize driver
         driver =  WebDriverManager.chromedriver().create();
        driver.get("https://famcare.app/");

    }

    @Test(priority = 1)
    public void mainTitleExist(){
        mainTitle = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertTrue(mainTitle.isDisplayed());
    }





}