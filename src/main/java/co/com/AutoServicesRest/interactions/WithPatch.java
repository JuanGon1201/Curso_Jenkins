package co.com.AutoServicesRest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Patch;

import static co.com.AutoServicesRest.utils.enums.RestService.MODIF_USER;

public class WithPatch implements Interaction {

    private String body;

    public WithPatch(String body) {
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Patch.to(MODIF_USER.toString())
                .with(requestSpecification -> requestSpecification
                        .headers("Content-Type", "application/json")
                        .header("x-api-key", "reqres-free-v1")
                        .body(body)));
    }
}
