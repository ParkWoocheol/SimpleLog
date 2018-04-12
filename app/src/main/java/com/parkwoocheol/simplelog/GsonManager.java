package com.parkwoocheol.simplelog;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonManager {

    private Gson gson;

    private GsonManager(){
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    private static class GsonManagerHolder{
        private static final GsonManager instance = new GsonManager();
    }

    public static GsonManager getInstance(){
        return GsonManagerHolder.instance;
    }

    public Gson getGson(){
        return gson;
    }

    public String toJson(Object object){
        return gson.toJson(object);
    }

}
