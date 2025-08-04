package co.com.AutoServicesRest.utils.enums;

public enum RestService {

    BASE_URL("https://reqres.in"),
    CREATE_USER("/api/users"),
    LIST_USER("/api/users"),
    MODIF_USER("/api/users/2"),
    DELETE_USER("/api/users/2");

    private String uri;
    RestService(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }
}
