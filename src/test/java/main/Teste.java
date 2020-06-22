package main;

import pages.Cotacao;
import config.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Teste extends Configuration{

    private WebDriver driver;
    private Cotacao inicial;


    @Before
    public void inicio(){
        driver = getDriver();
        inicial = new Cotacao(driver);

    }

    @Test
    public void pesquisaValorDolar(){
        inicial.preencheCampo("Dólar").pegaValor();

    }

    @Test
    public void pesquisaValorEuro(){
        inicial.preencheCampo("Euro").pegaValor();
    }

    @After
    public void finaliza(){
        tearDown();
    }
}
