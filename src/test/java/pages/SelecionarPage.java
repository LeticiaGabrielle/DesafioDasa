package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelecionarPage {
    public WebDriver driver;

    public SelecionarPage(WebDriver driver) {
        this.driver = driver;
    }

    public ValidarAcessoPage selecionoOLaboratórioDelboniAuriemo() {
        driver.findElement(By.xpath("//img[@alt=\"Delboni Auriemo\"]")).click();

        return new ValidarAcessoPage(driver);

    }

}
