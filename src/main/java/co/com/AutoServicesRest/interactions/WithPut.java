package co.com.AutoServicesRest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Put;

import static co.com.AutoServicesRest.utils.enums.RestService.MODIF_USER;

public class WithPut implements Interaction {

    private String body;

    public WithPut(String body) {
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Put.to(MODIF_USER.toString())
                .with(requestSpecification -> requestSpecification
                        .headers("Content-Type", "application/json")
                        .header("x-api-key", "reqres-free-v1")
                        .body(body)));
    }
}
