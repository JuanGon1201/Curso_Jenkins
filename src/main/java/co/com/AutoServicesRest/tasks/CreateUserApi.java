package co.com.AutoServicesRest.tasks;

import co.com.AutoServicesRest.interactions.ConsumeService;
import co.com.AutoServicesRest.models.ModelCreateOfUpdateUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CreateUserApi implements Task {

    ModelCreateOfUpdateUser modelCreateOfUpdateUser;

    public CreateUserApi(ModelCreateOfUpdateUser modelCreateOfUpdateUser) {
        this.modelCreateOfUpdateUser = modelCreateOfUpdateUser;
    }
    public static CreateUserApi with(ModelCreateOfUpdateUser modelCreateOfUpdateUserRests) {
        return Tasks.instrumented(CreateUserApi.class, modelCreateOfUpdateUserRests);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPost(modelCreateOfUpdateUser.toString()));
    }

}
