package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Configuration {

    private WebDriver driver;

    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bande\\OneDrive\\Área de Trabalho\\temp\\chromedriver.exe");
        driver =  new ChromeDriver();
        driver.get("https://www.google.com.br");
        driver.manage().window().maximize();
        return driver;
    }

    public void tearDown(){
        driver.quit();
    }
}
