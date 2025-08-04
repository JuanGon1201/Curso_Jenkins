package co.com.AutoServicesRest.interactions;

import net.serenitybdd.screenplay.Tasks;

public class ConsumeService  {

    private ConsumeService() {

    }

    public static WithPost withPost(String body){
        return Tasks.instrumented(WithPost.class, body);
    }

    public static WithGet withGet(){
        return Tasks.instrumented(WithGet.class);
    }

    public static WithPut withPut(String body){
        return Tasks.instrumented(WithPut.class, body);
    }

    public static WithPatch withPatch(String body){
        return Tasks.instrumented(WithPatch.class, body);
    }

    public static WithDelete withDelete(){
        return Tasks.instrumented(WithDelete.class);
    }
}
