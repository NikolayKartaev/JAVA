package JAVA.Seminars.OOP.Seminar4.presenter;

import java.security.Provider.Service;

import JAVA.Seminars.OOP.Seminar4.model.Weather_model;
import JAVA.Seminars.OOP.Seminar4.ui.View;



public class Presenter {

    private View view;
    private Service service;

    
    public Presenter(View view) {
        this.view = view;
        service = new Weather_model();
    }


    public void getInfo (String city) {

    }
}
