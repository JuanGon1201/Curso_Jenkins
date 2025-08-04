package co.com.AutoServicesRest.tasks;

import co.com.AutoServicesRest.interactions.ConsumeService;
import co.com.AutoServicesRest.models.ModelCreateOfUpdateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class UpdateUserApiPatch implements Task {

    ModelCreateOfUpdateUser modelCreateOfUpdateUser;

    public UpdateUserApiPatch(ModelCreateOfUpdateUser modelCreateOfUpdateUser) {
        this.modelCreateOfUpdateUser = modelCreateOfUpdateUser;
    }
    public static UpdateUserApiPatch with(ModelCreateOfUpdateUser modelCreateOfUpdateUserRests) {
        return Tasks.instrumented(UpdateUserApiPatch.class, modelCreateOfUpdateUserRests);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPatch(modelCreateOfUpdateUser.toString()));
    }

}
