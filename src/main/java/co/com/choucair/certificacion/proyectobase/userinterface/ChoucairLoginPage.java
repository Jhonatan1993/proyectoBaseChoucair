package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject{
    public static final Target LOGIN_BUTTON = Target.the("Dar click para mostrar el formulario de login")
            .located(By.xpath("//*[@id=\"nav-menu\"]/ul[2]/li/a"));
    public static final Target INPUT_USER = Target.the("Ingresar el nombre de usuario")
            .located(By.xpath("//input[@id=\"username\"]"));
    public static final  Target INPUT_PASSWORD = Target.the("Ingresar la contraseña")
            .located(By.xpath("//input[@id=\"password\"]"));
    public static final Target ACCESS_BUTTON = Target.the("Dar click para ingresar a la pagina")
            .located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[3]/button"));


}
