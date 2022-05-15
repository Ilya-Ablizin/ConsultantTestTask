import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConsultantTest extends WebDriverSettings {
    @Test
    public void firstTest(){
        chromeDriver.get("http://www.consultant.ru/cons/");
        WebElement searchPlus = chromeDriver.findElement(By.xpath("//a[@menu='searchPlus']"));
        searchPlus.click();
    }

//
//    driver ("http://www.consultant.ru/cons/");
//
//    WebElement searchPlus = driver.findElement(By.xpath("//a[@menu='searchPlus']"));
//        searchPlus.click();
//
//    WebElement dictFilter = driver.findElement(By.xpath("//input[@name='dictFilter']"));
//        dictFilter.sendKeys("Налоговый часть");
//
//    WebElement runSearchFlat = driver.findElement(By.xpath("//button[@class='runsearch flat']"));
//        runSearchFlat.click();
//
//    List<WebElement> searchResults= driver.findElements(By.xpath("//a[@class='search-results__link']"));
}
