package Ejecuciones;

import Recursos.Navegador.Pag_Navegador;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BusquedaGoogle {
    WebDriver driver;


    @Before
            public void PreEjecucion(){
        //Realizamos una instancia para que nuestro metodo pueda accesder a la clase Pag_Navegador
        Pag_Navegador pag_navegador = new Pag_Navegador(driver);
       driver = pag_navegador.AbrirNavegador();
    }

    @After
        public void PostEjecucion(){
        driver.close();
    }

    @Test
    public void realizarConsultaGoogle() {

    }
}
