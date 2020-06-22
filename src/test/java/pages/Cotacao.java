package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import repositorio.Repositorio;

public class Cotacao extends Repositorio {


    private WebDriver driver;

    public Cotacao(WebDriver driver){
        this.driver = driver;
    }

    public Cotacao preencheCampo(String pesquisa){
        driver.findElement(campoPesquisa).sendKeys(pesquisa);
        driver.findElement(campoPesquisa).sendKeys(Keys.RETURN);
        return(this);
    }

    public void pegaValor(){
        String param = driver.findElement(valor).getText();
        System.out.println("--------Valor da moeda------------");
        System.out.println("$ " + param);
    }
}
