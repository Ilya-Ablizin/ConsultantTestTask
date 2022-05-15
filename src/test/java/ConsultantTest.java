import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConsultantTest extends WebDriverSettings {
    @Test
    public void firstTest() {
//        Step 1, 2 - Go to URL and Click to Button
        chromeDriver.get("http://www.consultant.ru/cons/");
        chromeDriver.findElement(By.xpath("//a[@menu='searchPlus']")).click();
//        Step 3 - Enter value
        WebElement dictFilter = chromeDriver.findElement(By.xpath("//input[@name='dictFilter']"));
        dictFilter.sendKeys("Налоговый часть");
//        Step 4 - Enter value
        chromeDriver.findElement(By.xpath("//button[@class='runsearch flat']")).click();
//        Step 4 A
        WebElement searchResults = chromeDriver.findElement(By.xpath("/html/body/div[4]/div[4]/div[2]/div[2]/div/a[2]/div/div[2]"));
        String fullNameText = searchResults.getText();
        Assertions.assertTrue(
                fullNameText.contains("\"Налоговый кодекс Российской Федерации (часть вторая)\" от 05.08.2000 N 117-ФЗ\n" + "(ред. от 01.05.2022) (с изм. и доп., вступ. в силу с 16.05.2022)"));
        searchResults.click();
        ArrayList<String> newTab = new ArrayList<>(chromeDriver.getWindowHandles());
        chromeDriver.switchTo().window(newTab.get(1));
        System.out.println(newTab.get(1));
        System.out.println(newTab);

//        WebElement documentTitle = chromeDriver.findElement(By.xpath("//div[@data-title='\"Налоговый кодекс Российской Федерации (часть вторая)\" от 05.08.2000 N 117-ФЗ<br>(ред. от 01.05.2022)<br>(с изм. и доп., вступ. в силу с 16.05.2022)<br><br>ИБ: Законодательство / Российское законодательство (Версия Проф)']"));
//        String documentTitleText = documentTitle.getText();
//        System.out.println(documentTitleText);
//        Assertions.assertTrue(
//                fullNameText.equals(documentTitleText)
//        );

//        Step 4 B


    }
}
