package co.com.AutoServicesRest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;


import static co.com.AutoServicesRest.utils.enums.RestService.LIST_USER;

public class WithGet implements Interaction {

    public WithGet() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(LIST_USER.toString())
                .with(requestSpecification -> requestSpecification
                        .headers("Content-Type", "application/json")
                        .header("x-api-key", "reqres-free-v1")
        ));
    }
}
