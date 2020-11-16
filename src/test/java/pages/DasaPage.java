package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DasaPage {

    public WebDriver driver;

    public DasaPage(WebDriver driver) {
        this.driver = driver;
    }

    public MarcasPage clicoNoLinkNossasMarcas() {
        driver.findElement(By.linkText("Nossas Marcas")).click();
        return new MarcasPage(driver);
    }
}


