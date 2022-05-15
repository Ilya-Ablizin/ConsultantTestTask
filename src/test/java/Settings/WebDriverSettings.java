package Settings;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    WebDriver chromeDriver;
    @BeforeEach
    public void installSettings(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\iablizinwork\\Documents\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
    }
}
