package co.com.choucair.certificacion.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Buscar implements Task {

    private co.com.choucair.certificacion.proyectobase.userinterface.ChoucairAcademyPage ChoucairAcademyPage;

    public static Buscar academiaChoucair() {
        return Tasks.instrumented(Buscar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(ChoucairAcademyPage));
    }
}
