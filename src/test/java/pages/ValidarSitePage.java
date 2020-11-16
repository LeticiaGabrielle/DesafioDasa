package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ValidarSitePage {
    public WebDriver driver;

    public ValidarSitePage(WebDriver driver) {
        this.driver = driver;
    }

    public ValidarSitePage validoODirecionamentoCorretoParaOSiteDoDelboniAuriemo() {
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        WebElement imagem = driver.findElement(By.xpath("//*[@id=\"header-pacientes\"]/img"));
        Assert.assertTrue(imagem.isDisplayed());

        System.out.println("\n\nValidação da página Delboni Auriemo com sucesso.\n\n");
        return this;
    }
}
