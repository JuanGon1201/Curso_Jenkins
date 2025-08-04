package co.com.AutoServicesRest.tasks;

import co.com.AutoServicesRest.interactions.ConsumeService;
import co.com.AutoServicesRest.models.ModelCreateOfUpdateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UpdateUserApiPut implements Task {

    ModelCreateOfUpdateUser modelCreateOfUpdateUser;

    public UpdateUserApiPut(ModelCreateOfUpdateUser modelCreateOfUpdateUser) {
        this.modelCreateOfUpdateUser = modelCreateOfUpdateUser;
    }
    public static UpdateUserApiPut with(ModelCreateOfUpdateUser modelCreateOfUpdateUserRests) {
        return Tasks.instrumented(UpdateUserApiPut.class, modelCreateOfUpdateUserRests);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPut(modelCreateOfUpdateUser.toString()));
    }

}
