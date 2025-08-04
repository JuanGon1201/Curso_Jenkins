package co.com.AutoServicesRest.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModelCreateOfUpdateUser {

    String name;
    String job;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }


    public static List<ModelCreateOfUpdateUser> setData(DataTable table){
        List<ModelCreateOfUpdateUser> data = new ArrayList<>();
        List<Map<String, String>> mapList = table.asMaps();
        for (Map<String, String> map : mapList) {
            data.add(new ObjectMapper().convertValue(map, ModelCreateOfUpdateUser.class));
        }
        return data;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":" + '\"' + name + '\"' +
                ", \"job\":" + '\"' + job + '\"' +
                '}';
    }
}
