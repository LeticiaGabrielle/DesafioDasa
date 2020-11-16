package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkPage {
    public WebDriver driver;

    public LinkPage(WebDriver driver) {
        this.driver = driver;
    }

    public ValidarSitePage clicoNoLinkComNomeDaMarca() {
        driver.findElement(By.linkText("Delboni Auriemo")).click();

        return new ValidarSitePage(driver);
    }

}