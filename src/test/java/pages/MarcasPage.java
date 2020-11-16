package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarcasPage {
    private WebDriver driver;

    public MarcasPage(WebDriver driver) {
        this.driver = driver;
    }

    public SelecionarPage listoNoConsoleTodosOsLaboratóriosDeSãoPaulo() {

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,1600)");

        WebElement alta = driver.findElement(By.xpath("//img[@alt=\"Alta Diagnósticos\"]"));
        Assert.assertTrue(alta.isDisplayed());
        System.out.println("\nLista Laboratórios de São Paulo:\n\nAlta Diagnósticos");

        WebElement delboni = driver.findElement(By.xpath("//img[@alt=\"Delboni Auriemo\"]"));
        Assert.assertTrue(delboni.isDisplayed());
        System.out.println("Delboni Auriemo");

        WebElement labsim = driver.findElement(By.xpath("//img[@alt=\"Labsim\"]"));
        Assert.assertTrue(labsim.isDisplayed());
        System.out.println("Labsim");

        WebElement cytolab = driver.findElement(By.xpath("//img[@alt=\"Cytolab\"]"));
        Assert.assertTrue(cytolab.isDisplayed());
        System.out.println("Cytolab");

        WebElement vital = driver.findElement(By.xpath("//img[@alt=\"Laboratório Médico Vital Brasil\"]"));
        Assert.assertTrue(vital.isDisplayed());
        System.out.println("Laboratório Médico Vital Brasil");

        WebElement zoppi = driver.findElement(By.xpath("//img[@alt=\"Salomão Zoppi Diagnósticos\"]"));
        Assert.assertTrue(zoppi.isDisplayed());
        System.out.println("Salomão Zoppi Diagnósticos");

        WebElement oswaldo = driver.findElement(By.xpath("//img[@alt=\"Laboratório Oswaldo Cruz\"]"));
        Assert.assertTrue(oswaldo.isDisplayed());
        System.out.println("Laboratório Oswaldo Cruz");

        WebElement lavoisier = driver.findElement(By.xpath("//img[@alt=\"Lavoisier Laboratório e Imagem\"]"));
        Assert.assertTrue(lavoisier.isDisplayed());
        System.out.println("Lavoisier Laboratório e Imagem");

        WebElement deliberato = driver.findElement(By.xpath("//img[@alt=\"Deliberato Análises Clínicas\"]"));
        Assert.assertTrue(deliberato.isDisplayed());
        System.out.println("Deliberato Análises Clínicas");

        WebElement previlab = driver.findElement(By.xpath("//img[@alt=\"Previlab\"]"));
        Assert.assertTrue(previlab.isDisplayed());
        System.out.println("Previlab");

        WebElement valeclin = driver.findElement(By.xpath("//img[@alt=\"ValeClin\"]"));
        Assert.assertTrue(valeclin.isDisplayed());
        System.out.println("ValeClin");

        WebElement ribeirão = driver.findElement(By.xpath("//img[@alt=\"Padrão Ribeirão\"]"));
        Assert.assertTrue(ribeirão.isDisplayed());
        System.out.println("Padrão Ribeirão\n\n");


        return new SelecionarPage(driver);

    }
}
