package co.com.choucair.certificacion.proyectobase.tasks;

import co.com.choucair.certificacion.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarCurso implements Task{

    private final String strCourse;

    public BuscarCurso(String strCourse) {
        this.strCourse = strCourse;
    }

    public static BuscarCurso the(String strCourse) {
        return Tasks.instrumented(BuscarCurso.class, strCourse);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(SearchCoursePage.COURSES_AND_CERTIFICATIONS),
                Enter.theValue(strCourse).into(SearchCoursePage.INPUT_SEARCH),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_NAME));

    }
}
