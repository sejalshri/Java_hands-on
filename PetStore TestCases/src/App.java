import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","E:\\Downloads\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/");
        driver.findElement(By.linkText("Enter the Store")).click();
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("username")).sendKeys("j2ee");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("j2ee");
        driver.findElement(By.name("signon")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
        driver.close();
    }
}
