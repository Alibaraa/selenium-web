package HomePage;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BookYourSessionSection{


    WebDriver driver;

    //**********Attribute
    WebElement mainTitle;
    WebElement subTitle;
    WebElement bookFirstSessionButton;
    WebElement image;

    //WebElement data;



    @BeforeClass
    public void setup(){
        //Initialize driver
        driver =  WebDriverManager.chromedriver().create();
        driver.get("https://famcare.app/");

        //myMethod();

    }


    //************aba:Main Title
    @Test(priority = 1)
    public void verifyMainTitleExist(){
        mainTitle = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertTrue(mainTitle.isDisplayed());

    }
    @Test(priority = 2)
    public void verifyMainTitleValue(){
        mainTitle = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        String  mainTitleValue = mainTitle.getText();
        Assert.assertEquals(mainTitleValue,"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");
    }

    @Test(priority = 1)
    public void verifyBookFirstSessionButtonExist(){
        bookFirstSessionButton = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]/a"));
        Assert.assertTrue(bookFirstSessionButton.isDisplayed());

    }

    @Test(priority = 2)
    public void verifyBookFirstSessionButtonValue(){
        //     mainTitle = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        String  bookFirstSessionButtonValue = bookFirstSessionButton.getText();
        Assert.assertEquals(bookFirstSessionButtonValue,"احجز جلستك الأولى");
    }



    @Test(priority = 1)
    public void verifySubTitleExist(){
        subTitle = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]/p"));
        Assert.assertTrue(subTitle.isDisplayed());

    }

    @Test(priority = 2)
    public void verifySubTitleValue(){
        //     mainTitle = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        String  subTitleValue = subTitle.getText();
        Assert.assertEquals(subTitleValue,"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");
    }

    @Test(priority = 1)
    public void verifyImageExist(){
        image = driver.findElement(By.xpath("//*[@id=\"heroSection\"]/div/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(image.isDisplayed());

    }

    @Test(priority = 2)
    public void verifyImageValue(){
        //     mainTitle = driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        String  myImage = image.getAttribute("src");
        Assert.assertEquals(myImage,"https://famcare.app/wp-content/uploads/2022/06/shutterstock_1989703088-1-1024x493.png");
    }





/*public void verifyExistAndValue(String xpath, String value){
WebElement data = driver.findElement(By.xpath(xpath));
Assert.assertTrue(data.isDisplayed());
Assert.assertEquals(data.getText(),value);


}

*/



}




















//**********Methods

//    public static void verifyExistAndValue(String xpath, String value){
//        try {
//            WebElement data = driver.findElement(By.xpath(xpath));
//            try {
//
//                Assert.assertTrue(data.isDisplayed());
//
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//
//            try {
//                Assert.assertEquals(data.getText(),value);
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//
//            }
//
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//
//
//    }

//    //public static void myMethod(){
//        System.out.printf("Hello aloosh");
//    }