package Recursos.Navegador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Pag_Navegador {
    public Pag_Navegador(WebDriver _driver) {
        driver = _driver;
    }
    WebDriver driver;
    public WebDriver AbrirNavegador() {
        //Damos la ubicacion de donde se encuentra nuestro driver
        System.setProperty("webdriver,chrome.driver","C://driver//chrome");
        //Condiciones que nosotros queremos al momento en que se ejecute nuestro navegador
        //Si lo queremos incognito - también agregarle un plugin - que el navegador abra a pantalla completa
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        //Instanciamos el chrome driver para que podamos ejecutar nuestro navegador
        driver = new ChromeDriver(options);
        //Ruta a la cual queremos acceder por medio del chrome driver
        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.11.0");
        //Tiempo implicito en el cual nuestro navegador espera hasta que todos los elementos esten
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.MINUTES);
        return driver;
    }
}
