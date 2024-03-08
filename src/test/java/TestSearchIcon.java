import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearchIcon {

    @Test
    public void searchItem()
    {
        //Arrange
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://web-playground.ultralesson.com/");

        //Act
        driver.findElement(By.xpath("//summary[@aria-label='Search']//span//*[name()='svg']")).click();
        driver.findElement(By.xpath("//input[@id='Search-In-Modal']")).sendKeys("jeans");

        //Assert
        List<WebElement> itemList = driver.findElements(By.xpath("//ul[@id='predictive-search-results-list']/li"));
        Assert.assertEquals(itemList.size(), 5, "The list does not contain 4 items");


    }

}
