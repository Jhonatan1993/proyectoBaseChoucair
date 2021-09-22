package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject{
    public static final Target COURSES_AND_CERTIFICATIONS = Target.the("Ingresa a la vista de cursos y certificaciones")
            .located(By.xpath("//div[@id='certificaciones']/div[1]/a"));
    public static final Target INPUT_SEARCH = Target.the("Campo de busqueda donde se ingresa el nombre del curso")
            .located(By.xpath("//input[@id='coursesearchbox']"));
    public static final Target BUTTON_GO = Target.the("Dar click para buscar el curso")
            .located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/button"));
    public static final Target SELECT_NAME = Target.the("Dar click en el nombre del curso")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target VERIFY_NAME = Target.the("Extrae el nombre del curso a verificar")
            .located(By.xpath("//*[@id='page-header']/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
}
