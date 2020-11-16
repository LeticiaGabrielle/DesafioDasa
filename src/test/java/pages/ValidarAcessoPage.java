package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidarAcessoPage {
    private WebDriver driver;

    public ValidarAcessoPage(WebDriver driver) {
        this.driver = driver;
    }

    public LinkPage validoMeuAcessoNaÁreaDoLaboratório() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[1]/div/div[2]/div/h2"));
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[1]/div/div[2]/div/h2")).getText(), "Delboni Auriemo");
        System.out.println("\n\nAcesso a área do laboratório Delboni Auriemo com sucesso.");

        return new LinkPage(driver);
    }
}

