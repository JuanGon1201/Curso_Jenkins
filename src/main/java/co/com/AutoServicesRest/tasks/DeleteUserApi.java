package co.com.AutoServicesRest.tasks;

import co.com.AutoServicesRest.interactions.ConsumeService;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DeleteUserApi implements Task {

    public DeleteUserApi() {

    }

    public static DeleteUserApi with() {
        return Tasks.instrumented(DeleteUserApi.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withDelete());
    }

}
