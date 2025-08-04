package co.com.AutoServicesRest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static co.com.AutoServicesRest.utils.enums.RestService.DELETE_USER;

public class WithDelete implements Interaction {

    public WithDelete() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from(DELETE_USER.toString())
                .with(requestSpecification -> requestSpecification
                        .headers("Content-Type", "application/json")
                        .header("x-api-key", "reqres-free-v1")
                ));
    }
}
