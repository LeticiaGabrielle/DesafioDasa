package steps;

import pages.*;
import config.AcessarSite;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class DesafioDasaSteps {

    public static WebDriver driver;

    @Dado("^Que acesso o site institucional da Dasa$")
    public void queAcessoOSiteInstitucionalDaDasa() {
        AcessarSite acessarSite = new AcessarSite();
        // para utilizar o navegador chrome usar "chrome"
        // para utilizar o navegador mozila firefox usar "firefox"
        driver = acessarSite.queAcessoOSiteInstitucionalDaDasa("chrome");
    }

    @E("^Clico no link Nossas Marcas$")
    public void clicoNoLinkNossasMarcas() {
        DasaPage dasaPage = new DasaPage(driver);
        dasaPage.clicoNoLinkNossasMarcas();
    }

    @E("^Listo no console todos os laboratórios de São Paulo$")
    public void listoNoConsoleTodosOsLaboratóriosDeSãoPaulo() {
        MarcasPage marcasPage = new MarcasPage(driver);
        marcasPage.listoNoConsoleTodosOsLaboratóriosDeSãoPaulo();
    }

    @Quando("^Seleciono o laboratório Delboni Auriemo$")
    public void selecionoOLaboratórioDelboniAuriemo() {
        SelecionarPage selecionarPage = new SelecionarPage(driver);
        selecionarPage.selecionoOLaboratórioDelboniAuriemo();
    }

    @E("^valido meu acesso na área do laboratório$")
    public void validoMeuAcessoNaÁreaDoLaboratório() {
        ValidarAcessoPage validarAcessoPage = new ValidarAcessoPage(driver);
        validarAcessoPage.validoMeuAcessoNaÁreaDoLaboratório();
    }

    @E("^clico no link com nome da marca$")
    public void clicoNoLinkComNomeDaMarca() {
        LinkPage linkPage = new LinkPage(driver);
        linkPage.clicoNoLinkComNomeDaMarca();
    }

    @Então("^valido o direcionamento correto para o site do Delboni Auriemo\\.$")
    public void validoODirecionamentoCorretoParaOSiteDoDelboniAuriemo() {
        ValidarSitePage validarSitePage = new ValidarSitePage(driver);
        validarSitePage.validoODirecionamentoCorretoParaOSiteDoDelboniAuriemo();
    }
}