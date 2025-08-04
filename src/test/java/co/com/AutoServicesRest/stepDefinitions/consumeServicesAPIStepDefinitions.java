package co.com.AutoServicesRest.stepDefinitions;

import co.com.AutoServicesRest.models.ModelCreateOfUpdateUser;
import co.com.AutoServicesRest.questions.LastResponseStatusCode;
import co.com.AutoServicesRest.tasks.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.AutoServicesRest.utils.constant.*;
import static co.com.AutoServicesRest.utils.enums.RestService.BASE_URL;
import static co.com.AutoServicesRest.utils.globalData.ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class consumeServicesAPIStepDefinitions {

    @Given("el user obtiene la base url")
    public void el_user_obtiene_la_base_url() {
        theActorCalled(ACTOR).whoCan(CallAnApi.at(BASE_URL.toString()));
    }

    // Consumo metodo post
    @When("Se envia los datos sobre el cuerpo de la peticion")
    public void se_envia_los_datos_sobre_el_cuerpo_de_la_peticion(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                CreateUserApi.with(ModelCreateOfUpdateUser.setData(dataTable).get(0))
        );
    }
    @Then("Se realiza la creacion del usuario")
    public void se_realiza_la_creacion_del_usuario() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE_CREATE)));
    }

    // Consumo metodo get
    @When("Se envia la peticion al metodo Get single user")
    public void se_envia_la_peticion_al_metodo_get_single_user() {
        theActorInTheSpotlight().attemptsTo(ListUserApi.with());
    }
    @Then("Se enlistan los usuarios registrados")
    public void se_enlistan_los_usuarios_registrados() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE_OK)));
    }

    // Consumo metodo PUT
    @When("Se envia los datos sobre el cuerpo de la peticion al metodo PUT")
    public void se_envia_los_datos_sobre_el_cuerpo_de_la_peticion_al_metodo_put(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                UpdateUserApiPut.with(ModelCreateOfUpdateUser.setData(dataTable).get(0))
        );
    }
    @Then("Se realiza la actualizacion del usuario a traves del metodo PUT")
    public void se_realiza_la_actualizacion_del_usuario_a_traves_del_metodo_put() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE_OK)));
    }

    // consumo metedo PACTH
    @When("Se envia los datos sobre el cuerpo de la peticion al metodo PACTH")
    public void se_envia_los_datos_sobre_el_cuerpo_de_la_peticion_al_metodo_pacth(DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                UpdateUserApiPatch.with(ModelCreateOfUpdateUser.setData(dataTable).get(0))
        );
    }

    @Then("Se realiza la actualizacion del usuario a traves del metodo PACTH")
    public void se_realiza_la_actualizacion_del_usuario_a_traves_del_metodo_pacth() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE_OK)));
    }

    //Consumo metodo delete
    @When("Se envia la peticion al metodo delete single user")
    public void se_envia_la_peticion_al_metodo_delete_single_user() {
        theActorInTheSpotlight().attemptsTo(DeleteUserApi.with());
    }
    @Then("Se realiza la eliminacion del usuario")
    public void se_realiza_la_eliminacion_del_usuario() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE_NOCONTENT)));
    }

}
