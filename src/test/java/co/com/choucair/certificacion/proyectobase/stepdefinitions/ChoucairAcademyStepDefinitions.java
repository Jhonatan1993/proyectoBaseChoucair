package co.com.choucair.certificacion.proyectobase.stepdefinitions;

import co.com.choucair.certificacion.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certificacion.proyectobase.questions.Answer;
import co.com.choucair.certificacion.proyectobase.tasks.Buscar;
import co.com.choucair.certificacion.proyectobase.tasks.BuscarCurso;
import co.com.choucair.certificacion.proyectobase.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.GivenWhenThen;
import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que Jhonatan quiere ingresar a choucair academy$")
    public void queJhonatanQuiereIngresarAChoucairAcademy(List<AcademyChoucairData> AcademyChoucairData) {
        OnStage.theActorCalled("Jhonatan").wasAbleTo(Buscar.academiaChoucair(),
                (Login.onThePage(AcademyChoucairData.get(0).getStrUser(),AcademyChoucairData.get(0).getStrPassword())));
    }

    @Cuando("^el busca un el curso de en la academia choucair$")
    public void elIngresaALaPlataformaDeLaAcademiaChoucair(List<AcademyChoucairData> AcademyChoucairData) {
            OnStage.theActorInTheSpotlight().attemptsTo(BuscarCurso.the(AcademyChoucairData.get(0).getStrCourse()));
        }

    @Entonces("^el encontrara el curso llamado$")
    public void elEncontraraElCursoLlamado(List<AcademyChoucairData> AcademyChoucairData)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(AcademyChoucairData.get(0).getStrCourse())));
    }

}
