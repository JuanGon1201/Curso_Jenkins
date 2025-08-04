package co.com.AutoServicesRest.tasks;

import co.com.AutoServicesRest.interactions.ConsumeService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ListUserApi implements Task {

    public ListUserApi() {

    }

    public static ListUserApi with() {
        return Tasks.instrumented(ListUserApi.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withGet());
    }

}
