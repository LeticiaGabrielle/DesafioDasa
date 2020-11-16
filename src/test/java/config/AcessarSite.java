package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AcessarSite {

    public static WebDriver queAcessoOSiteInstitucionalDaDasa(String navegador) {
        switch (navegador) {
            case "chrome":
                return queAcessoOSiteInstitucionalDaDasaChrome();
            case "firefox":
                return queAcessoOSiteInstitucionalDaDasaFirefox();
            default:
                return queAcessoOSiteInstitucionalDaDasaChrome();
        }
    }

    private static WebDriver queAcessoOSiteInstitucionalDaDasaFirefox() {

        WebDriver firefox = new FirefoxDriver();
        firefox.get("https://dasa.com.br/");
        firefox.manage().window().maximize();
        firefox.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return firefox;

    }

    private static WebDriver queAcessoOSiteInstitucionalDaDasaChrome() {
        WebDriver chrome = new ChromeDriver();
        System.setProperty("webdriver.chrome.chrome", "chromedriver.exe");
        chrome.get("https://dasa.com.br/");
        chrome.manage().window().maximize();
        chrome.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return chrome;
    }
}



